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


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author ettore1461
 */
public class Day8 {
    
    public static void main(String []argh){
        
        Map<String, Integer> records;
        records= new HashMap();
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            
            records.put(name, phone);
            
        }
        while(in.hasNext()){
            String s = in.next();
            
            Integer result = records.get(s);
            
            if (result==null){
                System.out.println("Not Found");
            }else{
                System.out.println(s+"="+result);
            }
            
            
        }
        in.close();
    }
    
}
