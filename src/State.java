/**
 * Created by alex on 26.06.2015.
 *
 */

public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
    void refill(int count);
}
