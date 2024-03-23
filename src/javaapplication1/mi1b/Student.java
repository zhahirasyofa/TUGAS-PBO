/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.mi1b;

/**
 *
 * @author user
 */
public class Student {
    
    private int nobp;
    String nama, nobpjs;
    double indeksprestasi;
    public final int kodePtn = 001;

    public Student(int x, String n, String s, double g) {
        nobp=x;
        nama=n;
        nobpjs=s;
        indeksprestasi=g;
    }

    public int getNobp() {
        return nobp;
    }

    public void setNobp(int nobp) {
        this.nobp = nobp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNobpjs() {
        return nobpjs;
    }

    public void setNobpjs(String nobpjs) {
        this.nobpjs = nobpjs;
    }

    public double getIndeksprestasi() {
        return indeksprestasi;
    }

    public void setIndeksprestasi(double indeksprestasi) {
        this.indeksprestasi = indeksprestasi;
    }
    
    
}
