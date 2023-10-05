import java.util.Scanner;

public class Pemilihan2Tugas1_05 {
    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);
        int bil1,bil2,bil3,terbesar;

        System.out.print("Masukkan bilangan pertama: ");
        bil1 = input05.nextInt();
        
        System.out.print("Masukkan bilangan kedua: ");
        bil2 = input05.nextInt();
        
        System.out.print("Masukkan bilangan ketiga: ");
        bil3 = input05.nextInt();
        
        terbesar = bil1;
        
        if (bil2 > terbesar) {
            terbesar = bil2;
        } 
        if (bil3 > terbesar) {
            terbesar = bil3;
        }
        
        System.out.println("Bilangan terbesar: " + terbesar);

        input05.close();
    }
}
