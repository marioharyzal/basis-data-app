package ui;

import services.ServicesService;

import java.util.Scanner;

public class MainMenu {

    public void run() {
        ServicesService mahasiswaService = new ServicesService();
        Scanner input = new Scanner(System.in);
        Boolean isRunning = true;
        String line = "--------------------\n" +
                "Main Menu\n" +
                "--------------------\n" +
                "1. Add Mahasiswa\n" +
                "2. Delete Mahasiswa\n" +
                "3. View All Mahasiswa\n" +
                "4. View Mahasiswa\n" +
                "5. Exit";

        while (isRunning) {
            try {
                System.out.println(line);
                System.out.printf("Masukan Menu Yang Dipilih : ");
                Integer number = input.nextInt();
                switch (number) {
                    case 1:
                        mahasiswaService.tambahMahasiswa();
                        break;
                    case 2:
                        mahasiswaService.hapusMahasiswa();
                        break;
                    case 3:
                        mahasiswaService.semuaMahasiswa();
                        break;
                    case 4:
                        mahasiswaService.mahasiswa();
                        break;
                    case 5:
                        isRunning = false;
                        break;
                }
            } catch (Exception e) {
                System.out.println("Inputan Harus Angka, Masukan lagi...");
                input.next();
            }
        }
    }
}
