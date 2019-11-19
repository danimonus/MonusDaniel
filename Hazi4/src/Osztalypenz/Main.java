package Osztalypenz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



class osztalyP implements Comparable<osztalyP>{

String nev;
int osszeg;

        public osztalyP(String nev, int osszeg) {
            this.nev = nev;
            this.osszeg = osszeg;
        }

        public String getNev() {
            return nev;
        }

        public int getOsszeg() {
            return osszeg;
        }

        public void setNev(String nev) {
            this.nev = nev;
        }

        public void setOsszeg(int osszeg) {
            this.osszeg = osszeg;
        }

        @Override
        public String toString() {
            return  nev + ";" + osszeg ;
        }

        @Override
        public int compareTo(osztalyP o) {
            int diff;
            diff = Integer.compare(o.osszeg,osszeg);
            if(diff!=0){
            return diff;
            }
            return nev.compareTo(o.nev);

        }
}


public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line;
        
        List<osztalyP> lista = new ArrayList<>();
        
        while(sc.hasNextLine()){
        line = sc.nextLine();
        if(line.isEmpty())
            break;

        else{
                String[] sor = line.split(";");
                boolean nevet_tartalmaz=false;
                
                for (int i = 0; i < lista.size(); i++) {
                if(lista.get(i).nev.equals(sor[0])){
                    nevet_tartalmaz=true;
                lista.get(i).osszeg=lista.get(i).osszeg + Integer.parseInt(sor[1]);
                    }
                }
        if(nevet_tartalmaz==false){
        lista.add(new osztalyP(sor[0],Integer.parseInt(sor[1])));
                 }
        
        
             }
        }
        
       Collections.sort(lista);
       for(osztalyP h:lista)
            System.out.println(h);
           
        
        
        
    }
    
    
}
