/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jo11;

import java.util.Scanner;
public class Latiha2 {
    private static void tampiljudul(String identitas){
        System.out.println("identitas : "+identitas);
        
        System.out.println("\nConvert Kalimat Alay Angka (vokal ke angka) \n");
    }
    public static void main(String[] args){
        String identitas = "arrofi ikhsan nur abror/XRPL 2/08";
        
        tampiljudul(identitas);
        String kalimat = tampilInput();

    }
        private static String tampilInput(){
        Scanner ah = new Scanner(System.in);
        
        System.out.println("Masukkan Kalimat : ");
        String kalimat = ah.nextLine();
        System.out.println("Kalimat Asli : "+ kalimat);
        
        return kalimat;
    }
}
