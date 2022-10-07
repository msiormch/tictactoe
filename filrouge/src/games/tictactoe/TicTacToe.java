package games.tictactoe;
import java.util.ArrayList;
public class TicTacToe{
  private String j1;
  private String j2;
  private String currentPlayer;
  private String[][] coups;

  public TicTacToe(String j1,String j2){
    this.j1=j1;
    this.j2=j2;
    this.currentPlayer=j1;
    this.coups=new String[3][3];

  }

  public void execute(int choix){
    int row=getRow(choix);
    int column=getColumn(choix);
    this.coups[row][column]=currentPlayer==j1 ?"j1":"j2";
    if(currentPlayer==j1){
      currentPlayer=j2;
    }else{
      currentPlayer=j1;
    }

  }
  public boolean isValid(int choix){
    int row =getRow(choix);
    int column =getColumn(choix);
    return this.coups[row][column]==null?true:false;
  }
  private int getColumn(int choix){
    if(choix<3)return 0;
    if(choix<6)return 1;
    return 2;
  }
  private int getRow(int choix){
    if(choix%3==0)return 0;
    if(choix%3==1)return 1;
    return 2;

  }
  public ArrayList<Integer> validMoves(){
    ArrayList<Integer> coupsValides=new ArrayList<Integer>();
    for (int i=0;i<3 ;i++ ) {
      for (int j=0;j<3 ;j++ ) {
        int coup=reciproque(i,j);
        if(isValid(coup)){
          coupsValides.add(coup);
        }
      }
    }
    return coupsValides;
  }
  private int reciproque(int i,int j){
    if(i==0)return j;
    if(i==1)return 3+j;
    return 6+j;
  }








  //accesseur
 public String getCurrentPlayer(){
   return currentPlayer;
 }

}
