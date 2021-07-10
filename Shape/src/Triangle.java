public class Triangle implements Shape {
    
    private double sideA;
    private double sideB;
    private double sideC;
    private Color color;

    public Triangle() {
    }
    
    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public Triangle(double sideA, double sideB, double sideC, Color color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.color = color;   
    }

    public double getSideA(){
        return this.sideA;
    }

    public double getSideB(){
        return this.sideB;
    }

    public double getSideC(){
        return this.sideC;
    }

    public Color getColor(){
        return this.color;
    }

    public void setSideA(double sideA){
        this.sideA = sideA;
    }

    public void setSideB(double sideB){
        this.sideB = sideB;
    }
    
    public void setSideC(double sideC){
        this.sideC = sideC;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Triangle[ SideA =" + sideA + ", SideB =" + sideB  + ", SideC =" + sideC  + ", color = " + color + "]";
    }

    public double getArea() {
        if(sideA > 0 && sideB > 0 && sideC > 0){
            if(sideA + sideB > sideC && sideC + sideB > sideA && sideA + sideC > sideB){
                double p = (sideA + sideB + sideC) / 2;
                return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
            }else{
                System.out.println("Triangle none");
                return -2;
            }
        }
        else{
            System.out.println("Triangle sida negaive");
            return -1;
        }
    }
    
}