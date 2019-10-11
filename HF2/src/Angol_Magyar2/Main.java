package Angol_Magyar2;
import java.util.*;


    class Adatok{
    String angol;
    String magyar;

    public Adatok(String angol, String magyar) {
        this.angol = angol;
        this.magyar = magyar;
    }

    public String getAngol() {
        return angol;
    }
    
    public String getMagyar() {
        return magyar;
    }
    
    @Override
    public String toString() {
        return angol + ":" + magyar;
    }
    
}
    

class Main {
    
    public static void main(String[] args) {
        
        ArrayList <Adatok> list = new ArrayList<Adatok>();
        
        Scanner sc = new Scanner(System.in);
        String sor = sc.nextLine();
        int n = Integer.parseInt(sor);
        
        for (int i = 0; i < n; i++) {
           sor = sc.nextLine();
           String parts[] = sor.split(":");
           list.add(new Adatok(parts[0],parts[1]));  
        }
                     
        Collections.sort(list,Comparator.comparing(Adatok::getAngol).thenComparing(Adatok::getMagyar));
        
        for (Adatok adatok : list ) {
            System.out.println(adatok.toString());
        }
        
       
        
    }
    
    
}
