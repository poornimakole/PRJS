package com.psl.q3;

public class ArrayOfPrime {
	static int[] findPrime(int sNum, int eNum) {
		int l = eNum - sNum+1;
		int j = 0;
		boolean count;
		int result[] = new int[l/2];
		for (int i = sNum; i <= eNum; i++) {
			count =false;
			if (i != 1 && i != 2) {
				for (int k = 2; k <= i / 2; k++) {
					if (i % k == 0) {
						count = true;
						break;
					}
				}
				if (count ==false) {
					result[j] = i;
					j++;
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int startOfRange = 1;
		int endOfRange = 10;
		int[] result = findPrime(startOfRange, endOfRange);
		System.out.println("The array of prime numbers from range  "
				+ startOfRange + " to " + endOfRange + " is");
		for (int i = 0; i < result.length; i++) {
			if (result[i] != 0)
				System.out.print(result[i] + " ");
		}

	}
}
