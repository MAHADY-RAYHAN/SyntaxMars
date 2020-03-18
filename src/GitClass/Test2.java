package GitClass;

public class Test2 {

	public static void main(String[] args) {
		for (int i = 0; i <= 3; i++) {
			for (int x = 0; x < 4; x++) {
				if ((i == 1 && (x == 1 || x == 2)) || (i == 2 && (x == 1 || x == 2))) {
					System.out.print(" ");
				} else {
					System.out.print("$");
				}
			}
			System.out.println(" ");
		}

	}

}
