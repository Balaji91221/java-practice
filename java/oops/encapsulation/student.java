 public class student {
    private float  cgpa;
    String name;
    public void Rollno(String name){
        this.name=name;
    }
    public  void cgpa(float cgpa){
        this.cgpa=cgpa;
    }



public static void main(String args[]){
    student s=new student();
    s.Rollno("Rahul");
    s.cgpa(8.5f);
    System.out.println(s.name);
    System.out.println(s.cgpa);
}
 }