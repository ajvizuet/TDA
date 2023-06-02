/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.tda;

/**
 *
 * @author alexv
 */
public interface List<E> {
    public boolean addLast(E element);
    public boolean addFirst(E element);
    public boolean remove(int index);
    public int size();
    public String toString();
}
