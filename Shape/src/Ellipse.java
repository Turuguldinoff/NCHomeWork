public class Ellipse implements Shape {
    
    private double maxRadius;
    private double minRadius;
    private String color;

    public Ellipse() {
    }
    
    public Ellipse(double maxRadius, double minRadius) {
        this.maxRadius = maxRadius;
        this.minRadius = minRadius;
    }

    public Ellipse(double maxRadius, double minRadius, String color) {
        this.maxRadius = maxRadius;
        this.minRadius = minRadius;
        this.color = color;   
    }

    public double getMaxRadius(){
        return this.maxRadius;
    }
    
    public double getMinRadius(){
        return this.minRadius;
    }
    
    public String getColor(){
        return this.color;
    }

    public void setMaxRadius(double maxRadius){
        this.maxRadius = maxRadius;
    }
    
    public void setMinRadius(double minRadius){
        this.minRadius = minRadius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ellipse[ MaxRadius =" + maxRadius + ", MinRadius =" + minRadius  +", color = " + color + "]";
    }

    public double getArea() {
        if (maxRadius > 0 && minRadius > 0) return Math.PI * maxRadius * minRadius;
        else{
            System.out.println("One radius negative number");
            return -1;
        }
    }
    
}
