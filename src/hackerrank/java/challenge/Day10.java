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
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ettore1461
 */
public class Day10 {
    
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        
        System.out.println(myconverter(n,2));
        System.out.println(sumFirstBit(myconverter(n,2)));
        
    }
    
    private static String myconverter(int n, int base){
        String rs="";
        
        int dividendo=n;
        int resto=1;
        
        while(dividendo>0){
            
            resto=dividendo%base;
            dividendo=dividendo/base;
            
            rs=resto + rs;
            
        }
        
        return rs;
    }
    
    private static int sumFirstBit(String s){
        int rs=0;
        
        List<Integer> results= new ArrayList();
        
        String [] tt;
        tt= s.split("0");
        
        List<String> ss = Arrays.asList(tt);
        
        for(String elem : ss){
            int sum=0;
            List<String> temp =Arrays.asList(elem.split(""));
            for(String elem2 : temp){                
                if(!elem2.equals("")) {sum+=Integer.parseInt(elem2);}
            }
            results.add(sum);
        }
        
        rs= Collections.max(results);
        
        return rs;
    }
    
}
