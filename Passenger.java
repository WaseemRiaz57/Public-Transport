/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observerpattern;

/**
 *
 * @author Waseem Riaz
 */


public class Passenger implements Observer {
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Passenger " + name + " received update: " + message);
    }
}

