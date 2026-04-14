/*
Possible Victory

Chef is playing in a T20 cricket match. In a match, Team A plays for 20 overs. In a single over, the team gets to play 6 times, and in each of these 6 tries, they can score a maximum of 6 runs.

After Team A's 20 overs are finished, Team B similarly plays for 20 overs and tries to get a higher total score than the first team. 
  
The team with the higher total score at the end wins the match. Chef is in Team B. Team A has already played their 20 overs and have gotten a score of R runs. 
  
Chef's Team B has started playing and has already scored C runs in the first O overs.

In the remaining 20 − O overs, find whether it is possible for Chef's Team B to get a score high enough to win the game. That is, can their final score be strictly larger than R?
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Cricket
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 
	 Scanner sc=new Scanner(System.in);
       //Input: Team A Score
	     int teamAScore=sc.nextInt();
       // Input: overs played by Team B
	     int oversOfTeamB=sc.nextInt();
       // Input: current score of team B
	     int teamBScore=sc.nextInt();
       //remaining overs in a match
	     int remainingOvers=20 -(oversOfTeamB);
       //maximum runs can team B can score
	     int remainingScore=remainingOvers*36;
       // total possible score of Team B
	     int totalRunsTeamB=remainingScore+teamBScore;
       //check if team B can beat team A
	     if(totalRunsTeamB > teamAScore)
	     {
	         System.out.println("YES");
	     }
	     else
	     {
	         System.out.println("NO");
	     }

	}
}
