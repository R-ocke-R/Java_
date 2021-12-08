import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class November_seventeenth {
    public static void main(String[] args) throws IOException {
        // buffered reader is just for file handler, but it doesn't have specific methods for primitive data types.
        try(Scanner s = new Scanner (System.in); BufferedReader br= new BufferedReader(new InputStreamReader(System.in))){
            // cannot assign a value to final variable s
            // s= new Scanner(System.in);
            int a = s. nextInt();
            System.out.println(a);

        }
        catch(IOException obj){
            System.out.println("Error Catch block");
        }
    }
}



// throws ke sath sirf checked ko handle karte he, unchecked ko nahi karte
class MyExp{
    public static void m1() throws InterruptedException {
        m2();


    }
    public static void m2() throws InterruptedException{
        Thread.sleep(1000);
        // this is a checked unhandled exception, program won't run.
        // now  throws is used to throw the exception.
    }

    public static void main(String[] args) throws InterruptedException {
        m1();
        System.out.println("end of program");
    }
}
// at all levels the error's are throwed and default error mechanism handles the exception.
// and this way the sop statements run and end of program || the rest of the program runs.


class MyExp1{
    public static void m1() throws ArithmeticException {
        m2();

    }
    public static void m2() throws ArithmeticException{
        System.out.println("one");
        System.out.println(100/0);

        // this is a un checked unhandled exception, program won't run.
        // now  throws is used to throw the exception.
    }

    public static void main(String[] args) throws ArithmeticException{
        //try{m1();}
        //catch(ArithmeticException obj){}
        m1();
        System.out.println("end of program");
    }
}

// in this case the error's are throwed but are not checked and sovled b y default error handler
// thus we catch the error ourself to get graceful termination.

// thus default exception mechanism are only for checked exception



class MyExp2{
    public static void m1() throws ArithmeticException {
        m2();

    }
    public static void m2() throws ArithmeticException{
        try{
            System.out.println(100/0);
        }
        catch(ArithmeticException obj){
            System.out.println(obj);
        }

        // handling unchecked exception using try and catch block, to get graceful termination.
    }

    public static void main(String[] args) throws ArithmeticException {
        m1();
        System.out.println("end of program");
    }
}

//ping sir about ...
/* Multithreading


    Multitasking is executing multiple tasks simultaneously
    1) process based multitasking. (multiprocesseinn) (OS)
    2) thread based multitasking.  (multi threading)  (programming)

    oen process with various sub process.
    small individual process are called thread.

    ---> two ways for multithreading
    a) by using thread class   ( this has a drawback, as java supports only one inheritance )

    b) by implementing the runnable interface.

    ---> steps to create multithreaded applications. (IN ONE NOTE>






//next topics.
//generics
//with colection frameworks
//GDBC


 */




class Mythread extends Thread{
    public void run(){
        for (int i=1;i<10;i++){
            System.out.println(("Thread"+ i));
        }
    }
}

class Myy{
    public static void main(String[] args) throws InterruptedException {
        Mythread obj=new Mythread();
        obj.start();
        Thread.sleep(1100);
        for( int i=0; i<10;i++){
            System.out.println("Main thread"+i);

        }
    }
}



class Mythread1 implements Runnable{
    @Override
    public void run(){
        for (int i=1;i<10;i++){
            System.out.println(("Thread"+ i));
        }
    }
}
class Myy2 {
    public static void main(String[] args) {
        Mythread1 obj = new Mythread1();
        Thread obj1 = new Thread(obj);
        obj1.start();
        // new Thread(new Mythread1).start()     simplified.
        //"smart programming"
        for (int i = 0; i < 10; i++) {
            System.out.println("Main thread" + i);

        }
    }
}
/*    public static void main(String[] args) {
        Thread obj1= new Thread(() -> {
            @Override
            public void run() {
                for( int i=0; i<10;i++){
                    System.out.println("Main thread"+i);

                }

            }
        }
    }
}

 */









