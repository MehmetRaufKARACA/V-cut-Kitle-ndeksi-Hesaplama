import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        //Değerleri tanımla
        double boy,kilo,endeks;
        
        // Scanner sınıfını tanımla
        Scanner inp = new Scanner(System.in).useLocale(Locale.FRANCE);

        // Kullanıcıdan boy ve kilo değerlerini al
        System.out.print("Lütfen boyunuzu giriniz : ");
        boy = inp.nextInt();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = inp.nextInt();

        // Vücut kitle endeksini hesapla ve ekrana yazdır
        endeks = kilo / (boy * boy);
        System.out.print("Vücut kitle endeksiniz : " + endeks);
    }
}