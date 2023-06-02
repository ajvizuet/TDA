/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tda;

/**
 *
 * @author alexv
 */
public class TDA {

    public static void main(String[] args) {
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
    }
}
