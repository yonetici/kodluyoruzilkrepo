public class JavaPow {
	public static double power(double x, int n) {
		if (n == 0) {
			x = 1;
		}
		else {
				x = x * power(x, (n - 1));
			}

	System.out.println(x);
	return x;
	}

	public static void main(String[] args) {
		power(3, 5);
	}
}
