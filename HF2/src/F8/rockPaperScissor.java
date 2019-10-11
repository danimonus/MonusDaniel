package F8;
import java.util.Random;
import java.util.Scanner;

public class rockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String sajat="";
        String gep=null;
        
        
        while(true){
        while(!((sajat.equals("ko")) || (sajat.equals("papir")) || (sajat.equals("ollo")) || (sajat.equals("vege")))){
        sajat = sc.nextLine();
        }
        if(sajat.equals("vege")){
        break;}
        switch(rand.nextInt(3)){
                case 0: gep = "ko";
                break;
                case 1:
                gep="papir";
                break;
                case 2:
                    gep = "ollo";
                    break;
        }      
        
        System.out.println("Jatekos: " + sajat);
        System.out.println("Gep: "+ gep);
        if(sajat.equals(gep)){
            System.out.println("dontetlen");}
           
        else if(sajat.equals("ko")&& gep.equals("ollo")){
            System.out.println("Nyertel!");
            }
                    
                    else if(sajat.equals("papir") && gep.equals("ollo")){
                                System.out.println("Nem nyertel!");
                    }    
                    
                         else if(sajat.equals("ko") && gep.equals("papir")){
                                System.out.println("Nem nyertel!");
                    }    
                    
                           else if(sajat.equals("ollo") && gep.equals("papir")){
                                System.out.println("Nyertel!");
                    }    
        
                        else if(sajat.equals("papir") && gep.equals("ko")){
                            System.out.println("Nyertel!");
            }
                    
                                else if(sajat.equals("ollo") && gep.equals("ko")){
                                    System.out.println("Nem nyertel!");
                    } 

                    
                    sajat = sc.nextLine();
        }
    }
    

}

