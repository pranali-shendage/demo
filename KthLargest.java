/*  
Q3. Write a Java program to find the kth largest element in an array without sorting. 
 
Input: 
Enter size: 6 
Enter elements: 10 45 23 67 34 67 
Enter k value: 2 
Output: Second largest element is 45 */

/*public class KthLargest{

public static void main(String[]x){

int arr[]={10 ,45, 23, 67, 34, 67 };

int k=2; int temp;

for(int i=0;i<arr.length;i++){
  for(int j=i+1;j<arr.length;j++){
  
   if(arr[i] > arr[j]){
    temp=arr[i];
     arr[i]=arr[j];
     arr[j] = temp;
   }
 }
     if(i==k-1){
      System.out.println(k+"largest element is: "+arr[i]);
        break;
      }
   }
  for(int i=0;i<arr.length;i++)
   {
     System.out.print(" "+arr[i]);
    }


 }
}

*/

public  class KthLargest{

 static void printReverse(int arr[], int start,int end)
{
  while(start > end)
{
	  int temp= arr[start];
  arr[start]=arr[end];
   arr[end]=temp;
start++;
end--;
}

   }
public static void main(String []x)
{
 int arr[]={10,20,30,40,50};

int pos=4;

  printReverse(arr,0,pos-1);
  printReverse(arr,pos,arr.length-1);
  printReverse(arr,0,arr.length-1);




 for(int num: arr)
{
System.out.print( num + " ");
}

} 
}
