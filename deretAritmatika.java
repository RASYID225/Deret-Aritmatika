import java.util.Scanner;

public class deretAritmatika {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Masukan suku pertama (a): ");
        int a = in.nextInt();

        System.out.println("Masukan beda (d): ");
        int d = in.nextInt();

        System.out.println("Masukan jumlah suku (n): ");
        int n = in.nextInt();
        
        System.out.println("Deret Aritmatika: ");
        for (int i = 0; i < n; i++) {
            int suku = a + (i*d);
            System.out.println(suku + " ");
        }

    }
}
