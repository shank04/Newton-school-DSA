class ModuloExponentiation {

	// time complexity of this is O(log(y))
	// compute (x^y) mod p
	static int power(int x, int y, int p) { // x = 2 y = 6 p = 5

		int res = 1;

		while (y > 0) {
			if ((y & 1) != 0) { // y is odd
				res = res * x; //  2 * 4 = 8
			}

			y = y >> 1; // y = y/2 // 0
			x = x*x; // 16

		}

		return res % p; // 1

	}

	public static void main(String args[]) {
		System.out.println(power(2, 4, 5)); 
	}
}

// 3
// 11 & 1 = 1

// 11 >> 1 = 01 = 1 

// x = 2 y = 6
// 2^6 = 2*2*2*2*2*2 = 16
// 	= 4 * 4


// x ^ y = x*x*x*x*x.......y times

// prod = 1
// for (int i=0; i<y; i++) {
// 	prod = prod * x;
// }
// TC : O(y)

// Math.pow(5, 3) = 5^3 = 125








