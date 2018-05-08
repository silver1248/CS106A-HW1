package testRun;

import static java.lang.String.format;

public class Fibonacci {

	public static void main(String[] args) {
		long nMinusTwo = 1;
		long nMinusOne = 1;
		
		long n = 1;
		System.out.println(format("fib(%s) = %s", n++, nMinusTwo));
		System.out.println(format("fib(%s) = %s", n++, nMinusOne));
		
		for (; n < 33; n++) {
			long newFib = nMinusOne + nMinusTwo;
			System.out.println(format("fib(%s) = %s", n, newFib));
			
			nMinusTwo = nMinusOne;
			nMinusOne = newFib;
		}
	}

}