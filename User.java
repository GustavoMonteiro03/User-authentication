public class User {
    private static String nomeUsurio;
    private static String senha;
    protected String senhacorreta;

    public User() {
        senhacorreta = "Senha123";
    }


    public static String getNomeUsurio() {
        return nomeUsurio;
    }

    public static void setNomeUsurio(String nomeUsurio) {
        User.nomeUsurio = nomeUsurio;
    }

    public static String getSenha() {
        return senha;
    }

    public static void setSenha(String senha) {
        User.senha = senha;
    }


}
