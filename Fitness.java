/*

## Problem Statement

Chef wants to become fit, so he decides to walk to his office and return home by walking every day.

The office is X km away from his home.

Chef works 5 days a week.

Find the total number of kilometers Chef travels in a week.

---

## Input Format

- First line contains an integer T — number of test cases.
- Each test case contains a single integer X.

---

## Output Format

For each test case, print the total kilometers Chef travels in a week.

---

## Constraints

1 ≤ T ≤ 10
1 ≤ X ≤ 10

---

## Sample Input

4
1
3
7
10

---

## Sample Output

10
30
70
100

---

## Explanation

Test Case 1:
Office distance = 1 km

Daily travel:
1 km to office + 1 km back home = 2 km

Weekly travel:
2 × 5 = 10 km
*/
import java.util.Scanner;

public class Fitness {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while (t-- > 0) {
            int x = scanner.nextInt();

            int totalKm = x * 10;

            System.out.println(totalKm);
        }
    }
}
