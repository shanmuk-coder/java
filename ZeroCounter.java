import java.util.Scanner;
class ZeroCounter{
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the size of Array:");
   int n=sc.nextInt();
   int [] arr=new int[n];
   int count=0;
   System.out.println("Enter Elements:");
  for(int i=0;i<n;i++)
  {
      arr[i]=sc.nextInt();
  }
  for(int j=0;j<arr.length;j++)
  {
      if(arr[j]==0)
      {
          count++;
      }
  }
  System.out.println("Zeroes in an array:" +count);
    }
}
