package com.yiibo;


public class IterativeChop {
	public int Chop(int x, float[] y) {
		
		int result = -1;
		int lower = 0;
		int upper = y.length;
		int mid;
		
		while (result == -1) {
			mid = Math.round((lower + upper)/2);
			if (lower == upper) {
				return lower;
			} else if (x < y[mid]) {
				upper = mid;
			} else {
				lower = mid;
			}
		}

			
		return result;
	}
	

}
