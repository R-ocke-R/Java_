// static block
// class level, one time execution block when class is loaded into memory. 
// static {      }
// to initialize the static variables of the class
// at the time of .class file loading by the jvm
// it execute automatically
//static block execute before the main method
public class StaticBlockDemo {
    static int rollno;
    static
    {
      rollno = 69;
    }
  
    // we can overload static method
    public static void method1(int a)
    {
  
      // some statements
    }
    public static void method1()
    {
      System.out.print(rollno +"\n");
      System.out.print("static method ");
    }
    public static void main(String[] args) {
      System.out.print("main method ");
     // System.out.println(StaticBlockDemo.rollno);
      StaticBlockDemo.method1();
    }
  
  }