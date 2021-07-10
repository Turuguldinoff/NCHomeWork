public class Box implements Shape {
    
    private double side;
    private Color color;

    public Box() {
    }

    public Box(double side) {
        this.side = side;
        
    }
    
    public Box(double side, Color color) {
        this.side = side;
        this.color = color;        
    }

    public double getSide(){
        return this.side;
    }
    
    public Color getColor(){
        return this.color;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Box[side = " + side + ", color = " + color + "]";
    }

    public double getArea() {
        if (side >0) {
            return Math.pow(side, 2);
        }
        else{
            System.out.println("Side negative number");
            return -1;
        }
    }
    
}
