/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greetertester;

/**
 * A class that sends "Hello" greetings
 * @author Christine Lin
 * 
 */
public class Greeter 
{ 
    /**
    * Constructs a Greeter object that can greet a person or entity.
    * @param aName the name of the person or entity being greeted
    */
    public Greeter(String aName) {
        name = aName;
    }
    /**
     * Greets with a "hello" message
     * @return a "Hello" message with the name of the person or entity
     */
    public String sayHello() {
        return "Hello, " + name + "!";
    }
    /**
     * Changes the name of the person or entity that the Greeter is greeting.
     * @param newName the name of the person or entity being greeted
     */
    public void setName(String newName) {
        name = newName;
    }
    /**
     * Swaps the name of the person or entity with the name of another person
     * or entity belonging to another Greeter
     * @param other the other Greeter object whose name is being swapped
     */
    public void swapNames(Greeter other) {
        String name1 = this.getName();
        this.setName(other.getName());
        other.setName(name1);
    }
    /**
     * Retrieves the name of the person or entity
     * @return the name of the person or entity
     */
    public String getName() {
        return name;
    }
    private String name;
}
