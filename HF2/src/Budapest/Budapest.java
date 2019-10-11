import java.util.Arrays;
import java.util.Scanner;

class Tura implements Comparable {
    String év;
    String hónap;
    String nap;
    String név;
    int táv;

    public Tura(String év, String hónap, String nap, String név, int táv) {
        this.év = év;
        this.hónap = hónap;
        this.nap = nap;
        this.név = név;
        this.táv = táv;
    }

    @Override
    public String toString() {
        return this.év + ";" + this.hónap + ";" + this.nap + ";" + this.név;
    }

    @Override
    public int compareTo(Object o) {
        Tura ujt = (Tura)o;
        int ujturaev = Integer.parseInt(ujt.év);
        int ujturahonap = Integer.parseInt(ujt.hónap);
        int ujturanap = Integer.parseInt(ujt.nap);
        int ujev = Integer.parseInt(this.év);
        int ujhonap = Integer.parseInt(this.hónap);
        int ujnap = Integer.parseInt(this.nap);

        if(ujev == ujturaev)
        {
            if(ujhonap == ujturahonap)
            {
                if(ujnap == ujturanap)
                {
                    return this.név.compareTo(ujt.név);
                }
                else return ujnap - ujturanap;
            }
            else return ujhonap - ujturahonap;
        }
        else return ujev - ujturaev;
    }
}


public class Budapest {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.nextLine());

        int db = 0,max = 0;
        Tura[] t = new Tura[N];
        while(db != N)
        {
            String valami = sc.nextLine();
            String[] s = valami.split(";");
            int ossz = 0;
            for(int i = 4; i < s.length; i++) {
                ossz += Integer.parseInt(s[i]);

            }

            if(ossz > max)
                max = ossz;

            Tura sor = new Tura(s[0], s[1], s[2], s[3], ossz);
            t[db] = sor;
            db++;
        }

        Arrays.sort(t);

        for(int i = 0 ; i < N; i++)
        {
            if(t[i].táv == max )
                System.out.println(t[i]);
        }

    }
}