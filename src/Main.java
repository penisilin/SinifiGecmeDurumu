
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat, fizik, turkce, kimya ,muzik;

        Scanner input= new Scanner(System.in);

        System.out.print("Matematik Notunu Giriniz :");
        mat =input.nextInt();

        System.out.print("Fizik Notunu Giriniz :");
        fizik= input.nextInt();

        System.out.print("Türkçe Notunu Giriniz :");
        turkce= input.nextInt();

        System.out.print("Kimya Notunu Giriniz :");
        kimya= input.nextInt();

        System.out.print("Müzik Notunu Giriniz :");
        muzik= input.nextInt();

        double avarage= (mat+fizik+turkce+kimya+muzik)/5;
        if (avarage>=50){
            System.out.print("Sınıfı Geçtiniz ");
        }else {
            System.out.print("Kaldınız");
        }
    }
}