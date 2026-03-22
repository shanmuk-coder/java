import java.util.Scanner;
class First_negative{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array.");
        int n=sc.nextInt();
        int [] arr=new int [n];
        System.out.println("Enter Elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            if(arr[j]<0)
            {
                System.out.println("The first negative number:" +arr[j]);
                return;
            }
            
        }
        System.out.println("No Negative number found!");
        
    }
}
