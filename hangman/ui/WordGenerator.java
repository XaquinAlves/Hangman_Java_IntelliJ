package hangman.ui;

public interface WordGenerator {
    /**
     * Devolve o String coa palabra xerada
     * @return palabra xerada
     * @throws GenerateWordException se non se atopa a palabra
     */
    String generateWord() throws GenerateWordException;

}
