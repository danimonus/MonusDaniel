package IzzasztoFeladat;

import java.util.*;

/*Feladat:
https://progcont.hu/progcont/100230/?pid=201143

Bemenet 1:
6 Debrecen
Budapest:19
Debrecen:24
Esztergom:25
Miskolc:26
Szeged:20
Szolnok:25

Kimenet 1:
Miskolc (26)
Esztergom (25)
Szolnok (25)

Bemenet 2:
6 Fegyvernek
Budapest:19
Debrecen:24
Esztergom:25
Miskolc:26
Szeged:20
Szolnok:25

Kimenet 2:
Missing data
*/

class Adatok{
    String varosNev;
    int homerseklet;

    public Adatok(String varosNev, int homerseklet) {
        this.varosNev = varosNev;
        this.homerseklet = homerseklet;
    }

    public String getVarosNev() {
        return varosNev;
    }

    public int getHomerseklet() {
        return homerseklet;
    }

    @Override
    public String toString() {
        return varosNev + " (" + homerseklet + ")";
    }
    
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String line = sc.nextLine(); //ide beolvasok
        
        String[] parts = line.split(" "); //itt szedem szet ket reszre
        
        int n = Integer.parseInt(parts[0]); //ide kerul a szam a sor elejerol
        
        String varos = parts[1]; //ide kerul a varos neve
        
        int temperature = 0; //ide fog majd a varos homerseklete kerulni, ha a varos benne van a beolvasott adatokban
        
        ArrayList<Adatok> list = new ArrayList<Adatok>();
        
        for(int i=0;i<n;i++){
            line = sc.nextLine();
            String[] parts2 = line.split(":");
            
            list.add(new Adatok(parts2[0], Integer.parseInt(parts2[1])));
            
        }
        
        boolean benneVan = false;
        for(Adatok adatok : list){
            //System.out.println(adatok.getVarosNev());
            if(adatok.getVarosNev().equals(varos)){ //ha benne van a beolvasott adatokban a varos
                benneVan = true; //akkor ezt jelzem
                temperature = adatok.getHomerseklet(); //es ballitom a varos homersekletet
                //System.out.println("hom:" + temperature); //ellenorzeshez
                break; //minek tovabb menni a keresessel
            }
        }
        
        if(!benneVan){ //ha nincs benne a varos a beolvasott adatokban, akkor Missing data -> ennyi volt
            System.out.println("Missing data");
        }
        else{
            Collections.sort(list, Comparator.comparing(Adatok::getHomerseklet, Comparator.reverseOrder()).thenComparing(Adatok::getVarosNev)); //sorba rendezes: homerseklet csokkeno, varosnev novekvo
            for(Adatok adatok : list){
                if(adatok.getHomerseklet() > temperature){
                    System.out.println(adatok.toString());
                }
            }
        }
        
        
        /*
        if (list.contains(varos)){
            System.out.println("igen");
        }
        else{
            System.out.println("nem");
        }
        */
        
    }
}
