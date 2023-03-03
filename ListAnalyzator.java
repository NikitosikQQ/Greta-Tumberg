package gretaTumberg;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public class ListAnalyzator {

    public void createEcoList(Writer fileWriter, ArrayList<Human> humanMas, ListAnalyzable list, int ecologyNormalValue) throws IOException {
        for (Human human : humanMas) {
            if (list.isNotEcology(human, ecologyNormalValue)) {
                fileWriter.write(createHumanStringLine(human) + "\n");
            }
        }
    }

    private String createHumanStringLine(Human human) {
        return new String(human.getId() + "" + "|" + human.getName() + "|" + human.getWaterCount() + "|"
                + human.getGasCountDay() + "|" + human.getGasCountNight() + "|" +
                human.getElectroCountDay() + "|" + human.getElectroCountNight());
    }

}

