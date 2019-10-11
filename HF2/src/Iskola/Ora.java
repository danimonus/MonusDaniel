
package Iskola;

public class Ora {
private int kod;
private String nev;
private int kezdes;

public Ora(){ 
}    


    public Ora(int kod, String nev, int kezdes) {
        this.kod = kod;
        this.nev = nev;
        if(kezdes < 8 || kezdes > 19){
        this.kezdes = 8;
        }
        else{
        this.kezdes = kezdes;
        }   
    }
    public int getKod() {
        return kod;
    }

    public String getNev() {
        return nev;
    }

    public int getKezdes() {
        return kezdes;
    }

    public void setKod(int kod) {
        this.kod = kod;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setKezdes(int kezdes) {
        this.kezdes = kezdes;
    }

    @Override
    public String toString() {
        return "Ora{" + "kod=" + kod + ", nev=" + nev + ", kezdes=" + kezdes + '}';
    }

   
    

}
