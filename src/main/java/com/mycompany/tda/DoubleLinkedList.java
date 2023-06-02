/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tda;

/**
 *
 * @author alexv
 */
public class DoubleLinkedList<E> implements List<E>{
    private DLLNode head;
    private DLLNode last;
    
    public DoubleLinkedList() {
        this.head = null;
        this.last = null;
    }
    
    public DLLNode getHead() {
        return this.head;
    }
    public DLLNode getLast() {
        return this.last;
    }
    
    public boolean isEmpty() {
        return this.head == null && this.last == null;
    }
    
    @Override
    public boolean addFirst(E element) {
        if(element == null) {
            return false;
        }
        DLLNode newNode = new DLLNode(element);
        if(this.isEmpty()) {
            this.last = newNode;
        }else {
            newNode.setNext(this.head);
            this.head.setPrev(newNode);            
        }
        this.head = newNode;
        return true;
    }
    
    @Override
    public boolean addLast(E element) {
        if(element == null) {
            return false;
        }
        DLLNode newNode = new DLLNode(element);       
        if(this.isEmpty()) {
            this.head = newNode;
        }else {
            this.last.setNext(newNode);
            newNode.setPrev(this.last);
        }
        this.last = newNode;
        return true;
    }
    
    @Override
    public int size() {
        DLLNode traveller1;
        DLLNode traveller2 = last;
        int cont = 0;
        
        for(traveller1 = head; traveller1 != traveller2 && traveller1.getPrev() != traveller2; traveller1 = traveller1.getNext()) {
            cont++;
            traveller2 = traveller2.getPrev();
        }
        
        if(traveller1 == traveller2) {
            return (cont * 2) + 1;
        }else { 
            return cont * 2;
        }
    }
    
    @Override
    public String toString() {
        String result = "[";
        DLLNode traveller;
        for(traveller = head; traveller != null; traveller = traveller.getNext()) {
            if(traveller == last) {
                result += traveller.getContent() + "]";
            }else {
                result += traveller.getContent() + ", ";                
            }
        }
        return result;
    }

    @Override
    public boolean remove(int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
