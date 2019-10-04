public class LinearEquation {
private double a,b,c,d,e,f;

    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    public boolean isSolvable(){
if((this.a*this.d)-(this.b*this.c)!=0)
    return true;
else
    return false;
}

public double getX(){
    if(isSolvable()){
return (((e*d)-(b*f))/((a*d)-(b*c)));
    }
else
return 0;
    }

public double getY(){
        if(isSolvable()){
return (((this.a*this.f)-(this.e*this.c))/((this.a*this.d)-(this.b*this.c)));
    }
else
return 0;
    }


    
    public String toString() { 
  if(getX() != 0 || getY() !=0){
  return "x= "+getX() + " y= " + getY();
  }
else
  {
    return "The equation has no solution.";
  }
    
    }

}
