
package jo11;
import java.util.Locale;
public class lat1 {
    public static void main(String[] args){
       String identitas = "Arrofi Ikhsan Nur Abror / X RPL 2 / 8";
        System.out.println("identitas : " + identitas);
     String x = "Operasi";
        System.out.println("isi variable x : "+ x);
        System.out.println("\""+ x + "\"panjang karakter = " + x.length());
        
        System.out.println("x adalah kosong : " + x.isEmpty());
        
        String y = "";
        System.out.println("isi variable y : " + y);
        System.out.println("y adalah kosong : " + y.isEmpty());
        
        System.out.println("isi x sama dengan y: " + x.equals(y));
        
        String z = "Operasi";
        System.out.println("isi variable z :"+ z);
        System.out.println("isi x sama dengan z (case sensitive) : " +x.equals(z));
        
        String r = "operasi";
        System.out.println("isi variable r : " + r);
        System.out.println("isi x sama dengan z (case sensitive) :" + x.equals(r));
        System.out.println("isi r sama dengan r (not case sensitive)" + x.equalsIgnoreCase(r));
        
        String s = "operasi";
        System.out.println("isi variable s :" +s);
        System.out.println("perbandingan isi r dengan s (case sensitive) :"+r.compareTo(s));
        
          System.out.println("pada x terdapat huruf'a' : " + x.contains("a"));
         
         System.out.println("isi variable x besar semua :"+x.toUpperCase());
         System.out.println("isi semua variable  x kecil semua : "+x.toLowerCase());
         
         String t = "  operasi string  ";
         System.out.println("isi variable t:\""+ t +"\"");
         System.out.println("isi variable t tanpa spasi : \""+t.trim() +"\"");
         
         System.out.println("gabungkan isi variable x dan r : "+ x.concat(r));
         
    }
         
        
}
