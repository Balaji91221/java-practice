class student{
    private int rollno;
    private String name;
    private boolean Attendance;
    public  student(int rollno){
        this.rollno=rollno;
        
    }

public void StudentAttendance(boolean flag){
    if(!Attendance){
        Attendance=flag;
        System.out.println("Present");
    }
    else{
        System.out.println("Absent");
    }
}
public boolean getAttendance(){
    System.out.println(" Attendance is taken");
    return Attendance;
    
}
}   
public class data {
  public static void main(String[] args) {
    student s = new student(1);

    s.StudentAttendance(true);
    s.getAttendance();
  }
}