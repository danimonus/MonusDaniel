import java.util.Arrays;
public class Metodusok {

    public static void met1(int a, int b, int c){
        int[] array = {a,b,c};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));   
}
    public static void met2(double a, double b, double c){
    double[] array = {a,b,c};
    double min=Double.MAX_VALUE,max=Double.MIN_VALUE;
    
    for(int i=0; i<array.length; i++ ) {
         if(array[i]<min) {
            min = array[i];    
         }}
    
         for(int i=0; i<array.length; i++ ) {
         array[i]=Math.abs(array[i]);
             if(array[i]>max) {
            max = array[i];
         }
      }
         System.out.println("MIN= "+min + " MAX= "+max);
}
    
    public static void met3(double a, double b, double c, double d){
            System.out.println("" +a+" "+b+" "+c+" "+d);

        if(d>=0){

        System.out.println("" +a+" "+c+" "+b+" "+d);}
    
        else
            System.out.println("" +a+" "+b+" "+d+" "+c);
    
    
    }
    
    public static boolean met4(double a, double b, double c){
if(a<=0 || b<=0 || c<=0)
    return false;
        if((a+c)>b && (b+c)>a && (a+b)>c)
    return true;
        return false;
    }
    public static void met5(int a, int b){
    int db=0;
        for(int i=a;i<=b;i++){
       
            if((i % 4 == 0) && (i % 100 != 0) || (i % 400 == 0))
            db++;
    }
        System.out.println(""+db);
    }
   public static void met6(int a){
   switch(a){
       case 1: System.out.println("Elégtelen");break;
       case 2: System.out.println("Elégséges");break;
       case 3: System.out.println("Közepes");break;
       case 4: System.out.println("Jó");break;
       case 5: System.out.println("Jeles");break;
       default: System.out.println("Nincs ilyen jegy!");
   }
   }
   public static void met7(int a, int b){
   int hanyados=0;
   while(a>=b){
   hanyados++;
    a=a-b;
   }
       System.out.println(""+hanyados);
   }
   
   public static void met8(int a){
    boolean f = false;
        for(int i = 2; i <= a/2; i++)
        {
            if(a % i == 0)
            {
                f = true;
                break;
            }
        }
        if (!f)
            System.out.println("A "+a + " a(z) primszam.");
        else
            System.out.println("A "+a + " a(z) nem primszám.");
   
   }
   
   public static void met9(int a){
   int s1=0,s2=1,s3,i;  
 System.out.print(s1+" "+s2);
  
 for(i=2;i<a;++i)
 {  
  s3=s1+s2;  
  System.out.print(" "+s3);  
  s1=s2;  
  s2=s3;  
 }  
    System.out.println("\n");
   }
   
   public static void met10(int n){
   int ujszam=0;
   while(n!=0){
   ujszam=ujszam*10+(n%10);
   n=n/10;
   }
       System.out.println(""+ujszam);
   }
   public static void met11(int a){
   int s=1;
       for(int i=1;i<=a;i++){
        s*=i;
   }
       System.out.println(""+s);
   }
   
   public static void met12(int n1, int n2){
   int k=4;
   for(int i=n1;i<=n2;i++){
   if(i%k==0){
       System.out.println(""+i);
   }
   }
   }
   public static void met13(int n){
   int eredmeny;
    int s1=0,s2=1,s3,i;    
 for(i=n;i<n+50;++i)
 {  
  s3=s1+s2; 
  if(s3>n){
  System.out.println(""+s3); 
  break;
  }
  s1=s2;  
  s2=s3;  
 } } 
   
 public static void met14(){
          for(int i=0;i<1000;i++){
        
            int szam = i;

            int szazasok = szam / 100;

            szam -= szazasok * 100;

            int tizesek = szam / 10;
            szam -= tizesek * 10;

            int egyesek = szam;
        
        if ( (Math.pow(egyesek, 3) + Math.pow(tizesek, 3) + Math.pow(szazasok, 3)) == i){
            System.out.println(i);
        }
        
 }
 }

    public static void main(String[] args) {
   met1(3,6,9);
   met2(5.4,7.6,-8.6);
   met3(3.5,6,8,7);
   met4(4,6,7);
   met5(2010,2020);
   met6(3);
   met7(10,2);
   met8(12);
   met9(14);
   met10(321);
   met11(12);
   met12(1,20);
   met13(21);
   met14();
   
}
    
}
