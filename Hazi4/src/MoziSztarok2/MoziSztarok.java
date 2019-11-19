
package MoziSztarok2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;


class Film implements Comparable<Film>{
    private String cim;
    private int ev;

    public Film(String cim, int ev) {
        this.cim = cim;
        this.ev = ev;
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public int getEv() {
        return ev;
    }

    public void setEv(int ev) {
        this.ev = ev;
    }

    @Override
    public int compareTo(Film o) {
        int diff= Integer.compare(this.ev, o.getEv());
        if(diff!=0) return diff;
        
        return this.cim.compareTo(o.getCim());
    }

    @Override
    public String toString() {
        return this.ev+": "+this.cim;
    }
    
    
}


class Szinesz implements Comparable<Szinesz>{
    private String nev;
    private List<Film> lista;

    public Szinesz(String nev) {
        this.nev = nev;
        this.lista=new ArrayList<>();
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public List<Film> getLista() {
        return lista;
    }

    public void setLista(List<Film> lista) {
        this.lista = lista;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.nev);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Szinesz)) {
            return false;
        }
        
        Szinesz sz= (Szinesz)obj;
        return this.nev.equals(sz.getNev());
    }

    @Override
    public String toString() {
        StringBuilder sb= new StringBuilder();
        
        sb.append(nev).append("\n");
        Collections.sort(lista);
        
        for (int i = 0; i < lista.size(); i++) {
            if(i==(lista.size()-1)){
                sb.append(lista.get(i));
            }else{
                sb.append(lista.get(i)).append("\n");
            }
            
        }
        
        return sb.toString();
    }

    @Override
    public int compareTo(Szinesz o) {
        
        int diff= Integer.compare(this.lista.size(), o.getLista().size());
        if(diff!=0) return -diff;
        
        return this.nev.compareTo(o.getNev());
    }


}

public class MoziSztarok {
    public static void main(String[] args) throws IOException {
 
        List <Szinesz> szineszLista= new ArrayList<>();
        
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        
        String sor;
        String [] token,token2;
        String cim="";
        int evszam=0;
        
        while((sor=br.readLine())!=null){
        
            if(sor.equals("V")) break;
            
            token=sor.split(":");
            
            for (int i = 0; i < token[0].length(); i++) {
                String[] cimEsevszam=token[0].split("[()]");
                cim=cimEsevszam[0];
                evszam=Integer.parseInt(cimEsevszam[1]);
            }
            
            token2=token[1].split(",");
            for (int i = 0; i < token2.length; i++) {
                Szinesz szinesz= new Szinesz(token2[i]);
                
               if (szineszLista.contains(szinesz)) {
                    szineszLista.get(szineszLista.indexOf(szinesz)).getLista().add(new Film(cim, evszam));
                } else {
                    szinesz.getLista().add(new Film(cim, evszam));
                    szineszLista.add(szinesz);
                }
                
            } 
            
        } 
        
        Collections.sort(szineszLista);
        for (Szinesz sz : szineszLista) {
            System.out.println(sz);
        }
        
    }
    
}
