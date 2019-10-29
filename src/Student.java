public class Student {
    String name;
    int ID;
    String course;

    //define a constructor method for Student class here
    public Student(String n,int id,String c){
        name = n;
        ID = id;
        course = c;
    }




    public void displayData(){
        System.out.println ("Name: "+ name);
        System.out.println ("ID: "+ ID);
        System.out.println("Course: "+ course);
    }

}
