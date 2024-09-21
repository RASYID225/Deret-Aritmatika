public class deretAritmatikaWhile {
    public static void main(String[] args) {
        int a = 2; //Nilai awal
        int d = 3; //Selisih (beda)
        int n = 10; //Jumlah elemen deret
        int i = 1; //Counter
        int currentTerm = a; //Elemen pertama


        while (i <= n) {
           System.out.print(currentTerm + " ");
           currentTerm += d; //Tambahkan selisih ke elemen saat ini
           i++; //Increment counter           
        }

    }
}
