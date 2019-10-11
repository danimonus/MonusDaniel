package Iskola;




public class Orarend {
           
    private String nap;
    int szamlalo;
    Ora[] tomb;
    String[] napok = {"Hetfo","Kedd","Szerda","csutortok","Pentek"}; 

    
    public static boolean oratHozzaad(Ora ora){
    
    
        return false;
    }
    
    
    public Orarend(String nap) {
        this.nap = nap;
        this.szamlalo=0;
        Ora[] tomb = new Ora[12];
    }

    public String getNap() {
        return nap;
    }

    public int getSzamlalo() {
        return szamlalo;
    }


    public Orarend(Ora[] tomb) {
        this.tomb = tomb;
    }

        
    public void setNap(String nap) {
        this.nap = nap;
    }

    public void setSzamlalo(int szamlalo) {
        this.szamlalo = szamlalo;
    }

    public void setTomb(Ora[] tomb) {
        this.tomb = tomb;
    }

    @Override
    public String toString() {
        return "Orarend{" + "nap=" + nap + ", szamlalo=" + szamlalo + ", tomb=" + tomb + ", napok=" + napok + '}';
    }
    
   

    



}
