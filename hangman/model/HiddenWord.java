package hangman.model;

import java.util.Arrays;

/**
 * Esta é a clase HiddenWord, que representa unha palabra oculta
 *
 * @author Xaquin Alves Gonzalez
 */
public class HiddenWord {
    //Array que garda a palabra oculta
    private char[] characters;
    //Array que garda se cada caracter esta oculto
    private boolean[] hits;

    /**
     *
     * @return o array que garda a palabra
     */
    public char[] getCharacters() {
        return characters;
    }

    /**
     *
     * @param characters array que garda a palabra a establecer
     */
    public void setCharacters(char[] characters) {
        this.characters = characters;
    }

    /**
     *
     * @return o array que garda se as letras estan ocultas
     */
    public boolean[] getHits() {
        return hits;
    }

    /**
     *
     * @param hits array que indica se as letras estan ocultas a establecer
     */
    public void setHits(boolean[] hits) {
        this.hits = hits;
    }

    /**
     * Crea unha nova instacia de HiddenWord coa palabra do parametro como palabra oculta
     *
     * @param word palabra oculta a establecer
     */
    public HiddenWord(String word) {

        characters = word.toCharArray();
        hits = new boolean[characters.length];

        Arrays.fill(hits, false);
    }

    /**
     * Comproba se o caracter dado forma parte da palabra oculta
     *
     * @param c letra a comprobar
     * @return se a letra esta na palabra
     */
    public boolean checkChar(char c) {
        boolean hit = false;
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == c) {
                hits[i] = true;
               hit = true;
            }
        }

        return hit;
    }

    /**
     * Devolve a palabra substituindo os caracteres non acertado por guions
     *
     * @return String coa palabra amosando so as letras acertadas
     */
    public String show() {
        String word = "";

        for (int i = 0; i < characters.length; i++) {
            if (hits[i]) {
              word = word.concat(characters[i] + " ");
            } else {
                word = word.concat("- ");
            }
        }

        return word;
    }

    /**
     * Devolve a palabra completa, incluindo caracteres non acertados
     *
     * @return String coa palabra completa
     */
    public String showFullWord() {
        return String.valueOf(characters);
    }

    /**
     * Indica se a palabra é totalmente visible
     *
     * @return se a palabra está adiviñada
     */
    public boolean isVisible() {
        for (boolean isVisible : hits) {
            if (!isVisible){
                return false;
            }
        }
        return true;
    }

}
