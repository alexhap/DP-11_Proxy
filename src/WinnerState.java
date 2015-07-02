/**
 * Created by alex on 27.06.2015.
 *
 */

public class WinnerState implements State {
    transient private GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("Please wait, machine already giving you a gumball");
    }

    public void ejectQuarter() {
        System.out.println("Can't return your quarter, you already turned the crank");
    }

    public void turnCrank() {
        System.out.println("Turning twice doesn't give you another gumball");
    }

    public void dispense() {
        System.out.println("YOU ARE WINNER!!! You get tho gumballs for your quarter");
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releaseBall();
            if (gumballMachine.getCount() == 0) {
                System.out.println("Oops, out of gumball!");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            } else {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            }
        }
    }

    public void refill(int count) {
        System.out.println("Can't refill right now, machine giving a gumball");
    }

    public String toString() {
        return "dispensing two gumballs for your quarter, because YOU'RE A WINNER!";
    }

}
