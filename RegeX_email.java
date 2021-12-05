import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


class RegeX_email{
    public static void main(String[] args) {
        System.out.println("manu wrote this code ");
        //target string
        String str= "sharmaManu@gmail.com";
        // String tr= "mini";
        // instantiation
        Pattern p = Pattern.compile("[a-zA-z]{1,22}[@](gmail.com|yahoo.com)");
        // Pattern p = Pattern.compile("manu|mini");
        Matcher m = p.matcher(str);
        
        
        while (m.find()){
            System.out.println("inside");

            System.out.println(m.group());;
        }
        
    }
}


// for email patching pattern
// String Targettt="[a-zA-Z0-9_.][@][gmail|yahoo|outlook|hotmail].com";
// 

class RegeXX_email{
    public static void main(String[] args) {
    //This is seperate from first class, first one is basic and took a lot of time this is more accurate to what sir asked for, it check for 4 different mail domains

                System.out.println("Give a valid email address: \n 1) Username must have 22 upper or lower character, digits or underscores. \n 2) must be one of these four domains \n gmail.com, outlook.com, yahoo.com, hotmail.com ");
                Pattern p = Pattern.compile("[\\w]{1,22}[@](gmail.com|yahoo.com|hotmail.com|outlook.com)");
                //now pattern will match a
                String str= new String();
                try(Scanner sc = new Scanner(System.in)){
                    str= sc.nextLine();
                }
                Matcher m = p.matcher(str);
                while (m.find()){        
                    System.out.println(m.group());;
                
        }
    }
}

//String Targett="[a-zA-Z0-9_.]@gmail.com";
// all .com's accepted,


class RegeXXX_email{
    public static void main(String[] args) {
                System.out.println("Give a valid email address: \n 1) Username must have 22 upper or lower character, digits or underscores. \n 2) can have any domain address but must be from 2 to 10 word characters and must end at .com ");
                Pattern p = Pattern.compile("[\\w]{1,22}[@][a-zA-z0-9]{2,10}[.com]{4}");
                CharSequence str;
                try(Scanner sc = new Scanner(System.in)){
                    str= sc.nextLine();
                }

                Matcher m = p.matcher(str);
                while (m.find()){        
                    System.out.println(m.group());;
                
        }
    }
}



//abd@gla.ac.in
// abc@gla.ac.af.ay.in

class RegeXXXX_email{
    public static void main(String[] args) {
                System.out.println("Give a valid email address: \n 1) Username must have 22 upper or lower character, digits or underscores. \n 2)gla.in and all other departments");
                Pattern p = Pattern.compile("[\\w]{1,22}[@][gla]{3}[\\w.]{0,10}[.in]{3}");
                CharSequence str;
                try(Scanner sc = new Scanner(System.in)){
                    str= sc.nextLine();
                }

                Matcher m = p.matcher(str);
                while (m.find()){        
                    System.out.println(m.group());;
                
        }
    }
}