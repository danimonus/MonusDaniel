
package Auto;

import java.util.Date;
import java.util.Objects;

public class Auto {
    
     private String rendszam;
   private int motorTeljesitmeny;
   private Date gyartasiDatum = new Date();

    public Auto() {
     this.rendszam = rendszam;
        this.motorTeljesitmeny = motorTeljesitmeny;   
    }
   
   

    public Auto(String rendszam, int motorTeljesitmeny) {
        this.rendszam = rendszam;
        this.motorTeljesitmeny = motorTeljesitmeny;
    }

    public String getRendszam() {
        return rendszam;
    }

    public int getMotorTeljesitmeny() {
        return motorTeljesitmeny;
    }

    public Date getGyartasiDatum() {
        return gyartasiDatum;
    }

    public void setRendszam(String rendszam) {
        this.rendszam = rendszam;
    }

    @Override
    public String toString() {
        return "Auto{" + "rendszam=" + rendszam + ", motorTeljesitmeny=" + motorTeljesitmeny + ", gyartasiDatum=" + gyartasiDatum + '}';
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
        final Auto other = (Auto) obj;
        if (this.motorTeljesitmeny != other.motorTeljesitmeny) {
            return false;
        }
        if (!Objects.equals(this.rendszam, other.rendszam)) {
            return false;
        }
        if (!Objects.equals(this.gyartasiDatum, other.gyartasiDatum)) {
            return false;
        }
        return true;
    }

  
    
    
}
