package F3;

public class Étterem extends VendéglátóipariEgység{
    private String étlap[];

    public Étterem(String név, int férőhelyekSzáma, boolean dohányzó,String[] étlap) {
        super(név, férőhelyekSzáma,dohányzó=false);
        this.étlap = étlap;     
    }

    public Étterem() {
       
    }

    

    public String[] getÉtlap() {
        return étlap;
    }

    @Override
    public String toString() {
        return "\u00c9tterem{" + "\u00e9tlap=" + étlap + '}';
    }
    
    
    
    
    
}
