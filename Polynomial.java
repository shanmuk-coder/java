/*
Degree of Polynomial

In mathematics, the degree of a polynomial in one variable is the highest power of the variable that has a non-zero coefficient.

Chef has a polynomial in one variable x with N terms. The polynomial is:

A0 * x^0 + A1 * x^1 + A2 * x^2 + ... + A(N-1) * x^(N-1)

where Ai denotes the coefficient of x^i for all 0 ≤ i < N.

Task:
Find the degree of the polynomial.

Note:
It is guaranteed that there exists at least one term with non-zero coefficient.

Input Format:
- The first line contains an integer T, the number of test cases.
- For each test case:
  - The first line contains an integer N.
  - The second line contains N space-separated integers A0, A1, ..., A(N-1).

Output Format:
For each test case, print a single integer — the degree of the polynomial.

Example:

Input:
1
5
0 0 3 0 2

Output:
4

Explanation:
The polynomial is:
0 + 0x + 3x^2 + 0x^3 + 2x^4

*/
 code:

import java.util.*;

class Polynomial
{
	public static void main (String[] args)
	{
	    Scanner scanner = new Scanner(System.in);
	    int t = scanner.nextInt();

	    for(int i= 0; i < t; i++)
	    {
	        int n = scanner.nextInt();
	        int coefficients[] = new int[n];

	        // Input coefficients
	        for(int index = 0; index < n; index++)
	        {
	            coefficients[index] = scanner.nextInt();
	        }

	        // Find degree of polynomial
	        for(int power = n - 1; power >= 0; power--)
	        {
	            if(coefficients[power] != 0)
	            {
	                System.out.println(power);
	                break;
	            }
	        }
	    }
	}
}

The highest power with non-zero coefficient is 4.
