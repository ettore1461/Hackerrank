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
public class Day15 {
    
    public static  Node insert(Node head,int data) {
        
        Node temp;
        
        if (head==null){ // inizialize the chain 
            
            temp=new Node(data);
            
        } else{
        
            temp=head;

           for(Node tt=head;tt.next!=null;tt=tt.next){
               temp=tt.next;
           }

            temp.next=new Node(data);
            temp=head;
            
        }
        
        return temp;
    }
    
    
    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) { // bello come è scritto questo ciclo
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }

    
}

class Node {
        int data;
        Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
