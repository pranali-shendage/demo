//check if a given array is sorted or not.

public class ArrayISsort{
public static void main(String x[]){

int a[]={2,3,4,5,6,7,8,9};
Boolean flag=true;

for(int i=1;i<a.length-1;i++)
{
   if(a[i]<a[i-1])
   {
     flag=false;
      break;
    }


}
  if(flag)
   {
    System.out.println("Array is sorted");
   }
   else{
     System.out.println("Array is not sorted");
     }

}
}