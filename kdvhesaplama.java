import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    
double tutar ,kdvorani =0.18, kdvtutar ,kdvlitutar;

Scanner input =new Scanner(System.in);
System.out.print("ucret tutarini giriniz =");
tutar = input.nextDouble();

kdvtutar = tutar * kdvorani;
kdvlitutar = tutar + kdvtutar;

System.out.println("KDVsiz tutar"+ tutar);
System.out.println("KDV orani"+ kdvorani);
System.out.println("KDV tutar"+ kdvtutar);
System.out.println("KDVli tutar"+ kdvlitutar);
}
}
