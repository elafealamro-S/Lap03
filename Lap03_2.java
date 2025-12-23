/*
Write a program that prompts the user to enter a letter and check whether the letter is a
vowel or consonant.
 */
package Lap03;
import java.util.Scanner;

public class Lap03_2 {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.print("Enter a lowercase English letter : ");
        char letter = input.next().charAt(0);
  
        if(letter == 'a' || letter == 'o' || letter == 'i' || letter == 'e' || letter == 'u')
              {
              System.out.println(letter + " is a vowel");
                }
        else if(letter >='a'&&letter<='z')
        {
            System.out.println(letter +" is a consonant");
        }
        else {
            System.out.println(letter +" is not a lowercase letter");
        }
        
    }
    
}
