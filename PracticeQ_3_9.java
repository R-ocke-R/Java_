public class PracticeQ_3_9 {
    public static void main(String[] args) {
        // Calculator c = new Calculator();
        // but this is not needed.
        // System.out.println(Calculator.powerDouble(2.0, 3));
        // System.out.println(Calculator.powerInt(2, 3));
        // ------------
        // Rectangle r= new Rectangle(4,5);
        // System.out.println(r.Area());
        // System.out.println((new Rectangle(5,8)).Area());
        // ------------
        Employee e = new Employee();
        e.getInfo(200, 8);
        e.printy();
        e.AddSal();
        e.printy();
        e.AddWork();
        e.printy();


        
    }
}
class Calculator{
    public static double powerInt(int n1, int n2) {
        return Math.pow(n1,n2);
        
    }
    public static double powerDouble(Double n1, int n2) {
        return Math.pow(n1,n2);
        
    }
}
class Rectangle{
    double length;
    double breath;
    Rectangle(double l, double b){
        length=l;
        breath=b;
    }
    public double Area(){
        return length*breath;
    }
}
class Employee{
    int salary;
    int hours;
    public void getInfo(int s, int h){
        salary=s;
        hours=h;
    }
    public void AddSal(){
        if (salary<500){
            salary+=10;
        }

    }
    public void AddWork(){
        if (hours>6){
        salary+=5;
        }
    }
    public void printy(){
        System.out.println("salary "+salary);
        System.out.println("hours "+hours);
    }
}