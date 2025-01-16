package hangman.model;

import java.util.ArrayList;

/**
 * @author Xaquin Alves Gonzalez
 */
public class HangMan {
    //Numero de intentos permitidos
    public final int MAX_FAILS = 6;
    //Palabra a adiviñar
    private HiddenWord hiddenWord;
    //Caracteres fallados
    private ArrayList<Character> fails;

    /**
     * Crea unha nova intancia de HangMan, con 6 intentos maximos
     * e a palabra dada como palabra oculta
     *
     * @param word palabra oculta a establecer
     */
    public HangMan(String word) {
        hiddenWord = new HiddenWord(word);
        fails = new ArrayList<>();
    }

    /**
     *
     * @return a referencia a palabra oculta
     */
    public HiddenWord getHiddenWord() {
        return hiddenWord;
    }

    /**
     *
     * @param hiddenWord palabra oculta a establecer
     */
    public void setHiddenWord(HiddenWord hiddenWord) {
        this.hiddenWord = hiddenWord;
    }

    /**
     *
     * @param fails ArrayList cos caracteres fallados a establecer
     */
    public void setFails(ArrayList<Character> fails) {
        this.fails = fails;
    }

    /**
     * Obten a lista de caracteres fallados acumulados na partida
     *
     * @return lista de caracteres fallados
     */
    public ArrayList<Character> getFails() {
        return fails;
    }

    /**
     * Obten un String coa lista de caracteres fallados acumulados, separados por
     * espazos en branco
     *
     * @return lista de caracteres fallados
     */
    public String getStringFails() {
        String stringFails = "";

        for (Character c : fails) {
            stringFails = stringFails.concat(c + " ");
        }

        return stringFails;
    }

    /**
     * Devolve a palabra substituindo os caracteres non acertado por guions
     *
     * @return String coa palabra amosando so as letras acertadas
     */
    public String showHiddenWord() {
        return hiddenWord.show();
    }

    /**
     * Devolve a palabra completa, incluindo caracteres non acertados
     *
     * @return String coa palabra completa
     */
    public String showFullWord() {
        return hiddenWord.showFullWord();
    }

    /**
     * Proba se o caracter indicado forma parte da palabra, amosando todas as
     * apricions en caso de que este, e agregandoo a lista de caracteres fallidos
     * se non
     *
     * @param c caracter a comprobar
     */
    public void tryChar(char c) {
        if (!hiddenWord.checkChar(c)) {
            fails.add(c);
        }
    }

    /**
     * Comproba se rematou a partida, ben por numero de intentos ou por acertar
     * a palabra
     *
     * @return se rematou a partida
     */
    public boolean isGameOver() {
        return maxFailsExceeded() || hiddenWord.isVisible();
    }

    /**
     * Comproba se alcanzou o limite de intentos permitidos
     *
     * @return se alcanzou o limite de intentos
     */
    public boolean maxFailsExceeded() {
        return fails.size() == MAX_FAILS;
    }
}
