
import java.util.Arrays;
import java.util.Scanner;
class Main {

    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        int a[]=new int[5];
        int count=0;
        System.out.println("Enter the elements");
        for(int i=0;i<5;i++)
            {
                a[i]=sc.nextInt();
            }
        Arrays.sort(a);

        for(int k=a.length-1;k>0;k--)
        {
            if(count==3)
            {
                break;
            }
            else
            {
                System.out.print(a[k]+" ");
                count++;
            }

        }


    }
}
