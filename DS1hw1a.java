/*Hiu Kao
4
6
4
The Number of Unique Values :2
Difference between Maximum and Minimum :2
Quantity :474.2716049382717

6
8
9
The Number of Unique Values :3
Difference between Maximum and Minimum :3
Quantity :203067.06310013722

*/
package homework;
import java.util.Scanner;
import java.lang.Math;
public class DS1hw1a  {

	   public static void main(String[] args) {
		   Scanner n=new Scanner(System.in);
		   int a=n.nextInt();
		   int b=n.nextInt();
		   int c=n.nextInt();
		   int count=0;
		   if(a==b && b==c)
			   count=1;
		   else if((a==b && c!=a) || (b==c && c!=a) || (c==a && b!=c)){
			   count=2;
		   }
		   else
			   count=3;
		   System.out.println("number of unique values:"+count);
		   int max=a>b && a>c?a:b>c && b>a?b:c;
		   int min=a<b && a<c?a:b<c && b<a?b:c;
		   int dif=max-min;
		   double avg=(double)(a+b+c)/3;
		   double power=Math.pow(avg,min);
		   System.out.println("difference between max and min:"+dif);
		   System.out.println("the power of avg whole min:"+power);
		   }
	   }

