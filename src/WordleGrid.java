/**
 * This class represents the Wordle Grid on which the user will play
 *
 * @author Gregory Tomchuk
 */
public class WordleGrid {

    /** The grid on which the game will be played */
    private String[][] grid;

    /** Instantiates a grid object */
    public WordleGrid() {
        grid = new String[6][5]; // 6 x 5 board
    }

    /** Prints the grid to the console */
    public void printGrid() {
        System.out.println();
    }


}
