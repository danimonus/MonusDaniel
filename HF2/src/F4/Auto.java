
package F4;
import java.util.Date;

public class Auto {
   private String rendszám;
   private int motorTeljesitmény;
   private Date gyártásDátuma;

    public Auto(String rendszám, int motorTeljesitmény) {
        this.rendszám = rendszám;
        this.motorTeljesitmény = motorTeljesitmény;
        this.gyártásDátuma = new Date();
    }

    public String getRendszám() {
        return rendszám;
    }

    public int getMotorTeljesitmény() {
        return motorTeljesitmény;
    }

    public Date getGyártásDátuma() {
        return gyártásDátuma;
    }

    public void setRendszám(String rendszám) {
        this.rendszám = rendszám;
    }

    @Override
    public String toString() {
        return "Auto{" + "rendsz\u00e1m=" + rendszám + ", motorTeljesitm\u00e9ny=" + motorTeljesitmény + ", gy\u00e1rt\u00e1sD\u00e1tuma=" + gyártásDátuma + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + this.motorTeljesitmény;
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
        final Auto other = (Auto) obj;
        if (this.motorTeljesitmény != other.motorTeljesitmény) {
            return false;
        }
        return true;
    }
   
   
   
   
}
