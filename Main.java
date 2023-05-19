import java.util.Scanner;

public class Main {
    static Scanner Input = new Scanner(System.in);

    public static void main(String[] args) {

        User Usuario = new User();
        User.setNomeUsurio("Gustavo");
        System.out.println("Digite sua senha.");
        User.setSenha(Input.nextLine());
        //System.out.println(User.getSenha()); // Testar O Getter da senha. Não é Necessario no codigo

        if (User.getSenha().equals(Usuario.senhacorreta)){
            System.out.println("Usuario "+User.getNomeUsurio()+" autorizado. ");
        }else{
            System.out.println("Falha em autenticar.");
        }


    }
}