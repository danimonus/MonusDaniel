package F3;
import java.util.*;

public class TesztVendeg {

   
    public static Kocsma[] adottItaltKinalOlcson(String ital, VendéglátóipariEgység [] ve){
        int k=0;
        
        for (int i = 0; i < ve.length; i++) {
            if(ve[i] instanceof Kocsma){
            Kocsma p=(Kocsma)ve[i]; 
                for (int j = 0; j < p.getSörlap().length; j++) {
                    if(p.getSörlap()[j].equals(ital))
                        k++;
                    break;
                    }
                }
            }
        
       
        Kocsma [] kocsma = new Kocsma[k];
        k=0;
        for (int i = 0; i < ve.length; i++) {
            if(ve[i] instanceof Kocsma){
            Kocsma p=(Kocsma)ve[i]; //kasztolás
                for (int j = 0; j < p.getSörlap().length; j++) {
                    if(p.getSörlap()[j].equals(ital))
                        kocsma[k]=p;
                        k++;
                    break;
                }
            }
        
        }
            return kocsma;

    }
    
     public static void main(String[] args) {
       
         VendéglátóipariEgység[] vendeglatoArray = new VendéglátóipariEgység[10];
        
       vendeglatoArray[0] = new Étterem("Fanny Falatozo", 10, true, new String[] {"hamburger", "pizza", "salata", "gyros"});
        vendeglatoArray[1] = new Étterem("Bob Burger Falodaja", 12, false, new String[] {"hamburger", "pizza", "salata", "gyros"} );
        vendeglatoArray[2] = new Étterem("Hakap Eszik", 8, true, new String[] {"hamburger", "pizza", "salata", "gyros"} );
        vendeglatoArray[3] = new Étterem("McDogle's", 12, false, new String[] {"hamburger", "pizza", "salata", "gyros"} );
        vendeglatoArray[4] = new Étterem("Himi humi & nyimi nyami", 12, true, new String[] {"hamburger", "pizza", "salata", "gyros"} );
        
        vendeglatoArray[5] = new Kocsma("Dreher", 10, false, new String[] {"heineken", "dreher", "kobambi", "stefl"});
        vendeglatoArray[6] = new Kocsma("Piccolo", 12, true, new String[] {"heineken", "dreher", "kobambi", "stefl"} );
        vendeglatoArray[7] = new Kocsma("Hosszu lepes", 8, false, new String[] {"heineken", "dreher", "kobambi", "stefl"});
        vendeglatoArray[8] = new Kocsma("Rovid elet", 12, true, new String[] {"heineken", "dreher", "kobambi", "stefl"} );
        vendeglatoArray[9] = new Kocsma("Kerge Sas", 12, false, new String[] {"heineken", "dreher", "kobambi", "stefl"} );
    
     
     Kocsma[] kocsma=adottItaltKinalOlcson("heineken",vendeglatoArray);
       System.out.println(Arrays.toString(kocsma));
     }
          
}


