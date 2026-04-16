/*
Get Lowest Free

Chef goes to the supermarket to buy some items. Luckily, there's a sale going on under which Chef gets the following offer:

If Chef buys 3 items, then he gets the item (out of those 3 items) having the lowest price for free.
*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Free
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
    // number of testcases
		int t=sc.nextInt();
		for(int i=1;i<=t;i++)
		{
      //the price of the first item
		    int firstItem=sc.nextInt();
      //the price of the second item
		    int secondItem=sc.nextInt();
       //the price of the third item
        int thirdItem=sc.nextInt();
      //calculating minimum rate item
		    int min=Math.min(Math.min(firstItem,secondItem),thirdItem);
      //the amount of money chef has to pay
		    int sum=firstItem + secondItem +thirdItem - min;
      //print the sum of the items rate.
		    System.out.println(sum);
		}

	}
}
