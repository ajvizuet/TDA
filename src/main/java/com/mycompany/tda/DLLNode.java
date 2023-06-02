/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tda;

/**
 *
 * @author alexv
 */
public class DLLNode<E> {
    private E content;
    private DLLNode prev;
    private DLLNode next;
    
    public DLLNode(E content) {
        this.content = content;
        this.prev = null;
        this.next = null;
    }
    public DLLNode(E content, DLLNode prev, DLLNode next) {
        this(content);
        this.prev = prev;
        this.next = next;
    }

    public E getContent() {
        return content;
    }

    public void setContent(E content) {
        this.content = content;
    }

    public DLLNode getPrev() {
        return prev;
    }

    public void setPrev(DLLNode prev) {
        this.prev = prev;
    }

    public DLLNode getNext() {
        return next;
    }

    public void setNext(DLLNode next) {
        this.next = next;
    }
    
    @Override
    public String toString() {
        return this.content + "";
    }

}
