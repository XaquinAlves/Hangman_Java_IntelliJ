package hangman;

import java.util.ArrayList;

/**
 * Esta é a clase WordGenerator, que representa unha lista de palabras
 *
 * @author Xaquin Alves Gonzalez
 */
public class WordGenerator {
    //ArrayList coas palabras
    private final ArrayList<String> WORDLIST;

    /**
     *
     * @return o ArrayList coas palabras gardadas
     */
    public ArrayList<String> getWORDLIST() {
        return WORDLIST;
    }

    /**
     * Xera unha instancia de WordGenerator que conten 50 palabras en galego
     */
    public WordGenerator() {
        WORDLIST = new ArrayList<>();
        WORDLIST.add("luns");
        WORDLIST.add("abella");
        WORDLIST.add("baile");
        WORDLIST.add("camino");
        WORDLIST.add("dente");
        WORDLIST.add("estrela");
        WORDLIST.add("froita");
        WORDLIST.add("gato");
        WORDLIST.add("illa");
        WORDLIST.add("xardin");
        WORDLIST.add("lua");
        WORDLIST.add("monte");
        WORDLIST.add("nube");
        WORDLIST.add("chuchamel");
        WORDLIST.add("pazo");
        WORDLIST.add("queixo");
        WORDLIST.add("rua");
        WORDLIST.add("sol");
        WORDLIST.add("tren");
        WORDLIST.add("vento");
        WORDLIST.add("xogo");
        WORDLIST.add("iate");
        WORDLIST.add("raposa");
        WORDLIST.add("alba");
        WORDLIST.add("carro");
        WORDLIST.add("boi");
        WORDLIST.add("estudo");
        WORDLIST.add("fuga");
        WORDLIST.add("galego");
        WORDLIST.add("herba");
        WORDLIST.add("iogur");
        WORDLIST.add("axouxere");
        WORDLIST.add("maza");
        WORDLIST.add("neve");
        WORDLIST.add("ouro");
        WORDLIST.add("pobo");
        WORDLIST.add("queima");
        WORDLIST.add("rato");
        WORDLIST.add("serra");
        WORDLIST.add("tenda");
        WORDLIST.add("urro");
        WORDLIST.add("vaca");
        WORDLIST.add("xente");
        WORDLIST.add("cenoria");
        WORDLIST.add("apego");
        WORDLIST.add("bicicleta");
        WORDLIST.add("cebra");
        WORDLIST.add("esfera");
        WORDLIST.add("fio");
        WORDLIST.add("enxebre");
    }

    /**
     * @return unha palabra aleatoria da lista
     */
    public String generateWord() {
        int word = new java.util.Random().nextInt(50);
        return WORDLIST.get(word);
    }

}
