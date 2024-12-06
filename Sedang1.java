package UKL;

public class Sedang1 {
    public static void main(String[] args) {
        int tabungan = 100000; // iniailiasi
        int kenaikan = 50000;
        int total = 0;

        System.out.println(
                "-------------------------------\n  - Rincian Tabungan Siswa -\n-------------------------------");
        for (int bulan = 1; bulan <= 12; bulan++) { // loop 12 bulan
            System.out.println("Tabungan bulan ke-" + bulan + " : Rp." + tabungan);
            total += tabungan; // Menambahkan nilai tabungan ke variabel total.
            tabungan += kenaikan; // Meningkatkan nilai tabungan dengan kenaikan setiap kenaikan yang berulang.
        }
        System.out
                .println("-------------------------------------------------\nTotal tabungan Siswa selama 12 bulan : Rp."
                        + total + "\n-------------------------------------------------");
    }
}