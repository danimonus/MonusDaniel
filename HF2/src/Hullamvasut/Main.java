
package Hullamvasut;

import java.util.*;


    
    class Adatok{
    String hnev;
    String vnev;
    int h;
    int ido;

        public Adatok(String vnev, String hnev, int h, int ido) {
            this.hnev = hnev;
            this.vnev = vnev;
            this.h = h;
            this.ido = ido;
        }

        public String getHnev() {
            return hnev;
        }

        public String getVnev() {
            return vnev;
        }

        public int getH() {
            return h;
        }

        public int getIdo() {
            return ido;
        }

        @Override
        public String toString() {
            return vnev + "(" + hnev + "): " + ido;
        }
    
    
    
    }
    
 class Main {
    public static void main(String[] args) {
        
        ArrayList<Adatok> list = new ArrayList<Adatok>();
        
        Scanner sc = new Scanner(System.in);
        String sor = sc.nextLine();
        int n = Integer.parseInt(sor);
        
        for(int i=0;i<n;i++){
        sor = sc.nextLine();
                String[] parts = sor.split(";");
                list.add(new Adatok(parts[0],parts[1],Integer.parseInt(parts[2]),Integer.parseInt(parts[3])));        
        }
        
                Collections.sort(list,
                Comparator.comparing(Adatok::getIdo).thenComparing(Adatok::getH,
                Comparator.reverseOrder()).thenComparing(Adatok::getVnev));
        
        for(Adatok adatok : list){
            System.out.println(adatok.toString());
        }
        
    }
    
}
