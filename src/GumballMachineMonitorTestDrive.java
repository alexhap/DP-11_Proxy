import java.rmi.Naming;

public class GumballMachineMonitorTestDrive {

	public static void main(String[] args) {
        String[] locations = {"rmi://192.168.0.10/gumballMachine"};
        GumballMachineMonitor[] monitors = new GumballMachineMonitor[locations.length];
        for (int i = 0; i < locations.length; i++) {
            try {
                GumballMachineRemote machineMonitor = (GumballMachineRemote) Naming.lookup(locations[i]);
                monitors[i] = new GumballMachineMonitor(machineMonitor);
                System.out.println(monitors[i]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (GumballMachineMonitor monitor : monitors) {
            System.out.println(monitor.getReport());
        }
	}
}
