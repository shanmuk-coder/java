import java.util.Scanner;
class Sum_of_HalfArray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int [] arr=new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<n/2;j++)
        {
            sum=sum+arr[j];
        }
        System.out.println("The sum of first half is :" +sum);
        
    }
}
