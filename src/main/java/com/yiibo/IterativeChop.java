package com.yiibo;


public class IterativeChop {
	public int Chop(int x, float[] y) {
		
		int result = -1;
		
		int min = Math.round(y.length/2);
		int max;
		
		while (result == -1) {
			
			
			if (x < y[h]) {
				h = Math.round(h/2);
			} else {
				h = Math.round(3*h/2);
			}
		}

			
		return result;
	}
	

}
