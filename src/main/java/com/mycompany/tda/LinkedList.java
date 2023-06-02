/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tda;

/**
 *
 * @author alexv
 */
public class LinkedList<E> implements List<E> {
    private Node head;
    private Node last;
    
    public LinkedList() {
        head = null;
        last = null;
    }
    
    public boolean isEmpty() {
        return head == null && last == null;
    }

    @Override
    public boolean addLast(E element) {
        if(element == null) {
            return false;
        }
        Node newNode = new Node(element);
        if(this.isEmpty()) {
            this.head = newNode;
        }else{
            this.last.setNext(newNode);            
        }
        this.last = newNode;
        return true;
    }

    @Override
    public boolean addFirst(E element) {
        if(element == null) {
            return false;
        }
        Node newNode = new Node(element);
        newNode.setNext(head);
        if(this.isEmpty()) {
            this.last = newNode;
        }
            this.head = newNode;

        return true;
    }

    @Override
    public boolean remove(int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int size() {
        int cont = 0;
        Node traveller;
        for(traveller = head; traveller != null; traveller = traveller.getNext()) {
            cont++;
        }
        return cont;
    }
    
    @Override 
    public String toString() {
        String result = "[";
        Node traveller;
        for(traveller = head; traveller != null; traveller = traveller.getNext()) {
            if(traveller == last) {
                result += traveller.getContent() + "]";
            }else {
                result += traveller.getContent() + ", ";
            }
        }
        return result;
    }
}
