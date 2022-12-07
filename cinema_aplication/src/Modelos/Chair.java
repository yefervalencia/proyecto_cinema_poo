package Modelos;

/**
 *
 * @author Lenovo
 */
public class Chair {
    private char letter;
    private int number;

    public Chair() {
    }

    public Chair(char letter, int number) {
        this.letter = letter;
        this.number = number;
    }

    /**
     * @return the letter
     */
    public char getLetter() {
        return letter;
    }

    /**
     * @param letter the letter to set
     */
    public void setLetter(char letter) {
        this.letter = letter;
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }
    
    
    
}
