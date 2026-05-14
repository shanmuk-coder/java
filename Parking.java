/*
# Smart Parking Lot Tracker

## Problem Statement

A shopping mall uses a smart parking system to monitor vehicles entering and leaving the parking area.

Write a Java program to calculate:

- Total number of cars entered
- Total number of cars exited
- Current number of cars inside the parking lot

If at any moment the number of cars inside becomes negative, print:

```text
Invalid Data
```

and terminate the program immediately.

---

## Input Format

- First line contains an integer `n` representing the number of records.
- Next `n` lines contain two integers:
  - Number of cars entered
  - Number of cars exited

---

## Output Format

If the data is valid, print:

```text
Total Entered: X
Total Exited: Y
Cars Inside: Z
```

Otherwise print:

```text
Invalid Data
```

---

## Constraints

```text
1 <= n <= 100
0 <= cars entered, cars exited <= 1000
```

---

## Example 1

### Input

```text
4
10 2
5 3
2 4
6 1
```

### Output

```text
Total Entered: 23
Total Exited: 10
Cars Inside: 13
```

---

## Example 2

### Input

```text
3
5 2
1 6
10 1
```

### Output

```text
Invalid Data
```
*/
import java.util.Scanner;
class Parking {
    public static void main(String[] args) 
    {
      Scanner car=new Scanner(System.in);
      int n=car.nextInt();
      int Entered=0;
      int Exited=0;
      int carsInside=0;
      for(int i=1;i<=n;i++)
      {
          int carsEntered=car.nextInt();
          int carsExited=car.nextInt();
          Entered=Entered+carsEntered;
          Exited=Exited+carsExited;
             carsInside=Entered-Exited;
      if(carsInside<0)
      {
          System.out.println("Invalid Data");
          return;
    }
 
      }
   
          
      System.out.println("Total Entered:" +Entered);
      System.out.println("Total Exited:" +Exited);
      System.out.println("Cars Inside:" +carsInside);
      
      
    }
}
