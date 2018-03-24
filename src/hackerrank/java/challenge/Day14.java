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
public class Day14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }

    
}

class Difference {
        
          	private int[] elements;
  	public int maximumDifference;

        public Difference(int[] arr) {
            this.elements=arr;
        }

        public void computeDifference() {
            List<Integer> vett2,vett1 = new ArrayList(this.elements.length); // creo il puntatore a due variabili con la virgola
            List<Integer> diffs = new ArrayList();
            for(int i=0; i<this.elements.length; i++){vett1.add(this.elements[i]);}
            
            vett2= new ArrayList(vett1);
            
            for (Integer elem1 : vett1){
                
                for(Integer elem2: vett2){
                    diffs.add(Math.abs((elem1-elem2))); // calcolo il modulo della differenza
                }
                
                vett2.remove(elem1); // riduco il numero di passaggi che fa l'algoritmo, poiche la matrice delle differenze è simmetrica
            }
        
            this.maximumDifference=Collections.max(diffs);
            
        }
        
        
    }
