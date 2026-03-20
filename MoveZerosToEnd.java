import java.util.Scanner;
class MoveZerosToEnd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int [] a=new int [n];
        System.out.println("Enter the Elements:");
        for(int i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    for(int j=0;j<n;j++)
    {
        if(a[j]==0)
        {
          continue;
        }
        else
        {
            System.out.println(a[j]);
        }
    }
    for(int k=0;k<n;k++)
    {
        if(a[k]==0)
        {
            System.out.println(a[k]);
        }
    }
    }
}
