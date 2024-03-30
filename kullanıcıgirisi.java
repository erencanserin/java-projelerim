import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String userName, password;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı adınız: ");
        userName = inp.nextLine();

        System.out.print("Şifreniz: ");
        password = inp.nextLine();

        if (userName.equals("erencan") && password.equals("123456")) {
            System.out.println("Giriş başarılı!");
        } else {
            System.out.println("Kullanıcı adı veya şifre hatalı!");
        }
    }
}
