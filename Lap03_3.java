/*
 Can a number be divided into two parts (need not be equal) in such a way that each of the parts is
an even number? Print YES if the number can be divided into two parts with each part being an
even number and print NO otherwise. (problem adapted from Watermelon -
https://codeforces.com/problemset/problem/4/A)
Sample runs of the program
Sample # Input Output
1 8 YES
2 7 NO
Hint : In the first sample case, the number can be divided into two parts - 2 and 6 (or 4 and 4).
 */
package Lap03;
import java.util.Scanner;

public class Lap03_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
       
        if(number %2 == 0 && number > 2 )
            System.out.println("YAS");
        else 
            System.out.println("NO");
    }
    
}
