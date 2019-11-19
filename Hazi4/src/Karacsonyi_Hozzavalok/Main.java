package Karacsonyi_Hozzavalok;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


class Alapanyag implements Comparable<Alapanyag>{
    
    String nev;
    int db_szam;
    
    public Alapanyag(String nev, int db_szam) {
        this.nev = nev;
        this.db_szam = db_szam;
    }
    @Override
    public String toString() {
        return nev + ";" + db_szam;
    }

    @Override
    public int compareTo(Alapanyag t) {   
        int diff;
        diff = Integer.compare(t.db_szam, db_szam);
        if (diff != 0) {
            return diff;
        }
        return nev.compareTo(t.nev);
}
}

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line;
      
        List<Alapanyag> lista = new ArrayList<>();
        
        while (sc.hasNextLine()) {
            line = sc.nextLine();
            if (line.isEmpty()) {
                break;
            } 
            
            else {
                String[] sor = line.split(";");
                boolean hozzavalokat_tartalmazza = false;
                
                for (int i = 0; i < lista.size(); i++) {
                    if (lista.get(i).nev.equals(sor[0])) {
                        hozzavalokat_tartalmazza = true;
                        lista.get(i).db_szam = lista.get(i).db_szam + Integer.parseInt(sor[1]);
                    }
                }
                if (hozzavalokat_tartalmazza == false) {
                    lista.add(new Alapanyag(sor[0], Integer.parseInt(sor[1])));
                }
            }
        }
        Collections.sort(lista);
        for (Alapanyag h : lista) {
            System.out.println(h);
        }
    }
}

