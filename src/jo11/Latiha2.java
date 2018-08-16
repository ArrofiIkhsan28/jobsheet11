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
        String convert = vocal2Angka(kalimat);
        tampilPerKata(kalimat, convert);
    }
        private static String tampilInput(){
        Scanner ah = new Scanner(System.in);
        
        System.out.println("Masukkan Kalimat : ");
        String kalimat = ah.nextLine();
        System.out.println("Kalimat Asli : "+ kalimat);
        
        return kalimat;
    }
            private static String vocal2Angka(String kalimat){
        char [][] arConvert = 
        {{'a','4'},{'i','1'},{'u','2'},{'e','3'},{'o','0'}};
        
        kalimat = kalimat.toLowerCase();
        for(int i = 0;i<arConvert.length;i++)
            kalimat = kalimat.replace(arConvert[i][0], arConvert[i][1]);
        return kalimat;
    }
                private static void tampilPerKata(String kalimat, String convert){
        String[] arrKal = kalimat.split(" ");
        String[] arrCon = convert.split(" ");
        
        for (int i = 0; i < arrKal.length; i++) {
            System.out.println(arrKal[i]+" => "+arrCon[i]);
        }
    }
}
