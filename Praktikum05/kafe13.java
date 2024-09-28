import java.util.Scanner;

public class kafe13 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        boolean keanggotaan;
        int jmlKopi, jmlTeh, jmlRoti;
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0;
        double totalHarga = 0;
        double nominalBayar;
        double diskon = 0; 
        boolean isMember;

        
        System.out.println("Apakah pelanggan merupakan member? (true/false): ");
        isMember = input.nextBoolean();

        System.out.println("Masukan jumlah pembelian kopi: ");
        jmlKopi = input.nextInt();
        System.out.println("Masukan jumlah pembelian teh: ");
        jmlTeh = input.nextInt();
        System.out.println("Masukan jumlah pembelian roti: ");
        jmlRoti = input.nextInt();

        
        totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);

        
        if (isMember) {
            diskon = 0.1 * totalHarga; 
            System.out.println("Pelanggan merupakan member, mendapatkan diskon 10%");
        } else {
            System.out.println("Pelanggan bukan member, tidak ada diskon.");
        }

        nominalBayar = totalHarga - diskon;

        System.out.println("Keanggotaan pelanggan: " + (isMember ? "Member" : "Non-Member"));
        System.out.println("Item pembelian: " + jmlKopi + " Kopi, " + jmlTeh + " Teh, " + jmlRoti + " Roti");
        System.out.println("Total Harga: " + totalHarga);
        System.out.println("Diskon: " + diskon);
        System.out.println("Nominal bayar: " + nominalBayar);
        
    }
}
