
import java.util.Date;
import java.util.Objects;


public class Ital {
 protected String név;
 protected String kiszerelés;
 private static int ár;
 protected Date gyártásiDátum;

    public Ital(String név, String kiszerelés) {
        this.név = név;
        this.kiszerelés = kiszerelés;
        this.gyártásiDátum= new Date(); 
       this.ár=10;
    }

    public String getNév() {
        return név;
    }

    public String getKiszerelés() {
        return kiszerelés;
    }

    public static int getÁr() {
        return ár;
    }

    public Date getGyártásiDátum() {
        return gyártásiDátum;
    }

    public static void setÁr(int ár) {
        Ital.ár = ár;
    }

    @Override
    public String toString() {
        return this.név + ", " + this.kiszerelés + ", " + this.ár + " Ft";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.név);
        hash = 17 * hash + Objects.hashCode(this.kiszerelés);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ital other = (Ital) obj;
        if (!Objects.equals(this.név, other.név)) {
            return false;
        }
        if (!Objects.equals(this.kiszerelés, other.kiszerelés)) {
            return false;
        }
         if (!Objects.equals(this.ár, other.ár)) {
            return false;
        }
        return true;
    }

public static int getÁrEuróban(){
return ár/335;  
}
}
