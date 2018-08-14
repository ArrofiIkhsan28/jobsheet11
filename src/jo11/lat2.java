/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jo11;
import java.util.Scanner;
public class lat2 {
    private static void tampiljudul(String identitas){
        System.out.println("identitas : "+identitas);
        
        System.out.println("\nConvert Kalimat Alay Angka (vokal ke angka) \n");
        
       
        
    }
    public static void main(String[] args){
        String identitas = "arrofi ikhsan nur abror/XRPL 2/08";
        tampiljudul(identitas);
}
    private static String tampilInput() {
        Scanner scanner;
        scanner = new Scanner(System.in);
        
        System.out.println("Masukkan kalimat : ");
        String kalimat = scanner.nextLine();
        System.out.println("kalimat asli : " + kalimat);
        
        return kalimat;
    }
    String kalimat = tampilInput();
    private static String vocal2angka(String kalimat){
        char [][] arConvert =
        {{'a','4'},{'i','1'},{'u','2'},{'e','3'},{'o','0'}};
        
        kalimat = kalimat.toLowerCase();
        for (int i = 0;i<arConvert.length;i++)
            
        kalimat = kalimat.replace(arConvert[i][0], arConvert[i][1]);
          String convert = vocal2angka(kalimat);
        return kalimat;
      
    }
    private static void tampilperkata(String kalimat,String convert) {
        String[] arrKa1 = kalimat.split(" ");
        String[] arrCon = convert.split(" ");
                {
                for(int i=0;i<arrKa1.length;i++)
                    System.out.println(arrKa1[i]+"=>" + arrCon[i]);
                tampilperkata(kalimat,convert);
                
    }
    }
    
    private static void tampilHasil(String convert) {
        System.out.println("kalimat alay angka : "+ convert);
        tampilHasil(convert);
    }
    
    }
     
