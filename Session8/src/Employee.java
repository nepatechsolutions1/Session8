public abstract class Employee {

   public double computePay() {
     return getSalary() * getHours();
   }
   
   public abstract int getSalary();
   public abstract int getHours();
   
}