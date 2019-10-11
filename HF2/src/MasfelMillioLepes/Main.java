
package MasfelMillioLepes;

import java.util.*;

 
 /*
Bemenet:
4
Teszt Elek;K.K.K.
Gipsz Jakab;.Z.PK..S.SKZ...P.Z..P.K.S
Vizi Palma;KSKPKZK
Bodon Odon;...K....K...K...


4
Elso;KKKK...
Masodik;KKKKSS
Harmadik;KKKSS
Masodikos;KKKKSS

Kimenet:
Vizi Palma
Gipsz Jakab
Bodon Odon
Teszt Elek
*/

class Adatok{
    String nev;
    int orszagos;
    int helyi;

    public Adatok(String nev, int orszagos, int helyi) {
        this.nev = nev;
        this.orszagos = orszagos;
        this.helyi = helyi;
    }

    public String getNev() {
        return nev;
    }

    public int getOrszagos() {
        return orszagos;
    }

    public int getHelyi() {
        return helyi;
    }

    @Override
    public String toString() {
        //return nev + " Orszagos: " + orszagos + " Helyi: " + helyi;
        return nev;
    }
    
    
}

public class Main {
    public static void main(String[] args) {
        
        ArrayList<Adatok> list = new ArrayList<Adatok>();
        
        Scanner sc = new Scanner(System.in);
        
        String line = sc.nextLine();
        
        int n = Integer.parseInt(line);
        
        for(int i=0;i<n;i++){
            line = sc.nextLine();
            String[] parts = line.split(";");
            
            int helyi = 0;
            int orszagos = 0;
        
            for(int j=0;j<parts[1].length();j++){
                if(parts[1].charAt(j) == 'P' || parts[1].charAt(j) == 'S' || parts[1].charAt(j) == 'Z'){
                    helyi++;
                }
            
                if(parts[1].charAt(j) == 'K'){
                    orszagos++;
                }
            }
            
            list.add(new Adatok(parts[0], orszagos, helyi));
        }
        
        Collections.sort(list, Comparator.comparing(Adatok::getOrszagos, Comparator.reverseOrder())
        .thenComparing(Adatok::getHelyi, Comparator.reverseOrder())
        .thenComparing(Adatok::getNev));
        
        for(Adatok adatok : list){
            System.out.println(adatok.toString());
        }
    }
}
