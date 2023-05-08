package virk.manpreet.findsmallestvalue;
import java.util.Scanner;
/**
 *
 * @author sukhm
 */
public class FindSmallestValue {

    public static void main(String[] args) {
      Scanner userdigits = new Scanner(System.in);
       System.out.print("Enter Number of ints you want to compare");
       int d = userdigits.nextInt();
       System.out.print("Enter your first digit");
       int smallestdigit =  userdigits.nextInt();
       for(int i = 1 ; i < d; i++){
           System.out.println("Enter Next digit");
           int nextdigit = userdigits.nextInt();
           if(nextdigit < smallestdigit){
               smallestdigit = nextdigit;
                       
           }
       }
       System.out.println("The Smallest int of entered digits are:" + "  " + smallestdigit);
    }
}
