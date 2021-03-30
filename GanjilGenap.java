/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ganjilgenap;

/**
 *
 * @author SEKAR MAULIYAH
 */
import java.util.Scanner;
public class GanjilGenap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);

        int awal, akhir;
    
        System.out.println("MENAMPILKAN DERET BILANGAN GENAP");
        System.out.println("-------------------------------------------------");
        System.out.print("Masukan Batas Awal : ");
        awal=input.nextInt();
        System.out.print("Masukan Batas Akhir : ");
        akhir=input.nextInt();
        System.out.println("--------------------------- ");
 
        System.out.println("Deret Bilangan Genap");
        for(int i=awal;i<=akhir;i++){
        if (i%2==0)
        System.out.print(i+" ");
        }
        }
    }
