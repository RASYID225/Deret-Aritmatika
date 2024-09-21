import java.util.Scanner;
public class deretaritmatikaperulangan {

    public static void main(String[] args) {
        int batasAtas = 100;
        int batasBawah = 0;
        int kelipatan = 6;

        Scanner s = new Scanner(System.in);

        System.out.println("Masukkan batas bawah: ");
        batasBawah = s.nextInt();
        System.out.println("Masukkan batas atas: ");
        batasAtas = s.nextInt();
        
        for (int i = batasBawah; i <= batasAtas; i++) {
            if (i % 6 == 0) {
                if (i % 10 == 0) {
                    System.out.print("Error: Angka " + i + " adalah kelipatan 10 ");
                } else {
                    System.out.print(i + ",");
                }
            }
            
        }


    }



}
