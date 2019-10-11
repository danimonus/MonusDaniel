
package Fejesek2;

import java.util.*;


class Adatok{
String nev;
String elotte;

    public Adatok(String nev, String elotte) {
        this.nev = nev;
        this.elotte = elotte;
    }



    public String getNev() {
        return nev;
    }

    public String getElotte() {
        return elotte;
    }

}

public class Main {
    /*5;Peter;Barnabas
Gabor;Jozsef
Samu;Barnabas
Jozsef;Peter
Barnabas;Gabo
*/
    public static void main(String[] args) {
        
        ArrayList<Adatok> lista = new ArrayList<Adatok>();
        Scanner sc = new Scanner(System.in);
        String sor = sc.nextLine();
        String[] parts = sor.split(";");
        int n = Integer.parseInt(parts[0]);
        String elso = parts[1];
        String nez = parts[2];
        String[] tornasor = new String[n];
        tornasor[0]=elso;
        
        for(int i=0;i<n-1;i++){
            sor = sc.nextLine();
                    String[] parts2 = sor.split(";");
                    lista.add(new Adatok(parts2[0],parts2[1]));
        }
                    
                    for(int i=1;i<tornasor.length;i++){
                        for (int j = 0; j < lista.size(); j++) {
                            if(tornasor[i-1].equals(lista.get(j).getElotte())){
                            tornasor[i]=lista.get(j).getNev();
                            break;
                            }
                        }
                    }
            
        int p=0,k=0,co=0;
        
        while(!tornasor[co].equals(nez)){
        if((co % 2)==0){
        p++; 
        }
        else
                k++;
        co++;
        }
        
        System.out.println(p + " " + k); 
    }
}
