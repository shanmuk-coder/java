/* 
Blackjack Problem:
Chef is playing a variant of Blackjack, where 3 numbers are drawn. Each number lies between 1 and 10 (inclusive).

Chef wins the game when the sum of these 3 numbers is exactly 21.

You are given the first two numbers A and B that have already been drawn.

Your task is to determine what the 3rd number should be so that Chef wins the game.

If it is possible to choose such a number (between 1 and 10), print that number.
Otherwise, print -1, since Chef cannot win regardless of the third number.
*/
import java.util.*;
import java.lang.*;
import java.io.*;

class BlackJack
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for (int i=1;i<=t;i++)
		{
		   int a=sc.nextInt();
		   int b=sc.nextInt();
		   int third=a+b;
		   int win=21-third;
		   if(win<1 || win>10)
		   {
		       System.out.println("-1");
		}
		else
		{
		    System.out.println(win);
		}
}
	}
}
