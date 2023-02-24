package gretaTumberg;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        Reader fileReader = new FileReader("data.csv");
        BufferedReader bufReader = new BufferedReader(fileReader);
        ArrayList<Human> humanMas = Human.createHumanMassive(bufReader);

        Writer fileWriter = new FileWriter("eco_data.csv");
        EcoList ecoList = new EcoList();
        ecoList.createEcoList(fileWriter, humanMas);

        fileReader.close();

        bufReader.close();
        fileWriter.close();

    }

}
