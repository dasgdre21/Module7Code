public class BalloonDriver {
	
	public static void main(String[] args) {
		Balloon b = new Balloon(500);

		b.reset();

		try {
			for (int i = 0; i <= 10; i++) {
				System.out.println(b.inflate(50));
			}
		} catch (PressureException e) {
			System.err.println(e);
		}

		b.reset();
		System.out.println();

		try {
			for (int i = 0; i <= 10; i++) {
				System.out.println(b.inflate(60));
			}
		} catch (PressureException e) {
			System.err.println(e);
		}
	}
}