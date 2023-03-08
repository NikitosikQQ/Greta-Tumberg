package gretaTumberg;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.CharBuffer;
import java.util.ArrayList;

public class EcologyReader  {

    public ArrayList<Human> readFile(BufferedReader bufReader) throws IOException {
        String line = bufReader.readLine();
        ArrayList<Human> humanMas = new ArrayList<>();
        while ((line = bufReader.readLine()) != null) {
            String[] allInfo = line.split("\\|");
            humanMas.add(new Human(allInfo));
        }
        return humanMas;
    }

}
