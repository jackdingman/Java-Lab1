
import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) { //used for calling objects
        Scanner check = new Scanner(System.in);
        System.out.println("Please enter an amount of money in the following format: $xx.xx ");
        double input = check.nextDouble();
        Purse purse = new Purse();
        Register register = new Register();
        purse = register.makeChange(input);
        System.out.println(purse.toString());

    }


}