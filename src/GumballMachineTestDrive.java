import java.rmi.Naming;

public class GumballMachineTestDrive {

	public static void main(String[] args) {
		if (args.length < 2) {
			System.out.println("Use: GumballMachineTestDrive <Name> <Count>");
			return;
		}
		GumballMachine gumballMachine;
		try {
			gumballMachine = new GumballMachine(args[0], Integer.parseInt(args[1]));
			Naming.rebind("//" + args[0] + "/gumballMachine", gumballMachine);
			System.out.println(gumballMachine);

			gumballMachine.insertQuarter();
			gumballMachine.turnCrank();
			System.out.println(gumballMachine);

			gumballMachine.insertQuarter();
			gumballMachine.turnCrank();
			System.out.println(gumballMachine);

			gumballMachine.insertQuarter();
			gumballMachine.turnCrank();
			System.out.println(gumballMachine);

			gumballMachine.refill(10);

			gumballMachine.insertQuarter();
			gumballMachine.turnCrank();
			System.out.println(gumballMachine);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
