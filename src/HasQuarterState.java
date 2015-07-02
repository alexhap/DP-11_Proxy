/**
 * Created by alex on 26.06.2015.
 *
 */

import java.util.Random;

public class HasQuarterState implements State{
    transient private GumballMachine gumballMachine;
    Random r = new Random(System.currentTimeMillis());

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    public void turnCrank() {
        System.out.println("You turned... ");
        if (r.nextInt(10) == 0 && gumballMachine.getCount() > 1)
            gumballMachine.setState(gumballMachine.getWinnerState());
        else
            gumballMachine.setState(gumballMachine.getSoldState());
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    public void refill(int count) {
        System.out.println("Can't refill right now, quarter in the machine");
    }

    public String toString() {
        return "waiting for turn of crank";
    }
}
