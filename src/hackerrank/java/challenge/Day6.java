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

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ettore1461
 */
public class Day6 {
    
    public static void main(String[] args) {
        int T;
        List<String> S=new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        
        T=sc.nextInt();
        
        sc.nextLine(); // non capisco perchè  ho una linea bianca 
        
        for(int i=0;i<T;i++){
            S.add(sc.nextLine());
        }
        
        for(String elem : S){ // utilizzo del for con gli elementi di una lista
            System.out.println(Day6.divide(elem));
        }
        
        sc.close();
        
        
    }
    
    public static String divide(String s){
        String even="";
        String odd="";
        String [] ss;
        
        ss=s.split("");
        
        for(int i = 0; i< s.length(); i++){
            if (i%2==0){
                even+=ss[i];
            }else{
                odd+=ss[i];
            }
        }
        
        return even+" "+odd;
    }
    
}
