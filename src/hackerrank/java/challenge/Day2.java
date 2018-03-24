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

import java.util.Scanner;

/**
 *
 * @author ettore1461
 */
public class Day2 {
    
  public static void main(String[] args) {
      System.out.println("Challenge Day2:");
      
        Scanner in = new Scanner(System.in);
        double meal_cost = in.nextDouble();
        int tip_percent = in.nextInt();
        int tax_percent = in.nextInt();
        in.close();
        
        
        System.out.println("The total meal cost is "+Day2.TotalCost(meal_cost, tip_percent, tax_percent)+" dollars.");
    }
  
  
  private static int TotalCost(double cost, int tip, int tax){
      
      double result=0.00;
      result = cost + cost * tip / 100 + cost * tax / 100 ;
      return (int) Math.round(result);
      
  }
    
}
