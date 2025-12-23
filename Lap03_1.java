/*
 Write a Java program that generates two random double numbers between -20 and 20 and displays
the larger of the two numbers. (Hint : −20 ≤ 𝑛𝑢𝑚𝑏𝑒𝑟1, 𝑛𝑢𝑚𝑏𝑒𝑟2 ≤ 20).
 */
package Lap03;


public class Lap03 {

    public static void main(String[] args) {
        
         double numper1 = -20 + (Math .random() * 41);
         double numper2 = -20 + (Math .random() * 41);
         
         System.out.println("First number :" + numper1);
         System.out.println("Second number :" + numper2);
         
         if (numper1>numper2)
             {
                 System.out.println("The larger number is" + numper1);
             }
         
         else 
             System.out.println("The larger number is" + numper2);   
    } 
}
