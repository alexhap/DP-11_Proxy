/**
 * Created by alex on 26.06.2015.
 *
 */

public class SoldOutState implements State {
    transient private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("Sorry, no gumballs in machine left");
    }

    public void ejectQuarter() {
        System.out.println("Sorry, no gumballs in machine left");
    }

    public void turnCrank() {
        System.out.println("Sorry, no gumballs in machine left");
    }

    public void dispense() {
        System.out.println("Sorry, no gumballs in machine left");
    }

    public void refill(int count) {
        System.out.println("Machine refilled with " + count + " new gumballs");
        gumballMachine.setCount(count);
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    public String toString() {
        return "sold out";
    }
}
