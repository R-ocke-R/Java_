import java.util.Scanner;

public class Exception_Menu_Driven_Lab {
    public static void main(String[] args) {

        System.out.println("choose your error");
        System.out.println("1- ArithmaticException");
        System.out.println("2- ArrayIndexOutOfBoundsException");
        System.out.println("3- StringIndexOutOfBoundsException");
        System.out.println("4- NullPointException");
        System.out.println("5- NumberFormatException");
        System.out.println("6- exit");
        {
        // while (true){
        //     try (Scanner sc = new Scanner(System.in)) {
        //         int choice;
        //         choice=sc.nextInt();
        //         switch (choice) {
        //             case 1 -> {
        //                 System.out.println("one");
        //             }
        //             case 2 -> {
        //                 System.out.println(("two"));
        //             }
        //             case 3 -> {
        //                 System.out.println("three");
        //             }
        //             case 4 -> {
        //                 System.out.println("four");
        //             }
        //             case 5 -> {
        //                 System.out.println("five");
        //             }

        //         }

        //     }
        // }
        }
        int choice;
        try(Scanner sc = new Scanner(System.in)){
            choice = sc.nextInt();
            while (choice !=6){
                switch(choice){
                    case 1:
                    //   System.out.println(10/0); can't just simply do this.
                    //  have to try and catch this and then print the obj of exception
                    try{
                        System.out.println(10/0);
                    }
                    catch(ArithmeticException obj){
                        System.out.println(obj);

                    }
                    System.out.println("new choice number or 6 to exit");
                    choice=sc.nextInt();
                    break;
                    case 2:
                        try{
                            System.out.println(args[0]);
                        }
                        catch(ArrayIndexOutOfBoundsException obj){
                            System.out.println(obj);

                        }
                        System.out.println("new choice number or 6 to exit");
                        choice=sc.nextInt();
                        break;
                    case 3:
                        try{
                            String m ="manu";
                            System.out.println(m.charAt(5));
                        }
                        catch(StringIndexOutOfBoundsException obj){
                            System.out.println(obj);

                        }
                        System.out.println("new choice number or 6 to exit");
                        choice=sc.nextInt();
                        break;
                    case 4:
                        try{
                            String m =null;
                            System.out.println(m.charAt(1));
                        }
                        catch(NullPointerException obj){
                            System.out.println(obj);

                        }
                        System.out.println("new choice number or 6 to exit");
                        choice=sc.nextInt();
                        break;
                    case 5:
                    try{
                        int a = Integer.parseInt(null);
                        System.out.println(a);
                    }
                    catch(NumberFormatException obj){
                        System.out.println(obj);

                    }
                    System.out.println("new choice number or 6 to exit");
                    choice=sc.nextInt();
                    break;
                    default:
                    System.out.println("wrong choice you **#*#*#**, try again ");
                    choice= sc.nextInt();
                }
            }
        }
    }
}

//20+18=38 mins extra on clock