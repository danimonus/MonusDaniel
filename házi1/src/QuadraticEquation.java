public class QuadraticEquation {
    private double a,b,c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
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

   
    public double getDiscriminant() {
    double dis = (b*b)-(4*a*c);
    if(dis==0)
        return 0;
    return dis;
    
    }
    
    public double getRoot1(){        
       if(getDiscriminant() <= 0){
       return 0;}
       else return (-b+Math.sqrt(getDiscriminant()))/(2*a);
       
       
            
    }
        public double getRoot2(){       
        if(getDiscriminant() <= 0){
       return 0;}
       else return (-b-Math.sqrt(getDiscriminant()))/(2*a);
         
          
    }

@Override
    public String toString() {
        if(getDiscriminant() > 0){
        return ("X1= "+getRoot1() + " X2= "+getRoot2()); 
        }
        else{
        if(getDiscriminant()==0){
        return "X= "+(-b+Math.sqrt(getDiscriminant()))/(2*a);
        }
        else{
        return "The equation has no roots.";
        }
        }
    }
  
}
