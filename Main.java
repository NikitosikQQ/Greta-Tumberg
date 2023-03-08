package gretaTumberg;

import java.io.*;
import java.util.*;

public class Main {
    private static int ecologyNormalValue = 400;

    public static void main(String[] args) throws IOException {
        Reader fileReader = new FileReader("data.csv");
        BufferedReader bufReader = new BufferedReader(fileReader);
        List<Human> humanMas = Human.createHumanMassive(bufReader);

        Writer fileWriter = new FileWriter("eco_data.csv");
        WriterToFile writerFile = new WriterToFile();
        EcologyAnalyzator list = (human, ecologyNormalValue) -> {

            if (human.getWaterCount() > ecologyNormalValue) {
                return true;
            }

            if ((human.getGasCountDay() + human.getGasCountNight()) > ecologyNormalValue) {
                return true;
            }

            if ((human.getElectroCountDay() + human.getElectroCountNight()) > ecologyNormalValue) {
                return true;
            }
            return false;
        };
        Filter filterClass = new EcologyFilter();
        writerFile.writeToFile(fileWriter, filterClass.filtrate(humanMas, list, ecologyNormalValue));

        fileReader.close();
        bufReader.close();
        fileWriter.close();


    }

}
