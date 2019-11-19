package BankkartyaSzam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
    

Scanner sc = new Scanner(System.in);
String line;

while(sc.hasNextLine()){
line = sc.nextLine();
if(line.isEmpty())  break;
   
else{
     String[] bkSzam = line.split("");
     int[] szam = new int[16];
     int osszeg=0;

    for (int i = 0; i < bkSzam.length; i++) {
            szam[i]=Integer.parseInt(bkSzam[i]);
            if(i%2==0){
            szam[i]*=2;
            }
            if(szam[i]<10){
            osszeg+=szam[i];
            }
            else{
            szam[i]-=9;
            osszeg+=szam[i];
            }
                }
                if(osszeg%10==0)
                    System.out.println("YES");
                else
                    System.out.println("NO");
        }

}

  }
    
}
