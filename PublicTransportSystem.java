/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package observerpattern;

/**
 *
 * @author Waseem Riaz
 */

public class PublicTransportSystem {
    public static void main(String[] args) {
        // Create a bus
        Bus bus = new Bus("Route 42");

        // Create passengers
        Passenger p1 = new Passenger("Alice");
        Passenger p2 = new Passenger("Bob");
        Passenger p3 = new Passenger("Charlie");

        // Passengers subscribe to the bus
        bus.addObserver(p1);
        bus.addObserver(p2);
        bus.addObserver(p3);

        // Bus arrives at stops
        bus.arriveAtStop("Main Street");
        bus.arriveAtStop("Central Park");

        // A passenger unsubscribes
        bus.removeObserver(p2);

        // Bus arrives at another stop
        bus.arriveAtStop("Downtown Station");
    }
}

