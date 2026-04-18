/*
Recent Contest Problems

CodeChef recently revamped its practice page to make it easier for users to identify the next problems they should solve by introducing some new features:

Recent Contest Problems - Contains only problems from the last 2 contests
Separate Un-Attempted, Attempted, and All tabs
Problem Difficulty Rating - The Recommended dropdown menu has various difficulty ranges so that you can attempt the problems most suited to your experience
Popular Topics and Tags

Chef has been participating regularly in rated contests but missed the last two contests due to his college exams. He now wants to solve them and so he visits the practice page to view these problems.

Given a list of N contest codes, where each contest code is either START38 or LTIME108, help Chef count how many problems were featured in each of the contests.
*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Contest
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
		Scanner sc=new Scanner(System.in);
		// number of testcases
		int t=sc.nextInt();
		for(int i=1;i<=t;i++)
		{
		    //input:list of n contest codes
		    int n=sc.nextInt();
		    //initializing startCount=0 and ltimeCount=0;
		    int startCount=0,ltimeCount=0;

		    for(int j=0;j<n;j++)
		    {
		        String code=sc.next();
		        
		        if(code.equals("START38"))
		        {
		            startCount++;
		        }
		        else if(code.equals("LTIME108"))
		        {
		            ltimeCount++;
		        }
		    }
		    // display the count of how many problems were featured in each of the contest.
		    System.out.println(startCount +" " +ltimeCount);
		}

	}
}
