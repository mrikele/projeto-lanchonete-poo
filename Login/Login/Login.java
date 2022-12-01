package Login;

import java.io.IOException;

public class Login {
    private static Login unicoLogin;
    private String usuario;
    private String senha;
    private boolean estaLogado = false;
    private static AcessoLogin acessoLogin;

    private Login() {
        acessoLogin = AcessoLogin.getInstance();
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean getLogin() {
        return estaLogado;
    }

    public void setLogin(boolean estaLogado) {
        this.estaLogado = estaLogado;
    }

    public static synchronized Login getInstancia() { // apenas um login/ unica instancia de login
        if (unicoLogin == null) {
            unicoLogin = new Login();
        }

        return unicoLogin;
    }

    public boolean cadastrar(String login, String senha) throws IOException{
        return acessoLogin.cadastrarLogin(login, senha);
    }

    public boolean logar(String login, String senha) throws IOException{
        return acessoLogin.fazerLogin(login, senha);
    }
}