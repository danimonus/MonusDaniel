package F1;

import java.util.Date;

public class GeometricShape {
private String color;
private boolean filled;
  private java.util.Date dateCreated;

public java.util.Date getDateCreated() {
    return dateCreated;

  }

    public GeometricShape() {
                dateCreated = new java.util.Date();
                this.filled = false;
                this.color = "white";
    }




    public GeometricShape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
public boolean isFilled() {
      return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
  
public String toString() {
       return "created on " + dateCreated + "\ncolor:" + color +
         " and filled:" + filled;
     }
    


}
