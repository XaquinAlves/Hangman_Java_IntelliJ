package hangman.ui;

import hangman.model.HangMan;

import java.util.Scanner;

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
            try {
                menuGenerator.hangMan = new HangMan(menuGenerator.showInitMenu());
                menuGenerator.showGameMenu();
            } catch (GenerateWordException e) {
                if(e.isVisible()){
                    System.out.println("Non se pudo atopar unha palabra");
                }
            }
        } while (!menuGenerator.showExitMenu());
    }

    /**
     * Mostra o menu inicial que permite xerar a palabra a adiviñar
     *
     * @return palabra a adiviñar;
     */
    private String showInitMenu() throws GenerateWordException {
        Scanner scanner = new Scanner(System.in);
        WordGenerator wordGenerator = null;
        int choice;

        System.out.println("O xogo do aforcado\n" + "Escolla un modo de xogo:");
        do {
            System.out.println("1.Palabra da lista\n" + "2.Palabra introducida");

            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                wordGenerator = new ArrayWordGenerator();
            } else if (choice == 2) {
                wordGenerator = new KeyboardWordGenerator();
            } else {
                System.out.println("Opcion incorrecta. Introduza unha opcion valida:");
            }
        } while (choice != 1 && choice != 2);

        return wordGenerator.generateWord();
    }

    /**
     * Mostra o menu do xogo, que vai pedindo as letras e mostrando os
     * fallos e acertos na palabra
     */
    private void showGameMenu() {
        Scanner scanner = new Scanner(System.in);
        char guess;

        while (!hangMan.isGameOver()) {
            System.out.println("Palabra a adivinar: " + hangMan.getHiddenWord().show());
            System.out.println("Letras falladas: " + hangMan.getStringFails());

            System.out.print("Introduce unha letra a adivinar: ");
            guess = scanner.nextLine().charAt(0);
            System.out.println();

            hangMan.tryChar(guess);
        }

        System.out.print("Fin da partida. ");
        if (hangMan.getHiddenWord().isVisible()) {
            System.out.println("Gañaches.");
        } else {
            System.out.println("Perdiches. ");
        }
        System.out.println("A palabra era: " + hangMan.getHiddenWord().showFullWord());
    }

    /**
     * Pregunta ao usuario se quere xogar unha nova partida ou sair, Devolve true se o usuario quere salir
     * e false en caso contrario
     *
     * @return se o usuario quere salir
     */
    private boolean showExitMenu() {
        Scanner scanner = new Scanner(System.in);
        char choice;
        boolean exit = true;

        do {
            System.out.println("Desea empezar unha nova partida(s/n)? ");
            choice = scanner.nextLine().charAt(0);


            if (choice == 's' || choice == 'S') {
                exit = false;
            } else if (choice == 'n' || choice == 'N') {
                System.out.println("Ata a proxima.");
            } else {
                System.out.println("Instruccion incorrecta.");
            }
        } while (choice != 's' && choice != 'S' && choice != 'n' && choice != 'N');


        return exit;
    }
}
