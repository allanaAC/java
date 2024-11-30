//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //System.out.printf("Hello and welcome!");

        /**for (int i = 1; i <= 5; i++) {
         //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
         // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
         System.out.println("i = " + i);
         }*/

        int num = 225;
        boolean flag = true;
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                flag = false;
                System.out.println(i);
                break;
                //return i; // Return the lowest divisor found
            }
        }
        if (flag == true) {
            System.out.println("1");
        }

        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");
        boolean isEqual = str1.equals(str2); // Content comparison
        boolean isSameReference = (str1 == str2); // Reference comparison
        boolean isEqual1 = str1.equals(str3); // Content comparison
        boolean isSameReference1 = (str1 == str3); // Reference comparison

    }
}