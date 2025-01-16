package hangman.ui;

import java.util.Arrays;

public class KeyboardWordGenerator implements WordGenerator {


    public KeyboardWordGenerator() {
    }

    public String generateWord() throws GenerateWordException {
        return Arrays.toString(System.console().readPassword("Introduce a palabra a adiviñar: "));
    }
}
