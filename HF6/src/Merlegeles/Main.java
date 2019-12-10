package Merlegeles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class ceg implements Comparable<ceg>{

    String cegnev;
    String telephely;
    int ev;
    int arbevetel;
    int evdb;

    public ceg(String cegnev, String telephely, int ev, int arbevetel, int evdb) {
        this.cegnev = cegnev;
        this.telephely = telephely;
        this.ev = ev;
        this.arbevetel = arbevetel;
        this.evdb = evdb;
    }

    @Override
    public String toString() {
        return cegnev + " (" + telephely + "): " + arbevetel;
    }

    @Override
    public int compareTo(ceg o) {
        int diff = Integer.compare(o.arbevetel, this.arbevetel);
        if(diff != 0) return diff;
        
        diff = Integer.compare(this.evdb,o.evdb);
        if(diff != 0) return diff;
        
        else
            return this.cegnev.compareTo(o.cegnev);

    }  

}




public class Main {

    public static void main(String[] args){
        
    
    String sor;
    String[] token;
    List<ceg> lista = new ArrayList();
    
    try{
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            
            while((sor = br.readLine()) != null){
            
                token = sor.split(":");
                
                int voltmar = 0;
                
                for (int i = 0; i < lista.size(); i++) {
                    if(lista.get(i).cegnev.compareTo(token[0])==0 && lista.get(i).telephely.compareTo(token[1])==0){
                        lista.get(i).evdb++;
                        lista.get(i).arbevetel += Integer.parseInt(token[3]);
                        voltmar++;
                    }
            
                }
                    if(voltmar==0)
                        lista.add(new ceg(token[0], token[1], Integer.parseInt(token[2]), Integer.parseInt(token[3]),1));
                        
                
            }
            
            
            
            Collections.sort(lista);
            
            for(ceg x:  lista)
            System.out.println(x);
            
            
            
    }catch(FileNotFoundException e){
    System.err.println("Ilyen file nem talalhato");
    }
    
    catch(IOException e){
        System.out.println("IO hiba");
        e.getStackTrace();
    }
  


}
    
    




    
}
