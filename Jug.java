package prJugs;

public class Jug {
	private final int capacity;
	private int content;

	public Jug(int capacity) {
		if (capacity <= 0) {
			throw new RuntimeException("Jug can not have zero or negative capacity");
		}
		this.capacity = capacity;
	}

	public int getCapacity() {
		return this.capacity;
	}

	public int getContent() {
		return this.content;
	}

	public void fill() {
		this.content = this.capacity;
	}

	public void empty() {
		this.content = 0;
	}

	public void pourFrom(Jug jugSource) {
		if (this == jugSource || jugSource.content == 0) {
			throw new RuntimeException("That is elligal");
		} else if (jugSource.content >= (this.capacity - this.content)) {
			jugSource.content -= (this.capacity - this.content);
			this.fill();
		} else {
			this.content += jugSource.content;
			jugSource.empty();
		}
	}

	@Override
	public String toString() {
		return "J(" + this.capacity + ", " + this.content + ")";
	}
}
