import java.lang.reflect.Constructor;

import javax.management.ConstructorParameters;

class PracticeQ_27_8{
    public static void main(String[] args) {
        // shape sp= new shape();
        // sp.draw();
        // sp.erase();
        gender g = new gender();
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
