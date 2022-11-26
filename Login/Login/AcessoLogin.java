package Login;
    
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AcessoLogin /*implements IAcessoLogin*/{
    private static File loginsFile;
    private static AcessoLogin acessoLogin;
    
    private AcessoLogin(){
        AcessoLogin.loginsFile = new File("Logins.txt");
        if(!loginsFile.exists()){
            try {
                loginsFile.createNewFile();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    // @Override
    public static synchronized AcessoLogin getAcessoLogin(){
        if(acessoLogin == null){
            acessoLogin = new AcessoLogin();
        }
        return acessoLogin;
    }

    // @Override
    public synchronized boolean cadastrarLogin(String login, String senha) throws IOException{
        FileReader fr = new FileReader(AcessoLogin.loginsFile);
        BufferedReader br = new BufferedReader(fr);
        while(br.ready()){
            String linha = br.readLine();
            if(linha.split(":")[0] == login){
                fr.close();
                br.close();
                return false;
            }
        }
        FileWriter fw = new FileWriter(loginsFile, true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(login+":"+senha);
        bw.newLine();
        fr.close();
        br.close();
        fw.close();
        bw.close();
        return true;
    }

    // @Override
    public synchronized boolean fazerLogin(String login, String senha) throws IOException{
        FileReader fr = new FileReader(AcessoLogin.loginsFile);
        BufferedReader br = new BufferedReader(fr);
        while(br.ready()){
            String linha = br.readLine();
            if(linha.split(":")[0] == login && linha.split(":")[1] == senha){
                fr.close();
                br.close();
                return true;
            }
        }
        fr.close();
        br.close();
        return false;
    }
}
