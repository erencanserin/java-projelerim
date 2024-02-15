import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;
        Scanner a = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat = a.nextInt();
        System.out.println();

        System.out.print("Fizik notunuz: ");
        fizik = a.nextInt();
        System.out.println();

        System.out.print("Kimya notunuz: ");
        kimya = a.nextInt();
        System.out.println();

        System.out.print("Türkçe notunuz: ");
        turkce = a.nextInt();
        System.out.println();

        System.out.print("Tarih notunuz: ");
        tarih = a.nextInt();
        System.out.println();

        System.out.print("Müzik notunuz: ");
        muzik = a.nextInt();
        System.out.println();

        int toplam = (mat+fizik+tarih+turkce+muzik+kimya);
        float sonuc = toplam / 6;
        System.out.println(sonuc);
    }
}