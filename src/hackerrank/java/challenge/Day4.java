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

/**
 *
 * @author ettore1461
 */
public class Day4 {
    
    private int age;	
  
	public Day4(int initialAge) {
                            if(initialAge>0){
                                 this.age=initialAge;
                            }else{
                                 this.age=0;
                                 System.out.println("Age is not valid, setting age to 0.");
                            }
	}

	public void amIOld() {
  		String result="";
                
                                    if(this.age<13){
                                        result="You are young.";
                                    } else if(this.age>=13 && this.age<18){
                                        result="You are a teenager.";
                                    }else {
                                        result="You are old.";
                                    }
                        
                                    System.out.println(result);
	}

	public void yearPasses() {
  		this.age+=1;
	}
        
        
        	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Day4 p = new Day4(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }

    
}
