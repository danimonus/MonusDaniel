package F3;
public class Kocsma extends VendéglátóipariEgység{
   public String[] sörlap;
    

    public Kocsma(String név,int férőhelyekSzáma, boolean dohányzó, String[] sorlap) {
        super(név, férőhelyekSzáma, dohányzó=true);
        this.sörlap = sörlap;
    }
    public Kocsma(){
    
    }
    
    public String[] getSörlap() {
        return sörlap;
    }

        public String toString() {
        return "Kocsma{" + "s\u00f6rlap=" + sörlap + '}';
    }

    
    
}
