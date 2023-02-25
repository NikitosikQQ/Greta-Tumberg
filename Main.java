package gretaTumberg;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        Reader fileReader = new FileReader("data.csv");
        BufferedReader bufReader = new BufferedReader(fileReader);
        ArrayList<Human> humanMas = Human.createHumanMassive(bufReader);

        Writer fileWriter = new FileWriter("eco_data.csv");
        EcologyListOfHumans ecologyListOfHumans = new EcologyListOfHumans();
        ListAnalyzable list = (human) -> {

            if (human.getWaterCount() > EcologyListOfHumans.getEcologyNormalValue()) {
                return true;
            }

            if ((human.getGasCountDay() + human.getGasCountNight()) > EcologyListOfHumans.getEcologyNormalValue()) {
                return true;
            }

            if ((human.getElectroCountDay() + human.getElectroCountNight()) > EcologyListOfHumans.getEcologyNormalValue()) {
                return true;
            }
            return false;
        };
        ecologyListOfHumans.createEcoList(fileWriter, humanMas, list);

        fileReader.close();

        bufReader.close();
        fileWriter.close();

    }

}
