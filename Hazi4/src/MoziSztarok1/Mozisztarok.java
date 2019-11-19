
package MoziSztarok1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Szinesz implements Comparable<Szinesz>{
 private String nev;
 private int sz_ev;

    public Szinesz(String nev, int sz_ev) {
        this.nev = nev;
        this.sz_ev = sz_ev;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getSz_ev() {
        return sz_ev;
    }

    public void setSz_ev(int sz_ev) {
        this.sz_ev = sz_ev;
    }

    @Override
    public int compareTo(Szinesz o) {
        int diff= Integer.compare(this.sz_ev, o.getSz_ev());
        if(diff!=0) return diff;
        
        return this.nev.compareTo(o.getNev());
    }

    @Override
    public String toString() {
        return this.sz_ev+": "+nev;
    }
    
    

}
class Film implements Comparable<Film>{
    
    private String cim;
    private List <Szinesz> szineszek;

    public Film(String cim) {
        this.cim = cim;
        this.szineszek = new ArrayList<>();
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public List<Szinesz> getSzineszek() {
        return szineszek;
    }

    public void setSzineszek(List<Szinesz> szineszek) {
        this.szineszek = szineszek;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null &&!(obj instanceof Film)) {
            return false;
        }
       
        Film f= (Film) obj;
        return this.cim.equals(f.getCim());
    }
    
    
    

    @Override
    public int compareTo(Film o) {
        
        int diff= Integer.compare(this.getSzineszek().size(), o.getSzineszek().size());
        if(diff!=0) return -diff;
        
        return this.cim.compareTo(o.getCim());
    }

    @Override
    public String toString() {
        StringBuilder sb= new StringBuilder();
        sb.append(cim).append("\n");
        
        Collections.sort(szineszek);
        for (int i = 0; i <getSzineszek().size(); i++) {
            if(i==getSzineszek().size()-1){
                sb.append(szineszek.get(i));
            }else{
                sb.append(szineszek.get(i)).append("\n");
            }
            
        }
        
        
        return sb.toString();
    }
    
    

}


public class Mozisztarok {
    
    public static void main(String[] args) throws IOException {
        List<Film> filmekListaja= new ArrayList<>();
        String sor;
        String [] token,token2;
        String nev="";
        int szEv=0;
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        
        while((sor=br.readLine())!=null){
        
            if(sor.equals("V")) break;
            
            token=sor.split(":");
            
           
            
            for (int i = 0; i < token[0].length(); i++) {
                String [] nevEsEvSzam=token[0].split("[()]");
                nev=nevEsEvSzam[0];
                szEv=Integer.parseInt(nevEsEvSzam[1]);
            }
            
             token2=token[1].split(";");
            for (int i = 0; i < token2.length; i++) {
                Film film= new Film(token2[i]);
                
                if(filmekListaja.contains(film)){
                    filmekListaja.get(filmekListaja.indexOf(film)).getSzineszek().add(new Szinesz(nev, szEv));
                }else{
                    film.getSzineszek().add(new Szinesz(nev, szEv));
                    filmekListaja.add(film);
                
                }
                
            }

        }
        
        Collections.sort(filmekListaja);
            for (Film f : filmekListaja) {
                System.out.println(f);
            }
    }
    
}
