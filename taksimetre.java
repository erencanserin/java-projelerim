import  java.util.Scanner;

public class main {
public static void main(String[] args) {
    
int km;
double kmdebir = 2.20;
double toplam;
double baslangicUcreti =10;

Scanner input = new Scanner(System.in);
System.out.print("gidilen km'yi giriniz");
km = input.nextInt();

toplam = (km*kmdebir);
toplam += baslangicUcreti;

System.out.print("Ucret"+toplam);

}
    
}