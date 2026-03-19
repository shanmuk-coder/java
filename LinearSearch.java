import java.util.Scanner;
class LinearSearch{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements :");
        int n=sc.nextInt();
        System.out.println("Enter the searching elements:");
         int x=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("The Elements are:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
               if(arr[i]==x)
            {
                System.out.println("Found");
                return;
            }
        }
        
       
        System.out.println("Not Found");
        
    }
}
