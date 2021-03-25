import prJugs.Jug;

public class MainJug {
	public static void main(String[] args) {
		try {
			// make Jugs
			Jug jugA = new Jug(7);
			Jug jugB = new Jug(4);

			// Fill the JugA
			jugA.fill();
			System.out.println(jugA.toString() + ", " + jugB.toString());

			// Pour from jugA into jugB
			jugB.pourFrom(jugA);
			System.out.println(jugA.toString() + ", " + jugB.toString());

			// Empty jugB
			jugB.empty();
			System.out.println(jugA.toString() + ", " + jugB.toString());

			// Pour from jugA into jugB
			jugB.pourFrom(jugA);
			System.out.println(jugA.toString() + ", " + jugB.toString());


		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}
}
