public class Rectangle {
double l;
double w;

    //define a constructor method for Rectangle class here
    public Rectangle(double dim1, double dim2){
        l=dim1;
        w=dim2;
    }





    public void area(){
        double a = l*w;
        System.out.println("Area of Rectangle: " +a);
    }
}
