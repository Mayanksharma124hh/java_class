import java.util.Scanner;
public class rombuspattern
{
    
 
    public static void main(String[] args)
    {
             
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter N : ");
	int n=sc.nextInt();	 
           for(int i=0;i<=n;i++){
              for(int j=0;j<=i;j++){
                     System.out.print(" ");

              }
              for(int k=0;k<=n;k++)
                 {
                     
                     System.out.print("*");
                 }
                 System.out.println();
           }
		}
	}
