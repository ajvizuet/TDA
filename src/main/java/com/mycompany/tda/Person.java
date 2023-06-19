/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tda;

/**
 *
 * @author alexv
 */
public class Person implements Comparable<Person>{
    private String name;
    private int netWorth;
    private int age;
    
    public Person(String name, int netWorth, int age) {
        this.name = name;
        this.netWorth = netWorth;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        if(netWorth >= 10000) {
            return name.compareTo(o.name);
        }
        return Integer.valueOf(age).compareTo(o.age);
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", netWorth=" + netWorth + ", age=" + age + '}';
    }
    
}
