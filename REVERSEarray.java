/* 
Q2. Write a program to reverse an array using recursion. 
Input: 
Array: 
10 20 30 40 50 
Output: 
Reversed Array: 
50 40 30 20 10  */


public  class REVERSEarray{

 static void printReverse(int arr[], int start,int end){
  if(start > end)
 
   return;


   int temp= arr[start];
  arr[start]=arr[end];
   arr[end]=temp;

printReverse(arr,start + 1, end-1); 
   }
public static void main(String []x)
{
 int arr[]={10,20,30,40,50};
  printReverse(arr,0,arr.length-1);
 for(int num: arr)
{
System.out.print( num + " ");
}

} 
}
