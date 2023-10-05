import java.util.Scanner;

public class Pemilihan2Tugas1_05 {
    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);
        String jenisBuku;
        double diskon,totalDiskon;
        int jumlahBuku;

        System.out.print("Masukkan jenis buku (kamus/novel/lainnya): ");
        jenisBuku = input05.nextLine().toLowerCase();
        
        System.out.print("Masukkan jumlah buku yang dibeli: ");
        jumlahBuku = input05.nextInt();
        
        diskon = 0.0;
        
        if (jenisBuku.equals("kamus")) {
            diskon = 0.10;
            if (jumlahBuku > 2) {
                diskon += 0.02;
            }
        } else if (jenisBuku.equals("novel")) {
            diskon = 0.07;
            if (jumlahBuku > 3) {
                diskon += 0.02; 
            } else {
                diskon += 0.01; 
            }
        } else {
            if (jumlahBuku > 3) {
                diskon = 0.05;
            }
        }
        
        totalDiskon = diskon * jumlahBuku;
        
        System.out.println("Jumlah diskon : " + (totalDiskon * 100) + "%");
        
        input05.close();
    }
}
