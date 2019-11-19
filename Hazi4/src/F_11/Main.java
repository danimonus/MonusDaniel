package F_11;

import java.util.*;

public class Main {

    static double Atlag (Szemely[] t){
        double kor=0,db=0,atlag;
        for (int i = 0; i < t.length; i++) {
            if(t[i] instanceof Hallgato){
            Hallgato a = (Hallgato) t[i];
            if(a.joAtlag(a.atlag)){
            kor+=a.életkor;
            db++;
            }
            }
        }
            atlag = kor/db;
        
      return atlag;  
    }
    
    
    
    public static void main(String[] args) {
        
    
Szemely s1 = new Szemely("Mona Lisa",20,false);
        System.out.println(s1);
Szemely[] t = new Szemely[4];
List<Szemely> lista = new ArrayList();
Scanner sc = new Scanner(System.in);
String line;
String [] sor;

        for (int i = 0; i < 2; i++) {
           line = sc.nextLine();
           sor = line.split(" ");
           lista.add(new Hallgato(sor[0],Integer.parseInt(sor[1]),Boolean.parseBoolean(sor[2]),Double.parseDouble(sor[3])));
           t[i] = new Hallgato(sor[0],Integer.parseInt(sor[1]),Boolean.parseBoolean(sor[2]),Double.parseDouble(sor[3]));
        }
        for (int i = 2; i < 4; i++) {
            line = sc.nextLine();
            sor = line.split(" ");
            lista.add(new Oktato(sor[0],Integer.parseInt(sor[1]),Boolean.parseBoolean(sor[2]),sor[3]));
            t[i] = new Oktato(sor[0],Integer.parseInt(sor[1]),Boolean.parseBoolean(sor[2]),sor[3]);
        }
        
            
        
        System.out.println("Atlag: "+Atlag(t));
        System.out.println("fiatal: "+Egyetem.legFiatalabbak(lista));
}
}