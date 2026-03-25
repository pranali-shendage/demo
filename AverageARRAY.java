/*Average array of all element.
 int []arr={10,20,30,40,50} */

public class AverageARRAY{
public static void main(String []x){

int []arr={10,20,30,40,50};
int sum=0;

System.out.println("Average is: ");
for(int i=0;i<arr.length;i++)
{
 sum=sum + arr[i];
}

int avge=sum/arr.length;
System.out.print(+avge);

 }
}