/*Q4. Write a program in java to rotate an array by N positions without using other array. 
  
 Input:  
 The given array is: 0  3  6  9  12  14  18  20  22  25  27 
 
 From 4th position the values of the array are: 12 14 18 20 22 25 27  
 Before 4th position the values of the array are: 0  3  6  9  
 After rotating from 4th position the array is: 12 14 18 20 22 25 27 0 3  6 9 */



public  class Nrotate{

 static void printReverse(int arr[], int start,int end)
{
  while(start < end)
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
 int []arr={0,3,6,9,12,14,18,20,22,25,27};

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
























