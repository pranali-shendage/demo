/*Q7. Write a program to enter the String and sum of the all Digits in a given String 
   input : abcd123pqe12mn12abc 
   output is  Sum is  147 
   (note  sum of number is 123+12+12 =147)  */

public class SumOfDigit{
public static void main(String []x){

  String str="abcd123pqe12mn12abc";
  int sum=0;
     
   for(int i=0;i< str.length();i++){

      //char ch= str.charAt(i);
       if(Character.isDigit(ch)){
            sum += str.charAt(i);
        
           }
  
   }
System.out.println( "sum of all digit=" +sum);


 }
}
