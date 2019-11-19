package F_11;

public class Hallgato extends Szemely{
private static double joAtlag;
double atlag;

    public Hallgato(String név, int életkor, boolean férfi,double atlag) {
        super(név, életkor, férfi);
        this.atlag = atlag;
        
    }

    public static void setJoAtlag(double joAtlag) {
        Hallgato.joAtlag = joAtlag;
    }

    public boolean joAtlag (double atlag){
    boolean ret = true;
    
    if(atlag>4)
       ret = true;
    else
        ret = false;
    
    return ret;
    
    }
    
    
    @Override
    public String toString() {
        return  "\n"+super.név+"\n"+super.életkor+"\n"+super.isFérfi()+"\n"+ atlag;
    }
    





    
}
