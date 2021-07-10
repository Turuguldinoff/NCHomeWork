public class Circle implements Shape {
    
    private double radius;
    private String color;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
        
    }
    
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;        
    }

    public double getRadius(){
        return this.radius;
    }
    
    public String getColor(){
        return this.color;
    }

    public void setradius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle[ radius =" + radius + ", color = " + color + "]";
    }

    public double getArea() {
        if (radius > 0) return Math.PI * Math.pow(radius, 2);
        else{
            System.out.println("Radius negative number");
            return -1;
        }
    }
    
}
