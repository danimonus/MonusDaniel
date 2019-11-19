package F_9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
        
    public static void main(String[] args) {

        List<Hatizsak> lista = new ArrayList<Hatizsak>();
        lista.add(new Hatizsak("Adidas",2.5,3,true));
        lista.add(new Hatizsak("Nike",5,6,false));
        lista.add(new Hatizsak("DC",4.5,6,true));
        lista.add(new Hatizsak("LV",1.5,2,false));
        lista.add(new Hatizsak("DG",4.6,2,true));
        lista.add(new Hatizsak("Asus",6.5,3,true));
        lista.add(new Hatizsak("Samsonite",4.3,5,false));
        lista.add(new Hatizsak("PR",2.4,3,true));
        lista.add(new Hatizsak("Converse",3.5,4,false));
        lista.add(new Hatizsak("SuperDry",4.5,3,true));
        lista.add(new Hatizsak("Supreme",3.4,5,true));
        
        
     List<Hatizsak> l = kiirMarkaSzerintLexikografikusanAzonBelulZsebekSzamaSzerintCsokkenoSorrendben(lista);
     System.out.println(l);
    }
    
    public static List<Hatizsak> kiirMarkaSzerintLexikografikusanAzonBelulZsebekSzamaSzerintCsokkenoSorrendben(List<Hatizsak> lista){
        Collections.sort(lista);
        return lista;
    }
}
    



    

