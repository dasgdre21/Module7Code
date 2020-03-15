class Balloon {

	public int max;
	public int current;

	public Balloon(int max) {
		this.max = max;
		this.current = 0;
	}

	public int inflate(int increase) throws PressureException {
		if (this.current + increase > max) {
			throw new PressureException(current, max, increase);
		}

		this.current += increase;
		return this.current;
	}
	
	public void reset() {
		this.current = 0;
	}
}

class PressureException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public PressureException(int current, int max, int increase) {
		super(current == max ? "Cannot increase pressure, already at max" : "Can only increase pressure by " + (max - current) + " and not " + increase);
	}
}
