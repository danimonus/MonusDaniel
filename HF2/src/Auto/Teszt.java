
package Auto;



public class Teszt {
 
    public static void rendezMaxSzallithatoTeherCsokkenoleg(Teherauto [] teher){
        for(int i=0;i<teher.length-1;i++){
            for(int j=i+1;j<teher.length;j++){
            
            if(teher[i].getMaxSzallithatoTeher() < teher[j].getMaxSzallithatoTeher()){
            Teherauto tmp = teher[j];
            teher[j]=teher[i];
            teher[i]=tmp;
        }
            }
        }
    
    }
    
    public static int keresMaxMotorTeljesitmeny(Auto[] auto){
        
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i<auto.length;i++){
        if(max < auto[i].getMotorTeljesitmeny()){
        max = auto[i].getMotorTeljesitmeny();
        
        }
        }
        return max;
    }
    public static void main(String[] args) {
        Auto [] autoArray = new Auto[10];
        autoArray[0]  = new Auto("ABC123",10);
        autoArray[1]  = new Auto("ABC123",5);
        autoArray[2]  = new Auto("ABC123",1);
        autoArray[3]  = new Auto("ABC123",8);
        autoArray[4]  = new Auto("ABC123",9);
        autoArray[5]  = new Teherauto("ABC123",11,5);
        autoArray[6]  = new Teherauto("ABC123",2,5);
        autoArray[7]  = new Teherauto("ABC123",4,7);
        autoArray[8]  = new Teherauto("ABC123",6,3);
        autoArray[9]  = new Teherauto("ABC123",8,8);
        
        Teherauto[] teherArray = new Teherauto[10];
        
        teherArray[0]  = new Teherauto("ABC123",10,4);
        teherArray[1]  = new Teherauto("ABC123",2,7);
        teherArray[2]  = new Teherauto("ABC123",9,8);
        teherArray[3]  = new Teherauto("ABC123",3,4);
        teherArray[4]  = new Teherauto("ABC123",8,8);
        teherArray[5]  = new Teherauto("ABC123",3,2);
        teherArray[6]  = new Teherauto("ABC123",2,5);
        teherArray[7]  = new Teherauto("ABC123",4,7);
        teherArray[8]  = new Teherauto("ABC123",6,3);
        teherArray[9]  = new Teherauto("ABC123",8,8);
        
              
        System.out.println(keresMaxMotorTeljesitmeny(autoArray));
        rendezMaxSzallithatoTeherCsokkenoleg(teherArray);
        for(int i=0;i<teherArray.length;i++)
        System.out.println(teherArray[i].getMaxSzallithatoTeher());
    }
   
  
   
}
