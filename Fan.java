/* 
Chef Eren
Chef is a very big fan of Eren Yeager.
In the last season of Attack on Titan, there were N episodes numbered from 1 to N.
Each even-indexed episode was A minutes long and each odd-indexed episode was B minutes long.
Calculate the total duration (in minutes) of the last season.
*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Fan
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 for(int k=1;k<=t;k++)
	 {
     int n=sc.nextInt();
     int a=sc.nextInt();
     int b=sc.nextInt();
     int even=0;
     int odd=0;
     int arr[]=new int [n];
     
     for(int i=0;i<n;i++)
     {
         arr[i]=i+1;
     }
     for(int j=0;j<n;j++)
     {
         if(arr[j]%2==0)
         {
             even++;
         }
         else
         {
             odd++;
         }
     }

     int even_episodes=even*a;
     int odd_episodes=odd*b;
     int total_duration=even_episodes+odd_episodes;
     System.out.println(total_duration);
     

	}
	}
}
