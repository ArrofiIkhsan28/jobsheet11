
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
         
          System.out.println("karakter mulai posisi 3 di variable x : "+ x.substring(3));
         System.out.println("karakter dari posisi 3-5 di variable x :"+ x.substring(3,6));
         
         String tclean = t.trim();
         System.out.println("iai variable tclean :"+ t.trim());
         System.out.println("rubah 'i' jadi 'e' di variable tclean :"+ tclean.replace("i","e"));
         
         String[] arrT = tclean.split(" ");
         System.out.println("pecah kata di variable tclean : ");
         for(int i =0;i<arrT.length;i++)
             System.out.println(arrT[i]);
         
         String[] arrTr = tclean.split("r");
         System.out.println("pecah bedasarkan huruf 'r' di variable tclean : ");
         for(int i = 0;i<arrTr.length;i++)
             System.out.println(arrTr[i]);
         
         double d= 1545454000;
         System.out.println(String.format("uang saya %,.4f", d));
         
         System.out.println(String.format(Locale.forLanguageTag("in-ID"), "uang saya Rp %,.2f", d));
         
    }
         
        
}
