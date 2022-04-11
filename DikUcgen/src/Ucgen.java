import java.util.Scanner;

public class Ucgen {
    public static void main(String[] args) {
        double kisa,uzun,hip;

        Scanner inp = new Scanner(System.in);
        System.out.print("Kisa Kenari Giriniz: ");
        kisa  = inp.nextDouble();
        System.out.print("Uzun Kenari Giriniz: ");
        uzun   = inp.nextDouble();
        hip = Math.sqrt(kisa*kisa+uzun*uzun);
        System.out.print("Hipotenus: "+ hip  );




    }
}
