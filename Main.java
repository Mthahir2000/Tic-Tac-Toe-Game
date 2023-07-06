import java.util.*;

public class Main{
    public static void main(String[] args){
        TicTacToe t = new TicTacToe();
        int ch;
        boolean loop = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to TicTacToe Game");
        while(loop)
        {
            System.out.println("Press 1 for One Player OR Press 2 for TWO Player");
            ch = sc.nextInt();
            if(ch == 1)
            {
                String PN1;
                Scanner c1 = new Scanner(System.in);
                System.out.println();
                System.out.println("Enter the Player Name Who Takes X");
                HumanPlayer p1 = new HumanPlayer(PN1 = c1.nextLine(),'X');
                AIPlayer p2 = new AIPlayer("Robot",'O');
                System.out.println();
                System.out.println("----- " + PN1 + " Takes X -----");
                System.out.println("----- Robot Takes O -----");
                System.out.println();
                System.out.println("Let's Start the Game");
                System.out.println();
                Player cp;
                cp = p1;
                while(true)
                {
                    System.out.println(cp.name + " Turn");
                    cp.makeMove();
                    TicTacToe.dispBoard();
                    if(TicTacToe.checkColWin() || TicTacToe.checkRowWin() || TicTacToe.checkDiagWin())
                    {
                        System.out.println("---" + cp.name + " Has Won the Game---");
                        loop = false;
                        break;
                    }
                    else if(TicTacToe.checkDraw())
                    {
                        System.out.println("---Game is a Draw---");
                        loop = false;
                        break;
                    }
                    else
                    {
                        if(cp == p1)
                            cp = p2;
                        else
                            cp = p1;
                    }
                }
            }
            else if(ch == 2)
            {
                String PN1,PN2;
                Scanner c2 = new Scanner(System.in);
                System.out.println();
                System.out.println("Enter the First Player Name Who Needs X");
                HumanPlayer P1 = new HumanPlayer(PN1 = c2.nextLine(),'X');
                System.out.println("Enter the Second Player Name Who Needs O");
                HumanPlayer P2 = new HumanPlayer(PN2 = c2.nextLine(),'O');
                System.out.println();
                System.out.println("----- " + PN1 + " Takes X -----");
                System.out.println("----- " + PN2 + " Takes O -----");
                System.out.println();
                System.out.println("Let's Start the Game");
                System.out.println();
                Player Cp;
                Cp = P1;
                while(true)
                {
                    System.out.println(Cp.name + " Turn");
                    Cp.makeMove();
                    TicTacToe.dispBoard();
                    if(TicTacToe.checkColWin() || TicTacToe.checkRowWin() || TicTacToe.checkDiagWin())
                    {
                        System.out.println("---" + Cp.name + " Has Won the Game---");
                        loop = false;
                        break;
                    }
                    else if(TicTacToe.checkDraw())
                    {
                        System.out.println("---Game is a Draw---");
                        loop = false;
                        break;
                    }
                    else
                    {
                        if(Cp == P1)
                            Cp = P2;
                        else
                            Cp = P1;
                    }
                }
            }
            else
                System.out.println("Invalid Input. Choose the Correct Choice");
        }
    }
}