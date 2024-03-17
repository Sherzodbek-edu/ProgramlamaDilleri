
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    
	    /*Kod 1: Kullanıcıdan girdiği sayıya kadar olan tek sayiları yazdıran kod*/
        System.out.println("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();
        int i = 1;
        do {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= sayi);
        
        /**************************************************************/
        /*Kod 2: Kullanıcı döğru kelimeyi girene kadar çalışan döngu */
        String kelime;
        do {
            System.out.println("Lütfen 'Merhab' yazınız: ");
            kelime = scanner.nextLine();
        } while (!kelime.equals("Mehaba"));
        System.out.println("Doğru kelimeyi girdiniz!");
        
        /***************************************************************/
        /*Kod 3:Kullanıcı 0 girene kadar çalışan kod*/
        int sayi;
        do {
            System.out.println("Bir sayı giriniz (Dönguden çıkmak için 0'i basın)");
            sayi = scanner.nextInt();
        } while (sayi != 0);

        System.out.println("Girilen sayı: " + sayi);
        
        /**************************************************************/
        /*Kod 4: Faktoriyal hesaplama*/
        int sayi = 5;
        int faktoriyel = 1;

        do {
            faktoriyel *= sayi;
            sayi--;
        } while (sayi > 0);

        System.out.println(sayi + " sayısının faktöriyeli: " + faktoriyel);
        
        /**********************************************************************/
        /*Kod 5: Kullanıcı giren sayıya kadar çalışır ve çift sayıları yazar*/
         System.out.println("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        int i = 1;

        do {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= sayi);
        }
        		
	}
}
