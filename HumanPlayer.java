import java.util.*;

class HumanPlayer extends Player
{
    HumanPlayer(String name, char mark)
    {
        this.name = name;
        this.mark = mark;
    }
    void makeMove()
    {
        Scanner sc = new Scanner(System.in);
        int row;
        int col;
        do{
            System.out.println("Enter the row and col");
            row = sc.nextInt();
            col = sc.nextInt();
        }while(!isValidMove(row, col));
        TicTacToe.placeMark(row, col, mark);
    }
}