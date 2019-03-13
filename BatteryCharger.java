
/**
 * Write a description of class FRQ2009Q3 here.
 *
 * @author Merle Crutchfield
 * @version 11/08/18
 */
 /* [STOP: Make a copy of this document in your own drive before making any changes to this document]

Name: 
Period:
Date:
FRQ: [for example, 2009 Q3]
Time to Complete: [for example, 17 minutes]
Score: 

Original Code:
After typing in the code that you wrote on your paper, before making any changes or trying to run the program, paste your code here.  Your score above should be based on this code.  The solutions and the scoring guidelines are in the shared Google folder inside the AP Review folder, in the FRQ Introduction Slideshow.  If your code does not immediately work, take some time going through your code and working through the problem on your own, and discuss it with people around you before looking at the solution.  This will be essential to learning from this experience.

Corrected Code:
After making corrections to your code so that it works, paste the corrected code here.

Comments:
This section must be filled out to receive credit.
Scores between 0-4: You probably had trouble with the major concepts in the question or even understanding the question itself. What stumped you?  Ask questions here that you need answers to so that we can work together to do better next time.

Scores between 5-7: You probably understood the major concepts behind the question but made some minor mistakes.  What were those mistakes?  Why did you make them?  What can you do to avoid them in the future?

Scores between 8-9:  You did well on this question.  Why?  How did you approach it?  Did you notice potential traps and avoid them or did you just know how to solve it immediately?  What advice can you give to other students in how to approach these problems?
*/
public class BatteryCharger
{
    //These are the values from the sample rate table provided in the question
    public int [] rateTable = {50, 60, 160, 60, 80, 100, 100, 120, 150, 150, 150, 200, 40, 240, 220, 220, 200, 200, 180, 180, 140, 100, 80, 60};
    
    public static void main(String [] args)
    {
        BatteryCharger b = new BatteryCharger();
        
        //These calls mimic those in part A and should return/print the following values: 40, 110, 550, 3710
        System.out.println(b.getChargingCost(12, 1));
        System.out.println(b.getChargingCost(0, 2));
        System.out.println(b.getChargingCost(22, 7));
        System.out.println(b.getChargingCost(22, 30));
        
        //These calls mimic those in part B and should return/print the following values: 12, 0 or 23, 22, 22
        System.out.println(b.getChargeStartTime(1));
        System.out.println(b.getChargeStartTime(2));
        System.out.println(b.getChargeStartTime(7));
        System.out.println(b.getChargeStartTime(30));
    }
    
    private int getChargingCost(int startHour, int chargeTime)
    {
        int cost = 0;
        for (int x = 0; x < chargeTime; x++)
        {
            cost += rateTable[(startHour + x) % 24];
        }
        return cost;
    }
    
    private int getChargeStartTime(int chargeTime)
    {
       int startTime = 0;
       for (int i = 1; i < 24; i++)
       {
           if (getChargingCost(i, chargeTime) < getChargingCost(startTime, chargeTime))
           {
               startTime = i;
           }
       }
       return startTime; 
    }
}

