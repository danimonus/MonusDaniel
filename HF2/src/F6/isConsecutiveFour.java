package F6;
public class isConsecutiveFour {

    public static boolean isConsecutiveFour(int[] values){
int numberOfRows = values.length;
int db=0;
boolean f=false;
if(values.length<4)
    return false;

for(int i = 0;i < values.length-3;i++){
         if(values[i]==values[i+1] && 
            values[i]==values[i+2] &&
            values[i]==values[i+3]       
            ){
             db++;
             if(db>=1 && db<=4){
                 f=true;
                 break;
             }
         }
         }

         if(f)
        
             System.out.println("True");
        
         else
         System.out.println("False");
        
    return true;
    }


    public static void main(String[] args) {
        int num[]={4,3,4,4,5};
        int num2[]={5,5,5,5,5};

        isConsecutiveFour(num);
                isConsecutiveFour(num2);

        
    }
    
}
