package gretaTumberg;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Filter {

    public List<Human> filtrateNotEcology(ArrayList<Human> humanMas, EcologyAnalyzator list, int ecologyNormalValue) throws IOException {
        List<Human> ecologyHuman = new ArrayList<>();
        for (Human human : humanMas) {
            if (list.isNotEcology(human, ecologyNormalValue)) {
                ecologyHuman.add(human);
            }
        }
        return ecologyHuman;
    }
}
