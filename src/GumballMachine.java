/**
 * Created by alex on 26.06.2015.
 *
 */

public class GumballMachine {

    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State winnerState;

    State state = soldOutState;
    int count = 0;

    public GumballMachine(int count) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        this.count = count;
        if (count > 0)
            state = noQuarterState;
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count > 0)
            count--;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void refill(int count) {
        state.refill(count);
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public int getCount() {
        return count;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public String toString() {
        String res = "\n--------------------------------------\nMighty Gumball, Inc.";
        res = res.concat("\nJava-enabled Standing Gumball Model #2004\nInventory: " + count + " gumball");
        if (count != 1) res = res.concat("s");
        return res.concat("\nMachine is " + state + "\n");
    }
}
