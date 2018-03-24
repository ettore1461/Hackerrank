/*
 * Copyright (C) 2018 ettore1461
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package hackerrank.java.challenge;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 *
 * @author ettore1461
 */
public class Day1 {
 
    public static void main(String[] args) {
        
        System.out.println("Challenge Day1:");
        
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";		
        Scanner scan = new Scanner(System.in);
        
        /* Declare second integer, double, and String variables. */
            
         String s2;
         int i2;
         double d2;

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
         i2 = scan.nextInt();
         d2 = scan.nextDouble();
         
         // non capisco perchè nex line vuole parte dal token e non dalla parola
         s2 =scan.next();
         s2 += scan.nextLine();
        /* Print the sum of both integer variables on a new line. */
         System.out.println(i+i2);
        /* Print the sum of the double variables on a new line. */
         System.out.println(d+d2);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
         System.out.println(s+s2);
         
         scan.close();
    }
}
