
class Even extends Thread{
    public void run(){
        for (int i =0; i<10; i+=2){
        System.out.println(i);
        }
    }
}

class Odd implements Runnable{
    public void run(){
        for (int i =1; i<9; i+=2){
            System.out.println(i);
            }
    }
}


public class multi {
    public static void main(String[] args) throws InterruptedException {
        Even e= new Even();
        e.start();
        Odd o = new Odd();
        Thread t= new Thread(o);
        
        t.join();
        t.start();
        
    }

    
}
