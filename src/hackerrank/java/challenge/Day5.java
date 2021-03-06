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
public class Day5 {
    
        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                int n = in.nextInt();
                Day5.prod10(n);
    }
    
        private static void prod10(int n){
            
            for (int i =1; i<=10;i++){
                System.out.println(n+" x "+i+" = "+(n*i));
            }
            
        }
        
}
