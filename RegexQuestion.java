import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexQuestion{

    public static void main(String[] args) {
        //  Hello, This file has six questions given on 3rd Decemeber by Neeraj sir.
        

// Q Write a regular expression to represent all names start with N | n  with any length 

// Q. Write a regular expression to represent all names end with J | j

// Q Write a regular expression to represent all names start with N|n  and ends with j|J

// Q. Write a program to check whether the given no is a valid mobile number or not? The mobile no is entered by the command line argument 

// Q. Write a program to check whether the given mail id is valid or not 

// Q. Write a program in java to check string contains special characters in java

        System.out.println("print a choice based on the comments");
        int choice;
        String str;
        try (Scanner sc = new Scanner (System.in)) {
            choice = sc.nextInt();
            System.out.println("now enter valid string based on your choice");
            sc.nextLine();
            str=sc.nextLine();
        }
        // System.out.println(args[0]);

        // can't utilize the choice based question using methods, as i need matcher and pattern objects
        // so will use switch case.
        Pattern p;
        Matcher m;
        int count=0;
        
        switch (choice) {
        case 1:
        // all name in string that start with N
            p= Pattern.compile("[Nn][a-zA-z]{0,20}");
            m= p.matcher(str);
            System.out.println(str);
            while (m.find()){
                count+=1;
                System.out.println(m.group()+ "  "+m.start()+"   "
                 +m.end());;
            }
            System.out.println(count);
            break;
        case 2:
        // all name in string that start with N
            p= Pattern.compile("[a-zA-z]{0,20}[Jj]");
            m= p.matcher(str);
            System.out.println(str);
            while (m.find()){
                count+=1;
                System.out.println(m.group()+ "  "+m.start()+"   "
                 +m.end());;
            }
            System.out.println(count);
            break;
        case 3:
        // all name in string that start with N
        p= Pattern.compile("[Nn][a-zA-z]{0,}[Jj]");
        m= p.matcher(str);
        System.out.println(str);
        while (m.find()){
            count+=1;
            System.out.println(m.group()+ "  "+m.start()+"   "
             +m.end());;
        }
        System.out.println(count);
        break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        }
        
    }
}