package Teli_fagyi;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        String[] token;
        Map<String, Integer> map = new TreeMap<>();

        while ((line = br.readLine()) != null) {
            token = line.split(";");
            map.put(token[0], Integer.parseInt(token[1]));
        }

        int bevetel = 0;
        int rendeles_darab = 0;

        try (BufferedReader br2 = new BufferedReader(new FileReader(args[0]))) {
            while ((line = br2.readLine()) != null) {
                token = line.split("[;,]");
                int megvan_e_benne = 0;

                for (int i = 1; i < token.length; i++) {
                    if (map.containsKey(token[i])) {
                        megvan_e_benne++;
                    }
                }

                if (megvan_e_benne == token.length - 1) {
                    for (int i = 1; i < token.length; i++) {
                        bevetel=bevetel+map.get(token[i]);
                                    
                    }
                    rendeles_darab++;
                }
            }

        } catch (FileNotFoundException ex) {
            System.err.println("Nem lÊtezik a file!");
        } catch (IOException ex) {
            System.err.println("IO hiba");
        }

        System.out.println(rendeles_darab + " rendeles");
        System.out.println(bevetel + " Ft");
    }

}