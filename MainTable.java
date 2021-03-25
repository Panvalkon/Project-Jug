
import prJugs.Table;

public class MainTable {
	public static void main(String[] args) {
		try {
			// Table Part;

			Table table = new Table(7, 5);

			// Fill 2 jug from tape;
			table.fill(2);
			System.out.println(table.toString());

			// Pour water from Jug 2 to Jug 1
			table.pourFrom(2);
			System.out.println(table.toString());

			// Fill 2 jug from tape;
			table.fill(2);
			System.out.println(table.toString());

			// Pour water from Jug 2 to Jug 1
			table.pourFrom(2);
			System.out.println(table.toString());

			// Empty Jug 1
			table.empty(1);
			System.out.println(table.toString());

			// Pour water from Jug 2 to Jug 1
			table.pourFrom(2);
			System.out.println(table.toString());

			// Fill 2 jug from tape;
			table.fill(2);
			System.out.println(table.toString());

			// Pour water from Jug 2 to Jug 1
			table.pourFrom(2);
			System.out.println(table.toString());

		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}
}
