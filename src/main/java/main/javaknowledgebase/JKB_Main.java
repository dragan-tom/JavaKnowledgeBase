/**Here is a list of all aquired Java knowledge so far.
 * There should be no conflict with running project with all features turned on. 
 * All comments are search-friendly.
 */ 

package main.javaknowledgebase;

import java.util.Calendar;
import java.util.Scanner; //Used for user input of primitives.


public class JKB_Main {

    /**
     * @param args the command line arguments args 
     */
    
    public static void main(String[] args) {
    
        System.out.println("---------If and else if condition statement--------");
        
        int ageLegalVerify = 18;
        
        if (ageLegalVerify < 18) {
            System.out.println
            ("This person is " + ageLegalVerify + " years old, and is a minor.");
        } 
        else {
            System.out.println
            ("This person is " + ageLegalVerify + " years old, and is an adult.");
        }
        
    /** System.out.println("-------------------Scanner input------------------"); 
        
        System.out.println("Enter your age:");
        Scanner userInputAge =new Scanner(System.in);
        int userAge = userInputAge.nextInt();
        System.out.println("User age is " + userAge);
    */    
        System.out.println("---------For loop and divisibility boolean---------"); 
        
        int twoDigit; //list all two digit numbers.
        
        for (twoDigit=10; twoDigit<100; twoDigit++){
            System.out.print(twoDigit + " ");
            if ((twoDigit+1) % 10 ==0){System.out.println("");
            }
        }
        System.out.println("");
        
        System.out.println("-------------Enhanced or for-each looping-----------"); 
        
        String[] daysOfWeek = {
			"Sunday", "Monday", "Tuesday", "Wednesday",
			"Thursday", "Friday", "Saturday"
			};
        
        for (String day : daysOfWeek ) {
	         System.out.println(day);
	         }
        
        System.out.println("---------------------Swithes-----------------------"); 
        int dayOfWeek = 6;
        
        switch (dayOfWeek){
            case 1: System.out.println("Today is a work day. It's Monday.");
            break;
            case 2: System.out.println("Today is a work day. It's Tuesday.");
            break;
            case 3: System.out.println("Today is a work day. It's Wednesday.");
            break;
            case 4: System.out.println("Today is a work day. It's Thursday.");
            break;
            case 5: System.out.println("Today is a work day. It's Friday.");
            break;
            case 6: 
        	case 7: System.out.println("It's the weekend!");
            break;
            default: System.out.println("Error: Not a valid day of the week.");            
        }
         
        System.out.println("-----------------Continue and Array---------------"); 
                
        //Find players over 2m tall. Ignore minors.
         
        String[] plName = {"John", "Fred", "Eric", "Mitch", "Hose", "Ben", "Ed"};
        float[] plHeight = {206, 198, 180, 210, 175, 185, 201};
        int[] plAge = {26, 28, 36, 30, 22, 19, 15};
        int numberOfCandidates = plName.length;
        
        for (int i=0; i<numberOfCandidates; i++){
            if (plAge[i] < 18)
                continue;
            if (plHeight[i]>200)
                System.out.println(plName[i] + " is " + plAge[i] + 
                        " years old and is " + plHeight[i]/100 + "m tall.");
        }
        
        System.out.println("-------------Creating a monthly calendar-----------"); 
        
        //Font specific. Works with default fonts in Eclipse, not in netBeans.
        //User should input number of days and on which day of the week it starts.
        
        int g = 1;
		int h = 0;
		int monthStartOnWeekday = 6;
		String emptyDay = "    ";
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");
			
		while (h<(monthStartOnWeekday-1)) {
			System.out.print(emptyDay);
			h++;
		}
		while ( g<=31 ){
			if ( ((monthStartOnWeekday-1)+g) % 7 == 0){
				System.out.println(g);
			}
			else if (g<10){
				System.out.print(g+"   ");
			}
			else {
				System.out.print(g+"  ");
			}
			g++;
			}
		
        System.out.println("");

        System.out.println("---------------------Do while-------------------"); 
        
        //"Inform me of his score until he reaches 40+ points."
        
        int i = 33;
        do {
            System.out.println("He has " + i + " points so far.");
            i += 2;
        }       
        while (i < 42);
  
        System.out.println("--------------------Determine age------------------"); 
       
        Calendar c = Calendar.getInstance(); 
        System.out.format("%tB %te, %tY%n", c, c, c); // -->  "May 29, 2006"
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //getter and setter
        //&& and ||
        
        
    }
    
}
