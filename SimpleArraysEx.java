import java.nio.channels.ClosedSelectorException;
import java.util.Scanner;
public class SimpleArraysEx {

    public static void main(String[] args) {
        
        int [] weeklyTemps = { 0,   0,   0,   0,   0,   0,   0 };
        //                    Sun. Mon. Tue. Wed. Thu. Fri. Sat. 
        String [] weekNames = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        System.out.println("Registered " + weeklyTemps.length + " temperatures");



        //weeklyTemps[3]= 6;
        
        // HW2:try to give all 7 values from kb

        for (int index = 0; index < weeklyTemps.length; index++) {
            
            
            if(index == weeklyTemps.length ){
            break;
            }else{
                //for (int j = 0; j < weekNames.length; j++) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter a temperature for " + weekNames[index] + ":");
                int temperature  = sc.nextInt();
                weeklyTemps[index] = temperature; 
                //}
            }
            

            
        }        
        
        
        System.out.println();
        System.out.print()"HW2:try to give all 7 values from kb:\n");
        for (int index = 0; index < weeklyTemps.length; index++) {
            System.out.print(weeklyTemps[index]);
            System.out.print(" ");
            
        }

        System.out.println();
        System.out.println("HW1: show only the temperatures for monday - friday...");

        for (int index = 1; index < 6; index++) {
            System.out.print(weeklyTemps[index]);
            System.out.print(" ");
        }

    }
}