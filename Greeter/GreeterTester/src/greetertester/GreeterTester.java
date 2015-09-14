/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greetertester;

/**
 * An application that sends greetings
 * @author Christine Lin 
 */
public class GreeterTester {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Greeter worldGreeter = new Greeter("World");
        String greeting = worldGreeter.sayHello();
        System.out.println(greeting);
        // anotherGreeter refers to worldGreeter
        Greeter anotherGreeter = worldGreeter;
        // set name of anotherGreeter
        anotherGreeter.setName("Christine");
        String greetingTwo = anotherGreeter.sayHello();
        System.out.println(greetingTwo);
       
        Greeter differentGreeter = new Greeter("John");
        Greeter moreGreeter = new Greeter("Jane");
        String greetingThree = differentGreeter.sayHello();
        String greetingFour = moreGreeter.sayHello();
        System.out.println(greetingThree);
        System.out.println(greetingFour);
        // Swap names of differentGreeter and moreGreeter
        differentGreeter.swapNames(moreGreeter);
        // Show that the names have been swapped
        greetingThree = differentGreeter.sayHello();
        greetingFour = moreGreeter.sayHello();
        System.out.println(greetingThree);
        System.out.println(greetingFour);
    }
    
}
