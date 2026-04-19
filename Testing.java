/*
Primality Test

Alice and Bob are meeting after a long time. As usual they love to play some math games. This times Alice takes the call and decides the game. The game is very simple, Alice says out an integer and Bob has to say whether the number is prime or not. Bob as usual knows the logic but since Alice doesn't give Bob much time to think, so Bob decides to write a computer program.

Help Bob accomplish this task by writing a computer program which will calculate whether the number is prime or not.

Note that 1 is not a prime number.

*/



import java.util.*;

class Testing
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        for(int test = 1; test <= testCases; test++)
        {
            int number = scanner.nextInt();

            if(number == 1)
            {
                System.out.println("no");
                continue;
            }

            int divisorCount = 0;

            for(int divisor = 1; divisor <= number; divisor++)
            {
                if(number % divisor == 0)
                {
                    divisorCount++;
                }
            }

            if(divisorCount == 2)
            {
                System.out.println("yes"); // prime
            }
            else
            {
                System.out.println("no");
            }
        }
    }
}
