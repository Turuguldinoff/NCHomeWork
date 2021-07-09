public class Main {

    public static void main(String[] args) {
        Shape[][] list = new Shape[1][4];
        list[0] = new Shape[4];
        list[0][0] = new Box(2);
        list[0][1] = new Circle(1);
        list[0][2] = new Ellipse(2, 3);
        list[0][3] = new Triangle(9, 12, 15);

        for (Shape[] shape : list){
            for (Shape shape1 : shape) {
                System.out.println(shape1.getArea());
            }
        }          
    }
}