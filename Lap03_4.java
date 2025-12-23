/*
 Write a program that prompts the user to enter two uppercase characters where the first character
indicates the student’s department and the second character indicates the student’s city of origin.
Display the student’s major and city based on the characters that he has entered as follows
Major - M: Mathematics, C: Computer Science, I: Information Technology
Status – J: Jeddah, M: Mecca, T: Taif, R: Riyadh, O: Other
 */
package Lap03;
import java.util.Scanner;

public class Lap03_4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter two characters :");
        
        char major = input.next().charAt(0);
        char status = input.next().charAt(0);
        
        if (major =='M')
        {
        System.out.println("Mathematics");
        }
          else if (major == 'C')
                {
                System.out.println("Computer Science");
                }
        else if(major=='I')
                {
                System.out.println("Information Technology");
                }
        else 
                {
                System.out.println("Invalid major");
                }
        
        
        if (status=='J')
        {
        System.out.println("from Jeddah");
    }
        else if(status=='M')
        {
            System.out.println("from Mecca");
        }
        
        else if(status=='T')
        {
            System.out.println("from Taif");
        }
          else if (status == 'R')
        {
            System.out.println("from Riyadh");
        }
        else if (status == 'O')
        {
            System.out.println("- Other");
        }
        else 
        {
            System.out.println("- Invalid city");
        }
           
    }
    
}
