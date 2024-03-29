import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sayi1, sayi2, sonuc;
        char islem;

        System.out.println("İlk sayıyı giriniz: ");
        sayi1 = scanner.nextInt();

        System.out.println("İkinci sayıyı giriniz: ");
        sayi2 = scanner.nextInt();

        System.out.println("İşlemi seçiniz (+, -, *, /): ");
        islem = scanner.next().charAt(0);

        scanner.close();

        switch (islem) {
            case '+':
                sonuc = sayi1 + sayi2;
                break;
            case '-':
                sonuc = sayi1 - sayi2;
                break;
            case '*':
                sonuc = sayi1 * sayi2;
                break;
            case '/':
                sonuc = sayi1 / sayi2;
                break;
            default:
                System.out.println("Geçersiz işlem!");
                return;
        }

        System.out.println("Sonuç: " + sonuc);
    }
}