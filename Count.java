 // write a Java Program – Count Even, Odd, Positive, Negative

public class Count{
public static void main (String x[]){

int []arr={10,-5,-33,0,22,-8,-7};
int even=0;
int odd=0;
int positive=0;
int negative=0;

for (int i=0;i<arr.length;i++)
{
  if(arr[i]%2==0)
      {
        even ++;
       }
   else
     {
       odd++;
     }

if(arr[i]>0)
  {
   positive ++;
   }
  else if (arr[i]<0)
      {
     negative ++;
      }
}


System.out.println("even no :"+even);
System.out.println("odd no :"+odd);
System.out.println("positive no :"+positive);
System.out.println("negative no :"+negative);

}
}
