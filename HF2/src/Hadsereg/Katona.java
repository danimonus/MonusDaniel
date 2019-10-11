package Hadsereg;

public class Katona {
    double tamadoEro;
    private double vedoEro;

    public Katona() {
        this.tamadoEro = 5.5;
        this.vedoEro = 5.5;
    }

    public Katona(double tamadoEro, double vedoEro) {
        this.tamadoEro = tamadoEro;
        this.vedoEro = vedoEro;
    }

    public double getTamadoEro() {
        return tamadoEro;
    }

    public double getVedoEro() {
        return vedoEro;
    }

    public void setTamadoEro(double tamadoEro) {
        this.tamadoEro = tamadoEro;
    }

    public void setVedoEro(double vedoEro) {
        this.vedoEro = vedoEro;
    }

    @Override
    public String toString() {
        return "TE: " + tamadoEro + " VE: " + vedoEro;
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
        final Katona other = (Katona) obj;
        if (Double.doubleToLongBits(this.tamadoEro) != Double.doubleToLongBits(other.tamadoEro)) {
            return false;
        }
        if (Double.doubleToLongBits(this.vedoEro) != Double.doubleToLongBits(other.vedoEro)) {
            return false;
        }
        return true;
    }
}
