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

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.lang.Integer;

//import org.apache.commons.lang3.ArrayUtils;


/**
 *
 * @author ettore1461
 */
public class Day7 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        
        System.out.println(Day7.toString(Day7.inverse3(arr)));
        //System.out.println(Arrays.toString(Day7.inverse3(arr)));
    }
    
    
/*
    soluzione utilizzando i metodi di List, Arrays e ArrayList proposta da 
    http://www.java67.com/2016/10/3-ways-to-reverse-array-in-java-coding-interview-question.html
    */
    
    
//    private static Integer[] inverse(Integer[] arr){ // NON FUNZIONA
//         Integer [] revarr=null;
//        
//        List<Integer[]> temp;
//        temp=Arrays.asList((Integer[]) arr);
//        Collections.reverse(temp);
//        revarr=temp.toArray(); // questo metodo causa un problema con i tipi primitivi
//        
//        return revarr;
//    }
    
//    private static int[] inverse2(int[] arr){
//        int[] revarr=arr;
//        
//        ArrayUtils
//        
//        return revarr;
//    }
    
private static int[] inverse3(int[] arr){
    int[] revarr= new int[arr.length];
    
    for(int i=arr.length-1; i>=0;i--){
        
        revarr[(arr.length-1)-i]=arr[i];
        
    }
    
    return revarr;
}

private static String toString(int[] arr){
    String s= "";
    
    for(int i=0; i<arr.length;i++){
        s+= arr[i]+" ";
    }
    
    return s;
}
    
}
