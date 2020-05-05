import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1,j=1;
        while(i<=n)
        {
           
            while(j<=n)
            {
                if(j<=i)
                {
                System.out.print("1" );
                }
                else
                {
                       System.out.print(" ");
                }
                j++;
            }
            j=1;
            i++;
            System.out.print("\n" );
            
        }

	}
}
