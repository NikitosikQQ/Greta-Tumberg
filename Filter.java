package gretaTumberg;

import java.util.List;

public interface Filter {

    List<Human> filtrate(List<Human> humans, EcologyAnalyzator ecologyAnalyzator, int ecologyNormalValue);
}
