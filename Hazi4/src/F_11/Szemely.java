package F_11;


public class Szemely implements Comparable<Szemely>
{
 protected String név;
 protected int életkor;
 private boolean férfi;

    public Szemely(String név, int életkor, boolean férfi) {
        this.név = név;
        this.életkor = életkor;
        this.férfi = férfi;
    }

    public String getNév() {
        return név;
    }

    public int getÉletkor() {
        return életkor;
    }

    public boolean isFérfi() {
        return férfi;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public void setÉletkor(int életkor) {
        this.életkor = életkor;
    }

    public void setFérfi(boolean férfi) {
        this.férfi = férfi;
    }

    @Override
    public String toString() {
        return  "\n"+név + " " + életkor + " " + férfi ;
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
        final Szemely other = (Szemely) obj;
        if (this.életkor != other.életkor) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Szemely o) {
        if(this.életkor>o.életkor)
            return 1;
        else if(életkor == o.életkor)
            return 0;
        else
            return -1;

    }
    
    

 




}


    

