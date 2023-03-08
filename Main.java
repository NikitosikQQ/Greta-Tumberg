package gretaTumberg;

import java.io.*;
import java.util.*;

public class Main {
    private static int ecologyNormalValue = 800;

    public static void main(String[] args) throws IOException {
        Reader fileReader = new FileReader("data.csv");
        BufferedReader bufReader = new BufferedReader(fileReader);
        EcologyReader reader = new EcologyReader();
        List<Human> humanMas = reader.readFile(bufReader);

        Writer fileWriter = new FileWriter("eco_data.csv");
        WriterToFile writerFile = new WriterToFile();

        EcologyAnalyzator ecologyAnalyzator = (human, ecologyNormalValue) -> {

            if (human.getWaterCount() > ecologyNormalValue) {
                return false;
            }

            if ((human.getGasCountDay() + human.getGasCountNight()) > ecologyNormalValue) {
                return false;
            }

            if ((human.getElectroCountDay() + human.getElectroCountNight()) > ecologyNormalValue) {
                return false;
            }
            return true;
        };

        Filter filterClass = new EcologyFilter();
        writerFile.writeToFile(fileWriter, filterClass.filtrate(humanMas, ecologyAnalyzator, ecologyNormalValue));

        fileReader.close();
        bufReader.close();
        fileWriter.close();


    }

}
