package hangman.ui;

/**
 * Esta é a clase WordGenerator, que xera a palabra oculta a partir dunha lista de palabras gardadas
 *
 * @author Xaquin Alves Gonzalez
 */
public class ArrayWordGenerator implements WordGenerator {
    //ArrayList coas palabras
    private final static String[] WORDLIST = {
            "luns", "abella", "baile", "camino", "dente", "estrela", "froita", "gato", "illa",
            "xardin", "lua", "monte", "nube", "chuchamel", "pazo", "queixo", "rua", "sol", "tren",
            "vento", "xogo", "iate", "raposa", "alba", "carro", "boi", "estudo", "fuga", "galego", "herba",
            "iogur", "axouxere", "maza", "neve", "ouro", "pobo", "queima", "rato", "serra", "tenda", "urro",
            "vaca", "xente", "cenoria", "apego", "bicicleta", "cebra", "esfera", "fio", "enxebre"
    };

    /**
     * Devolve o String coa palabra xerada a partir da lista
     * @return palabra xerada
     * @throws GenerateWordException se non se atopa a palabra
     */
    @Override
    public String generateWord() throws GenerateWordException {
        int word = new java.util.Random().nextInt(WORDLIST.length);
        return WORDLIST[word];
    }
}
