import java.util.Scanner;

public class Kdv {
    public static void main(String[] args) {
        double kdv;
        double fiyat;
        double kdvTutari;
        double toplamTutar;
        Scanner inp = new Scanner(System.in);
        System.out.println("Fiyat :");
        fiyat = inp.nextInt();

        if(fiyat > 0 && fiyat < 1000) {
            kdv = 0.18;
            kdvTutari = fiyat * kdv;
            toplamTutar = kdvTutari + fiyat;
            System.out.println("toplam tutar" + toplamTutar);
        }
        else {
            kdv = 0.08;
            kdvTutari = fiyat * kdv;
            toplamTutar = kdvTutari + fiyat;
            System.out.println("toplam tutar" + toplamTutar);
        }

    }
}
