import java.util.Scanner;

public class demoRectangle {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double d1,d2;
        String name;
        int id;
        String course;

        System.out.println("Enter two values: ");
        d1=input.nextDouble();
        d2=input.nextDouble();
        input.nextLine();

        System.out.println("Enter name, id, and score: ");
        name=input.nextLine();
        id=input.nextInt();
        course=input.nextLine();

        Rectangle s1;
        s1=new Rectangle(d1,d2);
        s1.area();

        Student student1;
        student1=new Student(name,id,course);
        student1.displayData();


    }
}
