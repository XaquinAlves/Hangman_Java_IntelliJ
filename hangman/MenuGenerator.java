package hangman;

/**
 * Esta e a clase MenuGenerator, que se encarga dos menus da aplicacion
 *
 * @author Xaquin Alves Gonzalez
 */
public class MenuGenerator {
    //Referencia ao obxeto que xestiona a partida
    private HangMan hangMan;

    public static void main(String[] args) {
        MenuGenerator menuGenerator = new MenuGenerator();

        do {
            menuGenerator.hangMan = new HangMan(menuGenerator.showInitMenu());
            menuGenerator.showGameMenu();
        } while (!menuGenerator.showExitMenu());
    }

    /**
     * Mostra o menu inicial que permite xerar a palabra a adiviñar
     *
     * @return palabra a adiviñar;
     */
    private String showInitMenu() {
        WordGenerator wordGenerator = new WordGenerator();
        return wordGenerator.generateWord();
    }

    /**
     * Mostra o menu do xogo, que vai pedindo as letras e mostrando os
     * fallos e acertos na palabra
     */
    private void showGameMenu() {
        System.out.println("Palabra a adivinar: " + hangMan.getHiddenWord().show());
        System.out.println("Letras falladas: " + hangMan.getStringFails());

        System.out.println("Introduce unha letra a adivinar: ");
    }

    private boolean showExitMenu() {

    }
}
