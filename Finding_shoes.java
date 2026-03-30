/* Finding Shoes

Chef has N friends. He wants to gift each of them one pair of shoes, where each pair consists of one left shoe and one right shoe.

Chef already has M left shoes.

What is the minimum number of additional shoes Chef needs to buy so that he can give N complete pairs to his friends?
*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Finding_shoes
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=1;i<=t;i++)
		{
		    int n=sc.nextInt();
		    int m=sc.nextInt();
		    if(n>m)
		    {
		        int friendneeded=n*2;
		        int Min_Shoes=pair-m;
		        System.out.println(Min_Shoes);
		    }
		    else
		    {
		        System.out.println(n);
		    }
		}
	}
}
