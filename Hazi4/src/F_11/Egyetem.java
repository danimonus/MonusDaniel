package F_11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Egyetem{

List<Szemely> lst = new ArrayList<Szemely>();

public void addH(){
Hallgato h1 = new Hallgato("Joe",23,true,3.56);
lst.add(h1);
}
public void addO(){
Oktato o1 = new Oktato("Janos",35,true,"IK");
lst.add(o1);
Oktato o2 = new Oktato("Katalin",33,false,"IK");
lst.add(o2);
lst.remove(o1);
}



//static List<Szemely> legFiatalabbak (List<Szemely> l){
//List<Szemely> vissza = new ArrayList<>();
////if(l instanceof Hallgato)
//
//Collections.sort(l);
//if(l.size()<3){
//    return l;
//}
//else
//   for (int i = 0; i < 3; i++) 
//        vissza.add(l.get(i));
//          return vissza;
// 
//}


static List<Szemely> legFiatalabbak (List<Szemely> l){
List<Szemely> vissza = new ArrayList<>();

if(l instanceof Hallgato){
Collections.sort(l);
if(l.size()<3){
    return l;
}
else
   for (int i = 0; i < 3; i++) 
        vissza.add(l.get(i));
          return vissza;
 
}
   return null;
}





}