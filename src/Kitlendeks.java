import java.util.Scanner;


public class Kitlendeks {
    public static void main(String[] args) {
        double a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        a = input.nextDouble();
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen kilonuzu (kg) giriniz : ");
        b = inp.nextDouble();
        c=b/(a*a);
        System.out.print("Vücut Kitle İndeksiniz : "+c);

    }
}
