package gretaTumberg;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public class EcologyListOfHumans {
    private static int ecologyNormalValue = 800;

    public void createEcoList(Writer fileWriter, ArrayList<Human> humanMas, ListAnalyzable list) throws IOException {
        for (Human human : humanMas) {
            if (list.isNotEcology(human)) {
                fileWriter.write(createHumanStringLine(human) + "\n");
            }
        }
    }

    private String createHumanStringLine(Human human) {
        return new String(human.getId() + "" + "|" + human.getName() + "|" + human.getWaterCount() + "|"
                + human.getGasCountDay() + "|" + human.getGasCountNight() + "|" +
                human.getElectroCountDay() + "|" + human.getElectroCountNight());
    }

    public static int getEcologyNormalValue() {
        return ecologyNormalValue;
    }
}
