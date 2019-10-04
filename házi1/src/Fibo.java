public class Fibo {
  
public static void main(String args[])
{  
 int s1=0,s2=1,s3,i,f=14;  
 System.out.print(s1+" "+s2);
  
 for(i=2;i<f;++i)
 {  
  s3=s1+s2;  
  System.out.print(" "+s3);  
  s1=s2;  
  s2=s3;  
 }  
    System.out.println("\n");
}}


