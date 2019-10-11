package F4;
public class Teherautó extends Auto{
    private int maxSzállithatóTeher;

    public Teherautó(String rendszám,int maxSzállithatóTeher, int motorTeljesitmény) {
        super(rendszám, motorTeljesitmény);
        this.maxSzállithatóTeher = maxSzállithatóTeher;
    }

    public int getMaxSzállithatóTeher() {
        return maxSzállithatóTeher;
    }

    @Override
    public String toString() {
        return "Teheraut\u00f3{" + "maxSz\u00e1llithat\u00f3Teher=" + maxSzállithatóTeher + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + this.maxSzállithatóTeher;
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
        final Teherautó other = (Teherautó) obj;
        if (this.maxSzállithatóTeher != other.maxSzállithatóTeher) {
            return false;
        }
        return true;
    }
    
}
