/**
 * Created by alex on 26.06.2015.
 *
 */

import java.io.Serializable;

public interface State extends Serializable {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
    void refill(int count);
}
