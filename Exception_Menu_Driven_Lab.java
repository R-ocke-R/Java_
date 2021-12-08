import java.util.Scanner;

public class Switch_expressions {
    public static void main(String[] args) {

        System.out.println("choose your error");
        System.out.println("1- ArithmaticException");
        System.out.println("2- ArrayIndexOutOfBoundsException");
        System.out.println("3- StringIndexOutOfBoundsException");
        System.out.println("4- NullPointException");
        System.out.println("5- NumberFormatException");
        System.out.println("6- exit");
        while (true){
            try (Scanner sc = new Scanner(System.in)) {
                int choice;
                choice=sc.nextInt();
                switch (choice) {
                    case 1 -> {
                        System.out.println("one");
                    }
                    case 2 -> {
                        System.out.println(("two"));
                    }
                    case 3 -> {
                        System.out.println("three");
                    }
                    case 4 -> {
                        System.out.println("four");
                    }
                    case 5 -> {
                        System.out.println("five");
                    }

                }

            }
        }

    }
}

