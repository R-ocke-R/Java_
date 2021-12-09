import java.util.Arrays;

class PracticeQ_27_8{
    public static void main(String[] args) {
        // shape sp= new shape();
        // sp.draw();
        // sp.erase();
        Patient p= new Patient("Arjun", 10, 2);
        System.out.println(p.computeBMI());
    }
}
class shape{
    public void draw(){
        System.out.println("Drawing Shape");
    }
    public void erase(){
        System.out.println("Erasing Shape");
    }
}

class Patient{
    String name;
    double height;
    double weight;
    Patient(String n, double h, double w){
        name= n;
        height=h;
        weight=w;

    }

    public double computeBMI()
    {
            System.out.println(name);
        return weight/(height*height);
    }
}
class gender{
    public static void main(String[] args) {
        Character gen =Character.toLowerCase(args[0].charAt(0));
        int age =Integer.parseInt(args[1]);
        System.out.println(age);
        
        if (gen=='f' && 1<=age && age<=58){
            System.out.println("Percentage of interest 8.2%");
            //statements
        }
        if (gen=='f' && 59<=age && age<=100){
            System.out.println("Percentage of interest 9.2%");
            //statements
        }
        if (gen=='m' && 1<=age && age<=58){
            System.out.println("Percentage of interest 8.4%");
            //statements
        }
        if (gen=='m' && 1<=age && age<=100){
            System.out.println("Percentage of interest 10.5%");
            //statements
        }
    }
}
//4th is pretty basic.
class Sample{
    public static void main(String[] args) {
        System.out.println("Welcome   "+args[0]);
        
    }
}
class CommandLine{
    public static void main(String[] args) {
        if (args.length==0){
            System.out.println("No value");

        }
        else{
            System.out.println(Arrays.toString(args));
        }
    }
}

class CommandLineTwo{
    public static void main(String[] args) {
        //works but no need to exception handling as there won't ever be any exception
        //as even the empty array is converted to [] string, and i can't if block that... for now.
        try{
            System.out.println(Arrays.toString(args));
        }
        catch(ArrayIndexOutOfBoundsException obj){
            System.out.println("No value");
        }
    }
}

class tensDigit{
    public static void main(String[] args) {
        // nice way to find out 10's digit of any given number
        //gives appropriate digit and for 2+ digit numbers and 0 for single digit number and 0
        int n=0;
        int m= n%100;
        System.out.println(m/10);
    }
}