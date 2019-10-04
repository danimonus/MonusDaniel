public class Rectangle {
    public double width;
    public double height;
    
    public Rectangle(){
    this.height = 1;
    this.width = 1;
    }
    public Rectangle(double w, double h){
    this.height = h;
    this.width = w;
    }
public double getArea(){
return this.height*this.width;
}
public double getPerimeter(){
return 2*(this.height+this.width);
}

    @Override
    public String toString() {
        return "Rectangle= " + "width=" + width + ", height=" + height  + "Area="+this.getArea() + " Perimeter="+this.getPerimeter();
    }



}