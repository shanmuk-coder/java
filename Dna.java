/* Complementary Strand in a DNA

You are given the sequence of Nucleotides of one strand of DNA through a string S of length N.
S contains the characters A, T, C, and G only.

Chef knows that:

A is complementary to T.
T is complementary to A.
C is complementary to G.
G is complementary to C.

Using the string S, determine the sequence of the complementary strand of the DNA.

*/

import java.util.*;

class Dna {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // directly read t

        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            String s = sc.next();

            for (int j = 0; j < n; j++) {
                char c = s.charAt(j); 

                if (c == 'A') 
               { 
              System.out.print('T');
              }
                else if (c == 'T')
                   {
              System.out.print('A');
               }
                else if (c == 'C') 
                {                  
                   System.out.print('G');
                }
                else if (c == 'G') 
                 {              
                    System.out.print('C');
             }
            }

            System.out.println();
        }
    }
}
