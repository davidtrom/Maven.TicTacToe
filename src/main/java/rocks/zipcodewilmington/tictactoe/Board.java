package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private Character[][] board;

    public Board(Character[][] matrix) // [] [] means it's a 2 dimensional array
    {
        this.board = matrix;
    }
public Boolean checkHorizontal(Character xO) {
    for (int i = 0; i <= 2; i++) {
        if ((board[i][0] == xO) && (board[i][1] == xO) && (board[i][2] == xO)) {
            return true;
        }
    }
    return false;
}


    public Boolean checkVertical(Character xO)
    {
        for (int i = 0; i<=2; i++)
        {
            if ((board [0][i] == xO) && (board[1][i] == xO) && (board[2][i] == xO))
            {
                return true;
            }
        }
        return false;
    }

    public Boolean checkDiagonal(Character xO)
    {

            if ((board [0][0] == xO) && (board[1][1] == xO) && (board[2][2] == xO)) {
                return true;}

            if ((board [0][2] == xO) && (board[1][1] == xO) && (board[2][0] == xO))
            {return true;}

        return false;
    }

    public Boolean isInFavorOfX()
    {
        if (checkHorizontal('X') || checkDiagonal('X') || checkVertical('X'))
        {
            return true;
        }
    else
        {
        return false;
        }

    }

    public Boolean isInFavorOfO()
    {
        if (checkHorizontal('O') || checkDiagonal('O') || checkVertical('O'))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public Boolean isTie() {
        if (!isInFavorOfX() && !isInFavorOfO())
        {return true;}
        return false;
    }

    public String getWinner() {
        if (isInFavorOfO())
        {return "O";}
        if (isInFavorOfX())
        {return "X";}
        else
        {return "";}
    }

}
