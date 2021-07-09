public class Box implements Shape {
    
    private double side;
    private String color;

    public Box() {
    }

    public Box(double side) {
        this.side = side;
        
    }
    
    public Box(double side, String color) {
        this.side = side;
        this.color = color;        
    }

    public double getSide(){
        return this.side;
    }
    
    public String getColor(){
        return this.color;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Box[side = " + side + ", color = " + color + "]";
    }

    public double getArea() {
        return side * side;
    }
    
}
