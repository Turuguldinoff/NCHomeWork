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
        return Math.PI * radius * radius;
    }
    
}
