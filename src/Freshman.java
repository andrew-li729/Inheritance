public class Freshman extends Student implements Score {
    String basics;
    double score;
    Freshman(String n,int id,String c,String b,double sc){
        super(n,id,c);
        basics = b;
        score=sc;
    }
    public void displayF(){
        System.out.println("Basics: "+basics);
    }

    public void setScore(){
        score=score*1.5;
        System.out.println("Score of freshman: "+score);
    }
}
