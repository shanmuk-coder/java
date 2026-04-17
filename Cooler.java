/*
The Cooler Dilemma 2

The summer is at its peak in Chefland. Chef is planning to purchase a water cooler to keep his room cool. He has two options available:

Rent a cooler at the cost of X coins per month.
Purchase a cooler for Y coins.

Chef wonders what is the maximum number of months for which he can rent the cooler such that the cost of renting is strictly less than the cost of purchasing it.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Cooler
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=1;i<=t;i++)
		{
		    //input : cost of renting a cooler (x coins)
		    int xCoins=sc.nextInt();
		    //input : cost of buying  a cooler (y coins)
		    int yCoins=sc.nextInt();
		    //calculating maximum number of months
		    int maxMonths=(yCoins-1)/xCoins;
		    //displaying maximum numberof months is strictly less than the buying an cooler
		    System.out.println(maxMonths);
		
		}

	}
}
