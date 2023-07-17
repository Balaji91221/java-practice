public class Bank{
 //write inheritance example
 int salary = 10000;
    int getSalary(){
        return salary;
    }
    class Programmer extends Bank{
        int bonus = 5000;
        int getBonus(){
            return bonus;
        }
    }
    class Manager extends Bank{
        int bonus = 10000;
        int getBonus(){
            return bonus;
        }
    }
    public static void main(String[] args) {
        Bank b = new Bank();
        b.getSalary();
         System.out.println("Salary: "+b.getSalary());
         Bank.Programmer p = b.new Programmer();
         System.out.println("Salary: "+p.getSalary());
         System.out.println("Bonus: "+p.getBonus());
         Bank.Manager m = b.new Manager();
         System.out.println("Salary: "+m.getSalary());
         System.out.println("Bonus: "+m.getBonus());
    }

}