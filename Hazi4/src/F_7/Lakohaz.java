package F_7;


public class Lakohaz implements Comparable<Lakohaz>{

public double emeletMagassag;
private String cim;
private int emeletekSzama;
private double alapterulet;

    public Lakohaz(String cim, int emeletekSzama, double alapterulet) {
        this.emeletMagassag = 3.2;
        this.cim = cim;
        this.emeletekSzama = emeletekSzama;
        this.alapterulet = alapterulet;
    }

    public String getCim() {
        return cim;
    }

    public int getEmeletekSzama() {
        return emeletekSzama;
    }

    public double getAlapterulet() {
        return alapterulet;
    }


public double legkobmeter(){
return this.alapterulet*this.emeletMagassag*this.emeletekSzama;
}

 @Override
    public int compareTo(Lakohaz o) {
        if(this.legkobmeter()>o.legkobmeter())
            return 1;
        else if(this.legkobmeter() == o.legkobmeter())
            return 0;
        else
            return -1;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
         sb.append(emeletMagassag);sb.append(" ");sb.append(cim);sb.append(" ");sb.append(emeletekSzama);sb.append(" ")
        ;sb.append(alapterulet);sb.append(" ");sb.append(legkobmeter());
         return sb.toString();
    }

  
   

}
