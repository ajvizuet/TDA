/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tda;

import java.util.Comparator;
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
        Comparator<Integer> cmp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
            
        };
        System.out.println(cmp.compare(2,3));
    }
    
    public static void createQueue() {
        Queue<Integer> q = new PriorityQueue<>((x,y) -> {
            return x.compareTo(y);
        });
        q.offer(3);
        q.offer(6);
        q.offer(2);
        q.offer(4);
        q.offer(1);
        q.offer(9);
        while(!q.isEmpty()) {
            System.out.println(q.poll());
        }
    }
}
