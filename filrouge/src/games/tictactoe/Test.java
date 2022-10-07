package games.tictactoe;
import gamestests.tictactoe.TicTacToeTests;

public class Test{
  public static void main(String[] args) {
    boolean ok=true;
    TicTacToeTests ticTacToeTester = new TicTacToeTests();
    ok=ok && ticTacToeTester.testGetCurrentPlayer();
    ok = ok && ticTacToeTester.testExecuteAndIsValid();
    ok = ok && ticTacToeTester.testValidMoves();
    System.out.println(ok ? " All tes ok" : "at least one ko");
  }
}
