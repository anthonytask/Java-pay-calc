import java.util.*;
class Main {
    public static void main(String[] args) {
        
        Scanner inputScanner = new Scanner(System.in);
        int hours;
        int rate;
        int pay;
        
        System.out.println("How many hours did you work?");
        hours = inputScanner.nextInt();
        
        System.out.println("How much are you paid per hour?");
        rate = inputScanner.nextInt();
        
        pay = hours * rate;
        
        System.out.println("You will be paid $" + pay + ".");
    }
}
	

