import java.util.*;
import java.lang.*;
import java.io.*;

class Bullet
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
     Scanner sc=new Scanner(System.in);
     int t=sc.nextInt();
     for(int i=1;i<=t;i++)
     {
         int x=sc.nextInt();
         int y=sc.nextInt();
         int z=sc.nextInt();
         int to_reach_Goomba=y/x;
         int min_time=z-to_reach_Goomba;
         if(min_time<=0)
         {
             System.out.println(0);
         }
         else
         {
             System.out.println(min_time);
         }
     }
	}
}
