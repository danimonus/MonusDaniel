package Parkolo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class parkolo implements Comparable<parkolo>{

    String cim;
    double terulet;
    int kapacitas;
    String rendszam;

    public parkolo(String cim, double terulet, int kapacitas){
        this.cim = cim;
        this.terulet = terulet;
        this.kapacitas = kapacitas;
    }

    public String getCim() {
        return cim;
    }

    public double getTerulet() {
        return terulet;
    }

    public int getKapacitas() {
        return kapacitas;
    }

    public String getRendszam() {
        return rendszam;
    }

   
    

    @Override
    public String toString() {
        return cim +": "+kapacitas+" szabad hely";
           }  
  
     @Override
    public int compareTo(parkolo o) {
        int diff;
        diff = Integer.compare(o.kapacitas, kapacitas);
        if(diff != 0)
            return diff;
        else
            return cim.compareTo(o.cim);
    }
}




public class Main {

    public static void main(String[] args) {

        List<parkolo> lista = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);
        String line;
        
        while(sc.hasNextLine()){
        line = sc.nextLine();
        if(line.isEmpty())
            break;
        
        else{
            
            
        String[] sor = line.split(";");
        int autokSzama = sor.length-3;
          
           
            if(Integer.parseInt(sor[2])-autokSzama>=3){
               
                lista.add(new parkolo(sor[0],Double.parseDouble(sor[1]),(Integer.parseInt(sor[2])-autokSzama)));
            }
            else 
                ;;
        }
        }
        Collections.sort(lista);
        for(parkolo h:lista)
            System.out.println(h);
        
        
    }
    
}
