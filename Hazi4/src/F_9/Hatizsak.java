package F_9;

public class Hatizsak implements Comparable<Hatizsak>{

private String marka;
private double urtartalom;
private int zsebekeSzama;
private boolean vizhatlan;

    public Hatizsak(String marka, double urtartalom, int zsebekeSzama, boolean vizhatlan) {
        this.marka = marka;
        this.urtartalom = urtartalom;
        this.zsebekeSzama = zsebekeSzama;
        this.vizhatlan = vizhatlan;
    }

    public String getMarka() {
        return marka;
    }

    public double getUrtartalom() {
        return urtartalom;
    }

    public int getZsebekeSzama() {
        return zsebekeSzama;
    }

    public boolean isVizhatlan() {
        return vizhatlan;
    }

    @Override
    public String toString() {
        return "\n"+"marka=" + marka + ", urtartalom=" + urtartalom + ", zsebekeSzama=" + zsebekeSzama + ", vizhatlan=" + vizhatlan ;
    }

//    @Override
//    public int compareTo(Hatizsak o) {
//        if(this.marka != o.marka)
//            return this.marka.compareTo(o.marka);
//        else
//            return o.zsebekeSzama-this.zsebekeSzama;
//    }

    @Override
    public int compareTo(Hatizsak o) {
        int diff;
        diff = marka.compareTo(o.marka);
        if(diff != 0)
            return diff;
        else
            return Integer.compare(o.zsebekeSzama, zsebekeSzama);
    }




    
}
