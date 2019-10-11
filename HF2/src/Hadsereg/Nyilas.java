package Hadsereg;

public class Nyilas extends Katona{
    private int lotav;

    public Nyilas() {
        this.lotav = lotav;
    }
    
    public Nyilas(int lotav, double tamadoEro, double vedoEro) {
        super(tamadoEro, vedoEro);
        this.lotav = lotav;
    }
    
    

    public int getLotav() {
        return (int) (lotav + getTamadoEro());
    }

    public void setLotav(int lotav) {
        this.lotav = lotav;
    }   
}
