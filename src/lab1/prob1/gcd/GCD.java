package lab1.prob1.gcd;

/**
 * Created by lamhotsiagian on 7/5/20.
 *
 */

public class GCD {
	public static int computegcd(int m, int n) {
		if (n == 0)
			return m;
		return computegcd(n, m % n);
	}
	
	public static void main(String[] args) {
		System.out.println(GCD.computegcd(1950759629, 825180965));
	}
}
