package hangman.ui;

public class GenerateWordException extends Exception {

    private boolean visible;

    public GenerateWordException(String message, boolean visible) {
        super(message);
        this.visible = visible;
    }

    /**
     *
     * @return se o erro e visible
     */
    public boolean isVisible() {
        return visible;
    }

    /**
     *
     * @param visible establece a visibilidade do erro
     */
    public void setVisible(boolean visible) {
        this.visible = visible;
    }
}
