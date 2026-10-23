package Sayı_tahmin_oyunu;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int sayi = random.nextInt(100) + 1; // 1-100 arası sayı
        int deneme = 0;
        int tahmin = 0;

        System.out.println("1-100 arasında bir sayı tuttum. Tahmin et!");

        while (tahmin != sayi) {
            System.out.print("Tahminin: ");
            tahmin = scanner.nextInt();
            deneme++;

            if (tahmin < sayi) {
                System.out.println("Daha büyük bir sayı söyle!");
            } else if (tahmin > sayi) {
                System.out.println("Daha küçük bir sayı söyle!");
            } else {
                System.out.println("Tebrikler! " + deneme + " denemede buldun!");
            }
        }
        scanner.close();
    }
}
