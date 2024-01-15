import java.util.ArrayList;
import java.util.Scanner;

public class ParkirApartement {
    public static void main(String[] args) {
        ArrayList<String> lantai1 = new ArrayList<>();
        ArrayList<String> lantai2 = new ArrayList<>();
        ArrayList<String> lantai3 = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        int menu;
        do {
            System.out.println("Menu:");
            System.out.println("1. Masukkan kendaraan");
            System.out.println("0. Keluar");

            System.out.print("Pilih menu: ");
            menu = scanner.nextInt();
            scanner.nextLine(); // Membuang newline

            switch (menu) {
                case 1:
                    System.out.print("Masukkan jenis kendaraan (contoh: Mobil, Motor): ");
                    String jenisKendaraan = scanner.nextLine();

                    System.out.print("Masukkan kapasitas mesin (CC): ");
                    int kapasitasMesin = scanner.nextInt();
                    scanner.nextLine(); // Membuang newline

                    String kendaraan = jenisKendaraan + " (" + kapasitasMesin + " CC)";

                    if (kapasitasMesin >= 2500) {
                        lantai1.add(kendaraan);
                        System.out.println("Ditempatkan di Lantai 1");
                    } else if (kapasitasMesin >= 1500 && kapasitasMesin < 2500) {
                        lantai2.add(kendaraan);
                        System.out.println("Ditempatkan di Lantai 2");
                    } else if (kapasitasMesin >= 1000 && kapasitasMesin < 1500) {
                        lantai3.add(kendaraan);
                        System.out.println("Ditempatkan di Lantai 3");
                    } else {
                        System.out.println("Kendaraan tidak dapat ditempatkan.");
                    }
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        } while (menu != 0);

        // Menampilkan daftar kendaraan di setiap lantai
        System.out.println("Daftar kendaraan di Lantai 1:");
        System.out.println(lantai1);

        System.out.println("Daftar kendaraan di Lantai 2:");
        System.out.println(lantai2);

        System.out.println("Daftar kendaraan di Lantai 3:");
        System.out.println(lantai3);
    }
}

