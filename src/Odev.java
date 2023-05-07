import java.util.Scanner;


public class Odev{
    public static void main(String[] args) {
        double tutar,kdvTutar,kdvliTutar, kdvOrani ;
        Scanner input = new Scanner(System.in);

        System.out.print("Lutfen tutar giriniz :  " );
        tutar = input.nextDouble();

        kdvOrani = tutar<1000 ? 0.18 : 0.08 ;
        kdvTutar = kdvOrani*tutar;
        kdvliTutar = tutar+kdvTutar;

        System.out.println("Kdv'siz tutar " + tutar);
        System.out.println("Kdv Orani " + kdvOrani);
        System.out.println("Kdv Tutari " + kdvTutar);
        System.out.print("Kdv'li Tutar " + kdvliTutar);

    }
}
