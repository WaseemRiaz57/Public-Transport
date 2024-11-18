/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observerpattern;

/**
 *
 * @author Waseem Riaz
 */


import java.util.ArrayList;
import java.util.List;

public class Bus implements Subject {
    private String route;
    private List<Observer> passengers;

    public Bus(String route) {
        this.route = route;
        this.passengers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        passengers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        passengers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer passenger : passengers) {
            passenger.update(message);
        }
    }

    public void arriveAtStop(String stop) {
        System.out.println("Bus on route " + route + " arrived at stop: " + stop);
        notifyObservers("Bus on route " + route + " has arrived at " + stop);
    }
}
