package prJugs;

public class Table {
	private Jug jug1;
	private Jug jug2;

	public Table(Jug jug1, Jug jug2) {
		if (jug1 == jug2) {
			throw new RuntimeException("It is no allowed to clone the same Jug twice.");
		}
		this.jug1 = jug1;
		this.jug2 = jug2;
	}

	public Table(int cap1, int cap2) {
		this.jug1 = new Jug(cap1);
		this.jug2 = new Jug(cap2);
	}

	public int getCapacity(int ID) {
		if (ID == 1) {
			return jug1.getCapacity();
		} else if (ID == 2) {
			return jug2.getCapacity();
		} else {
			throw new RuntimeException("You have only 2 jags on the table, please, use one of them");
		}
	}

	public int getContent(int ID) {
		if (ID == 1) {
			return jug1.getContent();
		} else if (ID == 2) {
			return jug2.getContent();
		} else {
			throw new RuntimeException("You have only 2 jags on the table, please, use one of them");
		}
	}

	public void fill(int ID) {
		if (ID == 1) {
			jug1.fill();
		} else if (ID == 2) {
			jug2.fill();
		} else {
			throw new RuntimeException("You have only 2 jags on the table, please, use one of them");
		}
	}

	public void empty(int ID) {
		if (ID == 1) {
			jug1.empty();
		} else if (ID == 2) {
			jug2.empty();
		} else {
			throw new RuntimeException("You have only 2 jags on the table, please, use one of them");
		}
	}

	public void pourFrom(int ID) {
		if (ID == 1) {
			jug2.pourFrom(jug1);
		} else if (ID == 2) {
			jug1.pourFrom(jug2);
		} else {
			throw new RuntimeException("You have only 2 jags on the table, please, use one of them");
		}
	}

	@Override
	public String toString() {
		return "M(J(" + jug1.getCapacity() + ", " + jug1.getContent() + "), J(" + jug2.getCapacity()
				+ ", " + jug2.getContent() + "))";
	}
}
