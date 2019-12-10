package Oroszlan;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader(args[0]));
        List<String> felv = new ArrayList<>();
        int szamlalo = 0;
        String sor;
        while ((sor = br.readLine()) != null) {

            if (!(sor.equals("END"))) {
                String[] token = sor.split(":");

                
                felv.add(token[1]);
                szamlalo++;
            }
            if (sor.equals("END")) {
                char[] meret = felv.get(0).toCharArray();
                
                int i = 0;
                int oroszlan_van = 0;
                int db;
                
                for (int j = 0; j < meret.length; j++) {
                    if (felv.get(i).charAt(j) == 'O') {
                        db = 1;
                        for (int k = 1; k < szamlalo; k++) {
                            if (felv.get(k).charAt(j) == 'O') {
                                db++;
                            }
                        }
                        if (db == szamlalo) {
                            oroszlan_van++;
                        }
                    }
                }
                felv.clear();
                szamlalo = 0;
                
                System.out.println(oroszlan_van);
            }
        }
    }
}
