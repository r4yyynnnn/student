package com.example.demo.student;

import jakarta.persistence.*;

@Entity
@Table(name = "StudentEntity")
public class StudentEntity {
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Integer NISN;
    private String name;
    private String alamat;
    private String kelas;

    public StudentEntity() {
    }

    public StudentEntity(Integer NISN, String name, String alamat,String kelas) {
        this.NISN = NISN;
        this.name = name;
        this.alamat = alamat;
        this.kelas = kelas;
    }

    public StudentEntity(String name, String alamat, String kelas) {
        this.name = name;
        this.alamat = alamat;
        this.kelas = kelas;
    }


    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNisn() {
        return NISN;
    }

    public void setNisn(Integer nisn) {
        this.NISN = nisn;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nisn=" + NISN +
                ", name='" + name + '\'' +
                ", alamat='" + alamat + '\'' +
                ", kelas=" + kelas +
                '}';
    }
}
