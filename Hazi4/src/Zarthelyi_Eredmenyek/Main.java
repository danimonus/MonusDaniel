package Zarthelyi_Eredmenyek;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

class zhEredmeny implements Comparable<zhEredmeny>{
String nev;
int pont;

    public zhEredmeny(String nev, int pont) {
        this.nev = nev;
        this.pont = pont;
    }

    public String getNev() {
        return nev;
    }

    public int getPont() {
        return pont;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setPont(int pont) {
        this.pont = pont;
    }

    @Override
    public String toString() {
        return nev + ": "+ pont + " pont";
    }

    @Override
    public int compareTo(zhEredmeny o) {
        int diff;
        diff = Integer.compare(o.pont, pont);
        if(diff!=0)
          return diff;
         else
          return nev.compareTo(o.nev);
            
    }
}

public class Main {
    
    public static void main(String[] args) {
        List<zhEredmeny> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String line;
        
        while(sc.hasNextLine()){
        line = sc.nextLine();
        if(line.isEmpty()){
            break;
        }
        else{
        String[] sor = line.split(";");
        boolean nevet_tartalmaz=false;
        
            for (int i = 0; i < lista.size(); i++) {
                if(lista.get(i).nev.equals(sor[0])){
                nevet_tartalmaz=true;
                lista.get(i).pont = lista.get(i).pont + Integer.parseInt(sor[1]);
                }
            }
        
            if(nevet_tartalmaz == false)
            lista.add(new zhEredmeny(sor[0],Integer.parseInt(sor[1])));
            }
        }
        
            Collections.sort(lista);
            for(zhEredmeny h:lista)
            System.out.println(h);
        
    }

   
}
