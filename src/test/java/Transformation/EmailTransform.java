package Transformation;


import io.cucumber.cucumberexpressions.Transformer;

public class EmailTransform implements Transformer {

    @Override
    public String transform(String s) {
        return s + "@ea.com";
    }
}
