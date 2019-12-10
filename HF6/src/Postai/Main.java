package Postai;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class vissza implements Comparable<vissza>{

    public int irszam;
    public int sumAr;
    public List <be> lista;

    public vissza(int irszam, int sumAr, List<be> lista) {
        this.irszam = irszam;
        this.sumAr = sumAr;
        this.lista = lista;
    }

    @Override
    public int compareTo(vissza o) {
        return Integer.compare(irszam, o.irszam);
    }

    @Override
       public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(irszam).append(": ").append(sumAr).append(" Ft").append(System.getProperty("line.separator"));
        for(int i=0;i<lista.size();i++)
        {
            sb.append(lista.get(i));
            if(i!=lista.size()-1) sb.append(System.getProperty("line.separator"));
        }
        
        
        return sb.toString();
    }

    
}

class be implements Comparable<be>{
    
    public String nev;
    public String telepules;
    public String utca;
    public int hazszam;
    public int ertek;

    public be(String nev, String telepules, String utca, int hazszam, int ertek) {
        this.nev = nev;
        this.telepules = telepules;
        this.utca = utca;
        this.hazszam = hazszam;
        this.ertek = ertek;
    }

    @Override
    public String toString() {
       return telepules+", "+utca+" "+hazszam+"., "+nev+", "+ertek+" Ft";

    }
    

    @Override
    public int compareTo(be o) {
        int diff = this.telepules.compareTo(o.telepules);
        if(diff!=0) return diff;
        
        diff = this.utca.compareTo(o.utca);
        if(diff!=0) return diff;
        
        diff = Integer.compare(this.hazszam, o.hazszam);
        if(diff!=0) return diff;
        
        diff = this.nev.compareTo(o.nev);
        if(diff!=0) return diff;
        
        else
            return Integer.compare(o.ertek, this.ertek);

    }

}


public class Main {
    public static void main(String[] args) throws IOException{
        String sor;
        String[] token;
        List <vissza> v = new ArrayList();
        
        try(BufferedReader br = new BufferedReader(new FileReader(args[0]))){
        
            while((sor=br.readLine()) != null){
            
                int ir_egyez = 0;
                token = sor.split(":");
                
                for (vissza x : v) {
                    
                    if(Integer.parseInt(token[1])==x.irszam){
                    ir_egyez = 1;
                    x.sumAr += Integer.parseInt(token[5]);
                    x.lista.add(new be(token[0],token[2],token[3],Integer.parseInt(token[4]),Integer.parseInt(token[5])));
                    
                    }
                    
                }
               if(ir_egyez == 0){
               v.add(new vissza(Integer.parseInt(token[1]), Integer.parseInt(token[5]), null));
               v.get(v.size()-1).lista= new ArrayList<>();
               v.get(v.size()-1).lista.add(new be(token[0],token[2],token[3],Integer.parseInt(token[4]),Integer.parseInt(token[5])));
               
               
               } 
            }
            
        }
        
        catch(FileNotFoundException ex){
           System.err.print("Nincs ilyen file!");
        }
        catch(IOException ex){
        System.err.print("IO hiba!");
        }
        
        for (int i = 0; i < v.size(); i++) {
            Collections.sort(v.get(i).lista);
        }
        Collections.sort(v);
        
        for(vissza x : v){
            System.out.println(x);
        }
        
    }   
}
