import java.rmi.RemoteException;

/**
 * Created by alex on 27.06.2015.
 *
 */

public class GumballMachineMonitor {
    private GumballMachineRemote machine;

    public GumballMachineMonitor(GumballMachineRemote machine) {
        this.machine = machine;
    }

    public String getReport() {
        try {
            return String.format("Report for gumball machine: %s\nCurrent inventory: %d\nCurrent state: %s\n",
                    machine.getLocation(), machine.getCount(), machine.getState());
        } catch (RemoteException e) {
            return String.format("%s", e);
        }
    }
}
