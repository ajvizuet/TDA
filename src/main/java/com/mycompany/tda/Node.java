/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tda;

/**
 *
 * @author alexv
 */
class Node<E> {
    private E content;
    private Node next;
    
    public Node(E content) {
        this.content = content;
        next = null;
    }
    public Node(E element, Node next) {
        this(element);
        this.next = next;
    }

    public E getContent() {
        return content;
    }

    public void setContent(E content) {
        this.content = content;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
  
}
