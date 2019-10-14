package Katona;

public class Nyilas extends Katona {
    private int lőtáv;

    public Nyilas(int támadó_erő, int védő_erő, int lőtáv) {
        super(támadó_erő, védő_erő);
        this.lőtáv = lőtáv;
    }

    public int getLőtáv() {
        return lőtáv+getTámadó_erő();
    }

    public void setLőtáv(int lőtáv) {
        this.lőtáv = lőtáv;
    }

    @Override
    public String toString() {
        return "Nyilas:" +
                "TE: " + getLőtáv() +
                ", VE: " + getVédő_erő();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Nyilas))
        {
            return false;
        }
        Nyilas ny = (Nyilas)obj;
        return super.equals(ny) && this.lőtáv == ny.getLőtáv();
    }
}
