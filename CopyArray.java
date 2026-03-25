// Copy one array into another array

public class CopyArray{
public static void main(String []x){

int []arr={1,2,3,4,5};
int []copy=new int[arr.length];

System.out.print("copy []:");
for(int i=0;i<arr.length;i++)
{
  copy[i]=arr[i];  //copy element  arr[i] into copy[i].
  
   System.out.print(" "+copy[i]);
}

}
}