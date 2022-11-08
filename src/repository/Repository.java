package repository;

import model.Mahasiswa;

public interface Repository {
    public void create(String nama, String umur, String jurusan);

    public String findAll();

    public String findOne(String id);

    public void destroy();
}
