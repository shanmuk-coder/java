import java.util.Scanner;
class Min_Element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
          int min=arr[0];
        for(int j=1;j<n;j++)
        {
            if(arr[j]<min)
            {
                min=arr[j];
            }
        }
        System.out.println("Minimum element is :" +min);
    }
}
