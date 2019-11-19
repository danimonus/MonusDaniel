package F_3;

public class Tea implements Rendezheto<Tea>{
public String nev;
public int ar;
public Tea(String s,int j) {
nev=s;
ar=j;
}

    @Override
    public boolean egyenlo(Object O) {
        Tea ar = (Tea)O;
        return this.ar==ar.ar;
    }

    @Override
    public boolean nagyobbMint(Object O) {
        Tea ar = (Tea)O;
        return this.ar>ar.ar;
    }

    @Override
    public boolean kissebbMint(Object O) {
        Tea ar = (Tea)O;
        return this.ar<ar.ar;
    }

    @Override
    public int compareTo(Tea o) {
        if(this.ar > o.ar)
            return 1;
        else if(this.ar == o.ar)
            return 0;
        else
            return -1;
    }

   

   


}


