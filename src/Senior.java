public class Senior extends Student {
    String project;
    double score;
    Senior(String n,int id,String c,String p,double sc){
        super(n,id,c);
        project=p;
        score=sc;
    }

    public void display(){
        System.out.println("Project is: "+project);
    }

    public void setScore(){
        score=score*2;
        System.out.println("Score of a Senior: "+score);
    }
}
