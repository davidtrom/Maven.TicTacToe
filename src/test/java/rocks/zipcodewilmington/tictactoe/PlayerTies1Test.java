package rocks.zipcodewilmington.tictactoe;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author leon on 6/20/18.
 */
public class PlayerTies1Test {

    private Board board;

    @Before
    public void setup() {
        // Given
        this.board = new Board(new Character[][]{
                {'X', 'O', 'X'},
                {'O', 'O', 'X'},
                {'X', 'X', 'O'}
        });
    }
/*
2 x 2 Array in array speak.
came from Board
character arrays
*/

    @Test
    public void getWinnerTest() {
        // Given
        String expectedWinner = "";

        // When
        String actualWinner = board.getWinner();

        // Then
        Assert.assertEquals(expectedWinner, actualWinner);
    }
// Nobody won this game.


    @Test
    public void isInFavorOfPlayerOTest() {
        // Given
        Boolean expected = false;

        // When
        Boolean actual = board.isInFavorOfO();

        // Then
        Assert.assertEquals(expected, actual);
    }
    //Nobody won so it won't be in favor of x or o


    @Test
    public void isInFavorOfPlayerXTest() {
        // Given
        Boolean expected = false;

        // When
        Boolean actual = board.isInFavorOfX();

        // Then
        Assert.assertEquals(expected, actual);
    }
//Nobody won so it won't be in favor of x or o

    @Test
    public void isTieTest() {
        // Given
        Boolean expected = true;

        // When
        Boolean actual = board.isTie();

        // Then
        Assert.assertEquals(expected, actual);

    }
    //Nobody won so it won't be in favor of x or o
}

