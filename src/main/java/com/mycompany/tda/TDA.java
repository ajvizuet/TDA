/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tda;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author alexv
 */
public class TDA {

    public static void main(String[] args) {
    /*
        AlexList<Integer> list1 = new AlexList<>();
        
        for(int i = 0; i < 10; i++) {
            list1.addLast(i);
        }
        System.out.println(list1.size());
        System.out.println(list1.maxSize());
        
        list1.addFirst(99);
        System.out.println(list1.size());
        System.out.println(list1.maxSize());     
        System.out.println(list1);   
        
        LinkedList<Integer> link = new LinkedList<>();
        
        for(int i = 1; i <= 10; i++) {
            link.addLast(i);
        }
        System.out.println(link);
        System.out.println(link.size());
        link.addFirst(80);
        link.addFirst(2);
        System.out.println(link);
        System.out.println(link.size()); 
        
        DoubleLinkedList<Integer> doubleLink = new DoubleLinkedList<>();
        
        for(int i = 1; i <= 16; i++) {
            doubleLink.addLast(i);
        }
        
        System.out.println(doubleLink);
        System.out.println(doubleLink.size());
        
        doubleLink.addFirst(100);
        System.out.println(doubleLink);
        System.out.println(doubleLink.size());
        */
        
        createQueue();
    }
    
    public static void createQueue() {
        Queue<Person> q = new PriorityQueue<>();
        q.offer(new Person("Alex", 2000, 25));
        q.offer(new Person("Karla", 300, 20));
        q.offer(new Person("José", 1150, 30));
        q.offer(new Person("Juan", 990, 28));
        while(!q.isEmpty()) {
            System.out.println(q.poll());
        }
    }
}
