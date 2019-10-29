public class testInheritance {
    public static void main(String[]args){
        Freshman f1=new Freshman("Bob",1,"C++","History",90);
        Senior s1=new Senior("Rod",2,"Java","Database",85);

        f1.displayData();
        f1.displayF();
        f1.setScore();
        s1.displayData();
        s1.display();
        s1.setScore();

        Student stu; //declaring object for base class
        stu=new Freshman("Justin",3,"Python","Calculus",75);
        stu.displayData();
        //stu.displayF();
        stu=new Senior("Mary",4,"Scratch","System Software",65);
        stu.displayData();
    }
}
