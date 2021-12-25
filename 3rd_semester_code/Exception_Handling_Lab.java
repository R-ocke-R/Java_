import java.util.Scanner;

// 10th November OOPS Lab
public class Exception_Handling_Lab {
}
class test1{
    public static void main(String args[]) {
        System.out.println("this will get printed");
        // the above would not have printed if the exception was checked/compiled time exception

        //System.out.println(args[5]);// this again is a unchecked exception thus the program runs and later finds out the excception and adruptly terminates

        // this is ArrayIndexOutOfBoundsException    (unchecked exception)

        //System.out.println(10%0);

        // this is Arithmatic exception   (unchecked exception)

        //System.out.println("GLA".charAt(5));

        // this is StringIndexOutOfBoundsException

        System.out.println("End of the main method");


    }
}

class test2{
    public static Integer i1;

    // this will have null as its provided automatically by JVM.
    //static varaibles are given default initialization and this is an Integer Wrapper class object i1, thus object ==null.

    public static void main(String args[]){
        //Integer i2= new Integer(50);
        //above is depricated to give better time and space complexity
        Integer I2= Integer.valueOf(50);
        // the above highlight shows that boxing is not needed, we can use autoboxing.
        Integer I3=null;
        int i2;
        i2=I3;
        System.out.println(i2);
        // reference data type has default value null as given by JVM,
        // here i2 is primitive data type and it can't take null as data.

        // thus this gives NullPointerException

        }
}

class test3 {
    public static Integer i1;

    public static void main(String[] args) {
        Integer i1= 10;
        //Integer i1= new Integer("");
        // this gives NumberFormatException
        // also this cut shows that the constructor initailization of wrapper classes have been depricated. in java 1.8+

    }
}

//Thread.sleep
class test4{
    public static void main(String[] args) throws InterruptedException {
        System.out.println("one");
        Thread.sleep(5000);
        System.out.println("two");
        // this is InterruptedException resolved by throwing it
        // checked exception
    }
}

// java 1.8, 1.9 has amendements, called 'try with resourses', these can also be used to hadle except\ion.

class test5{
    public static void main(String[] args) {
        try(Scanner obj= new Scanner(System.in)){
            System.out.println(10/0);

        }
        /*catch(ArrayIndexOutOfBoundsException obj){
            // obj because object is throwed always
            // for the above exception this catch catch block won't work, and if this is the only catch block,
            // it will be an adrupt exception
        }
        */
        catch(ArithmeticException | ArrayIndexOutOfBoundsException obk){
            System.out.println("error");
            System.out.println(obk );
        }


        System.out.println("end");

    }
}


// multiple catch block were implemented in test5

// note that only the first error will be checked, and not the latter ones, as soon as the first error is try'ed then the flow goes to catch block thus
// the rest of the statements are ignored.


class test6{
    public static void main(String[] args) {
        try{
            System.out.println(10/0);

        }
        catch(ArithmeticException | ArrayIndexOutOfBoundsException obj){
            System.out.println("error");
        }
        System.out.println("end");

    }
}

class test7{
    public static void main(String[] args) {
        try{
            System.out.println(10/0);

        }
        catch(Exception obj){
            System.out.println("rw");
        }

        System.out.println("end");

    }
}

// multiple exception can be used as in test6 to reduce redundancy, also note that Exception is the parent class used in test7 and it includes all other
// but prefer to use the generic later than the specific ones when using multiple


// here try has error and its not catched either, but even after flowing out of the
class test8{
    public static void main(String[] args)   {
        try{
            System.out.println(10/4);

        }
        //catch(ArithmeticException obk){}
        finally{
            System.out.println("final block");
        }
        System.out.println("end");

    }
}

//transfer statement

//try{
 //       return
  //      }
//finally()

// even after this finally block runs. even after return calls.


// but System.exit() is used forcefully to dominate the finally block and thus it won't be executed.



class test9{
    public static void main(String[] args) {
        try{
            System.out.println(10/0);

        }
        finally{
            System.out.println();
        }

    }
}
class excep{
    static ArithmeticException obj;
    public static void main (String[] args){
        throw obj;
    }
}


