package gretaTumberg;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public class EcoList {
    public static final int ECOlOGY_NORMAL_VALUE = 800;

    public void createEcoList(Writer fileWriter, ArrayList<Human> humanMas) throws IOException {
        ListAnalyzable list = (human) -> {

            if (human.getWaterCount() > ECOlOGY_NORMAL_VALUE) {
                return true;
            }

            if ((human.getGasCountDay() + human.getGasCountNight()) > ECOlOGY_NORMAL_VALUE) {
                return true;
            }

            if ((human.getElectroCountDay() + human.getElectroCountNight()) > ECOlOGY_NORMAL_VALUE) {
                return true;
            }
            return false;
        };
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

}
