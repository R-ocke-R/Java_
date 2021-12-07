import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex_lab {
    public static void main(String[] args) {
        String target1="dbmsdbmsdbms dbmsdbmsdbmsdbmsdbms";
        String target =" jsldkjf dbms df22df dbmmm12s dfs22kj DBMS";
        String target2= "asdf123123 asdasd";
        String target3= "m 4# A&mm ttymmm";

        Pattern p = Pattern.compile ("dbms");
        Pattern p2 = Pattern.compile ("dbms", Pattern.CASE_INSENSITIVE);
        Pattern p3= Pattern.compile ("[a-z]{5}");
        Pattern p4= Pattern.compile("//s");
        Pattern p5= Pattern.compile("m*");
        Matcher m =p2.matcher(target);
        //default regex used by string tokenizer class for token seperation.
        int ctr =0;
        
        while (m.find()){
            System.out.println(m.group());
            System.out.println(m.start()+"---"+m.end());
            ctr++;
            


        }
        System.out.println(ctr);
    }

}


// public class Regex2 {
//     public static void main(String[] args) {
//         //first
//         // String target="6397955439";
//         // String target ="neeraj";
//         // Pattern p = Pattern.compile("[[0-9]{10}]?");
//         // 10 digit number check 
//         //first

//         // /second
//         String target ="6397955439";
//         Pattern p = Pattern.compile("0?[0-9]{10}");
//         //
//         // Pattern p3 = Pattern.compile("(0|91)[0-9]{10}");
//         //
//         // Pattern p = Pattern.compile("[n][a-z]+");
//         Matcher m = p.matcher(target);
//         System.out.println(m.matches());
//         while (m.find()){
//             System.out.println(m.start()+" to "+m.end()+"-----"+m.group());
//         }
//         // for email patching pattern
//         //String Targett="[a-zA-Z0-9_.]@gmail.com";
//         // all .com's accepted,
//         // String Targettt="[a-zA-Z0-9_.][@][gmail|yahoo].com";
//     }
// }
