/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1.mi1b;

/**
 *
 * @author user
 */
public class StudentTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student s1=new Student(1005, "desfani zulya", "999-99-999", 3.5);
        
        System.out.println("no bp : "+s1.getNobp());
        System.out.println("nama : "+s1.getNama());
        System.out.println("no bpjs : "+s1.getNobpjs());
        System.out.println("ipk: "+s1.getIndeksprestasi());
        System.out.println("---------------------------");
        
        studentdua s2=new studentdua ();
        s2.setNobp(1091006);
        s2.setNama("Fadhil");
        s2.setNobpjs("999-99-999");
        s2.setIndeksprestasi(3.83);
         System.out.println("no bp : "+s2.getNobp());
        System.out.println("nama : "+s2.getNama());
        System.out.println("no bpjs : "+s2.getNobpjs());
        System.out.println("ipk: "+s2.getIndeksprestasi());
        System.out.println("---------------------------");
        
        studentdua s3=new studentdua();
        s3.setNobp(10910067);
        s3.setNama("Fani Illahi");
        s3.setNobpjs("999-99-999");
        s3.setIndeksprestasi(3.65);
         System.out.println("no bp : "+s3.getNobp());
        System.out.println("nama : "+s3.getNama());
        System.out.println("no bpjs : "+s3.getNobpjs());
        System.out.println("ipk: "+s3.getIndeksprestasi());
        System.out.println("---------------------------");
    }
    
}
