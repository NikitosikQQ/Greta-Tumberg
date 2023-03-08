package gretaTumberg;

import java.util.ArrayList;
import java.util.List;

public class EcologyFilter implements Filter {

    @Override
    public List<Human> filtrate(List<Human> humanMas, EcologyAnalyzator list, int ecologyNormalValue) {
        List<Human> ecologyHuman = new ArrayList<>();
        for (Human human : humanMas) {
            if (list.isNotEcology(human, ecologyNormalValue)) {
                ecologyHuman.add(human);
            }
        }
        return ecologyHuman;
    }
}

