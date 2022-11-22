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
}
