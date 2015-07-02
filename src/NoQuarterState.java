/**
 * Created by alex on 26.06.2015.
 *
 */

public class NoQuarterState implements State {
    transient private GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    public void ejectQuarter() {
        System.out.println("Sorry, you haven't inserted a quarter");
    }

    public void turnCrank() {
        System.out.println("You turned, but there is no quarter");
    }

    public void dispense() {
        System.out.println("You need to pay first");
    }

    public void refill(int count) {
        System.out.println("Machine refilled with " + count + " new gumballs");
        gumballMachine.setCount(count + gumballMachine.getCount());
    }

    public String toString() {
        return "waiting for quarter";
    }
}
