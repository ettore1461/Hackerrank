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
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ettore1461
 */
public class Day11 {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        
        /**
         * prende come input una matrice 6x6 inserita elemento per elemento dall'utente.
         */
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        //static final hourglasses rs=new hourglasses(arr);
        
        
        /**
         * il metodo può richiamare le classi private presenti nello stesso file .java, ma
         * se le classi privati sono definite all'interno del corpo della classe pubblica, esse non vengono definite 
         * finchè la classe non viene istanziata. questo non permette perciò l'utilizzo di queste classi definite 
         * all'interno del corpo della classe pubblica con metodi statici.
         */
        System.out.println(new hourglasses(arr).max());
        
    }
    

    
}

 class hourglass{
    
     private int [][] Harr= new int[3][3];
     int sum=0;
    
    hourglass(int[][] arr){
        
         this.Harr=arr;
        
        for (int i=0; i<3;i++){
            for(int j=0; j<3;j++){
                
                boolean exclude=(i==1 && j==0)||(i==1&&j==2);
                int temp=this.Harr[i][j];
                
                if(!exclude){this.sum +=temp;}
                        
            }
        }
    
    }
     
    
}   
 
 class hourglasses{
     
     List<hourglass> hh=new ArrayList();
     
     hourglasses(int[][] arr){
         
         int row = arr.length;
         int col = arr[0].length; // ipotizzo che le colonne abbiano tutte le stesse dimensioni
         int[][] temp = new int[3][3];
         
         
         // estraggo una sottomatrice
         for(int i =0; i< (row -2); i++){
             for(int j=0; j<(col-2);j++){
                 
                 for(int m=0;m<3;m++){
                     for(int k=0;k<3;k++){
                        temp[m][k]=arr[i+m][j+k];
                     }
                 }
                 
                 hh.add(new hourglass(temp)); // aggiungo la sottomatrice alla lista di sottomatrici
                 
             }
         }
         
     }
     
     public int max(){
         List<Integer> rs=new ArrayList();
                 
         for(hourglass elem : this.hh){
             
             rs.add(elem.sum);
             
         }
        
         return Collections.max(rs);
     }
     
 }


