package com.yiibo;


public class IterativeChop<T> implements Chop<T> {
	public int chop(T x, Comparable<T>[] y) {
		
		int result = -1;
		int lower = 0;
		int upper = y.length;
		int mid;
		
		while (lower != upper) {
			mid = Math.round((lower + upper)/2);
			if (x < y[mid]) {
				upper = mid;
			} else {
				lower = mid;
			}
		}
		if (x == y[lower]) return lower;
		
		return result;
	}
}
