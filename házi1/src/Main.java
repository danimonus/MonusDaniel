
public class Main {
    public static void main(String[] args) {
       
      
       Pont p1 = new Pont(4,6);
       Pont p2 = new Pont(3.5,5.5);
       Pont p3 = new Pont(2,7.4);
       Pont p4 = new Pont(3.2,7.7);
       
       p1.setY(p1.getY()+5);
       p1.setX(p1.getX()-3.4);
       p2.setY(p2.getY()+5);
       p2.setX(p2.getX()-3.4);
       p3.setY(p3.getY()+5);
       p3.setX(p3.getY()+5);
       p4.setY(p4.getX()-3.4);
       p4.setX(p4.getX()-3.4);
       
       
        System.out.println(p1.getX()+" "+p1.getY()+" "+p2.getX()+" "+p2.getY() + " " + p3.getX() + " " + p3.getY() + " " + p4.getX() + " " + p4.getY());
       
    }
    
}
