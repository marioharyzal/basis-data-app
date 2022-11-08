package model;

import java.util.Arrays;

public class Mahasiswa {
    protected static String id;
    protected static String nama;
    protected static String umur;
    protected static String jurusan;


    public String[] getMahasiswa() {
        String[] mahasiswa = {this.id, this.nama, this.umur, this.jurusan};
        return mahasiswa;
    }

    public void setMahasiswa(String id, String nama, String umur, String jurusan) {
        this.id = id;
        this.nama = nama;
        this.umur = umur;
        this.jurusan = jurusan;
    }

}
