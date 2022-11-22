package Login;

public class Login {
    private static Login unicoLogin;
    private String usuario;
    private String senha;
    private boolean estaLogado = false;

    private Login() {}

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

    public boolean verificaLogin() {
        return estaLogado;
    }

    public void setLogged(boolean estaLogado) {
        this.estaLogado = estaLogado;
    }

    
}
