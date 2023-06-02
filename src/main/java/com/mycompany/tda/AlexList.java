/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tda;

/**
 *
 * @author alexv
 */
public class AlexList<E> implements List<E> {
    private E[] elements;
    private int MAX_SIZE = 100;
    private int effectiveSize;
    
    public AlexList() {
        elements = (E[]) new Object[MAX_SIZE];
        effectiveSize = 0;
    }
    
    private void noElementAdd(E element){
        elements[0] = element;
        effectiveSize++;
    }
    
    public boolean isEmpty() {
        return effectiveSize == 0;
    }
    public boolean isFull() {
        return effectiveSize == MAX_SIZE;
    }
    
    public int maxSize() {
        return MAX_SIZE;
    }

    @Override
    public boolean addFirst(E element) {
        if(element == null) {
            return false;
        }
        if(isFull()) {
            addCapacity();
        }
        if(isEmpty()) {
            noElementAdd(element);
            return true;
        }else {
            for(int i = effectiveSize; i > 0; i--) {
                elements[i] = elements[i - 1];
            }
            elements[0] = element;
            effectiveSize++;
            return true;
        }
    }
    
    @Override
    public boolean addLast(E element) {
        if(element == null) {
            return false;
        }
        if(isFull()) {
            addCapacity();
        }
        if(isEmpty()) {
            noElementAdd(element);
            return true;
        }else {
            elements[effectiveSize] = element;
            effectiveSize++;
            return true;
        }
    }

    @Override
    public boolean remove(int index) {
        if(index >= 0 && index < effectiveSize) {
            for(int i = index; i < effectiveSize - 1; i++) {
                elements[i] = elements[i + 1]; 
            }
            elements[effectiveSize - 1] = null;
            effectiveSize--;
            return true;
        }else {
            return false;
        }
    }

    @Override
    public int size() {
        return effectiveSize;
    }
    
    @Override
    public String toString() {
        String string = "- ";
        for(int i = 0; i < effectiveSize; i++) {
            string = string + elements[i] + " - ";
        }
        return string;
    }
    
    private void addCapacity() {
        MAX_SIZE = MAX_SIZE * 2;
        E[] newArray = (E[]) new Object[MAX_SIZE];
        for(int i = 0; i < effectiveSize; i++) {
            newArray[i] = elements[i];
        }
        elements = newArray;
    }
    
}
