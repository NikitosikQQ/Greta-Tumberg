package gretaTumberg;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class WriterToFile {

    public void writeToFile(Writer fileWriter, List<Human> ecologyHumans) throws IOException {
        for (Human human : ecologyHumans) {
                fileWriter.write(createHumanStringLine(human) + "\n");
        }
    }

    private String createHumanStringLine(Human human) {
        return new String(human.getId() + "" + "|" + human.getName() + "|" + human.getWaterCount() + "|"
                + human.getGasCountDay() + "|" + human.getGasCountNight() + "|" +
                human.getElectroCountDay() + "|" + human.getElectroCountNight());
    }

}

