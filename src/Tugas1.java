/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Tugas1 {
    public static void main(String[] args) {
        int i, j;

        for (i = 0; i <= 3; i++) {
            for (j = 3; j >= i; j--) {
                System.out.print(" ");
            }

            for (j = 1; j <= i * 2 - 1; j++) {

                System.out.print("*");
            }
            System.out.println();
        }

    }
}

