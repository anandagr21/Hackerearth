
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        // Write your code here
        
        Scanner input = new Scanner(System.in);
        
        int N =input.nextInt();
        int arr1[] = new int[N];
        int arr2[] = new int[N];
        int res[] = new int[N];
        
        for(int i=0;i<N;i++)
        {
            arr1[i]=input.nextInt();
        }
        
        for(int j=0;j<N;j++)
        {
            arr2[j]=input.nextInt();
            res[j] = arr1[j]+arr2[j];
            System.out.print(res[j]+" ");
        }
        
        

    }
}
