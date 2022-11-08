package services;

import repository.MahasiswaRepository;

import java.util.Scanner;

public class ServicesService implements Services {
    MahasiswaRepository mahasiswaRepository = new MahasiswaRepository();
    Scanner input = new Scanner(System.in);

    protected String clearNama;
    protected String clearUmur;
    protected String clearJurusan;

    @Override
    public void tambahMahasiswa() {

        while (true) {
            System.out.printf("Nama (3-20 Karakter) : ");
            String nama = input.next();
            if (nama.length() > 20) {
                System.out.println("nama melebihi 20 karakter");
            } else if (nama.length() < 3) {
                System.out.println("nama kurang dari 3 karakter");
            } else {
                this.clearNama = nama;
                break;
            }
        }


        while (true) {
            System.out.printf("Umur (min 17 Tahun) : ");
            String umur = input.next();
            if (Integer.parseInt(umur) < 17) {
                System.out.println("Umur Kurang dari 17 Tahun");
            } else {
                this.clearUmur = umur;
                break;
            }
        }

        while (true) {
            System.out.print("Jurusan (maks 10 karakter) : ");
            String jurusan = input.next();
            if (jurusan.length() > 10) {
                System.out.println("Maksimal 10 karakter !");
            } else {
                this.clearJurusan = jurusan;
                break;
            }

        }

        mahasiswaRepository.create(this.clearNama, this.clearUmur, this.clearJurusan);
    }

    @Override
    public void semuaMahasiswa() {
        String semuaMahasiswa = mahasiswaRepository.findAll();
        System.out.println(semuaMahasiswa);
    }

    @Override
    public void mahasiswa() {
        System.out.printf("Masukkan index yang ingin ditampilkan : ");
        String id = input.next();
        String mahasiswa = mahasiswaRepository.findOne(id);
        System.out.println(mahasiswa);
    }

    @Override
    public void hapusMahasiswa() {
        mahasiswaRepository.destroy();
    }
}
