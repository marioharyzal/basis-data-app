package repository;

import model.Mahasiswa;

import java.util.ArrayList;

public class MahasiswaRepository implements Repository {
    ArrayList<String[]> kumpulanMahasiswa = new ArrayList<>();

    @Override
    public void create(String nama, String umur, String jurusan) {
        int id = kumpulanMahasiswa.size() + 1;
        String stringId = Integer.toString(id);
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setMahasiswa(stringId, nama, umur, jurusan);

        kumpulanMahasiswa.add(mahasiswa.getMahasiswa());
    }

    @Override
    public String findAll() {
        String result = "";

        for (String[] mahasiswa : kumpulanMahasiswa) {
            result += mahasiswa[0] + ".\n" +
                    "Nama : " + mahasiswa[1] + "\n" +
                    "Umur : " + mahasiswa[2] + "\n" +
                    "urusan : " + mahasiswa[3] + "\n";
        }

        return result;
    }

    @Override
    public String findOne(String id) {
        String result = "";
        for (String[] mahasiswa : kumpulanMahasiswa) {
            if (mahasiswa[0].equals(id)) {
                result = mahasiswa[0] + ".\n" +
                        "Nama : " + mahasiswa[1] + "\n" +
                        "Umur : " + mahasiswa[2] + "\n" +
                        "urusan : " + mahasiswa[3] + "\n";
            }
        }

        return result;
    }

    @Override
    public void destroy() {
        int index = kumpulanMahasiswa.size() - 1;

        kumpulanMahasiswa.remove(index);
    }
}
