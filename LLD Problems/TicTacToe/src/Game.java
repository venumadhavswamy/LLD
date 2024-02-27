import java.util.*;

public class Game {
    private List<Player> players;
    private Board board;
    private Stack<Move> movesHistory;
    private Deque<Player> playerTurns;
    private Player winner;

    private List<HashMap<Character,Integer>> columnCount, rowCount;
    HashMap<Character,Integer> mainDiagonalCount, antiDiagonalCount;

    public Game(Board board){
        this.board = board;

        columnCount = new ArrayList<>();
        rowCount = new ArrayList<>();
        mainDiagonalCount = new HashMap<>();
        antiDiagonalCount = new HashMap<>();
        for(int i=0;i<board.getSize();i++){
            columnCount.add(new HashMap<>());
            rowCount.add(new HashMap<>());
        }
    }

    public void startGame(){
        while(true){
            Player currentPlayer = playerTurns.pollFirst();
            playerTurns.offerLast(currentPlayer);
            play(currentPlayer);
            if(isDraw()){
                System.out.println("Game Draw!!!!!!!!");
            }
            if(hasWon(currentPlayer)){
                setWinner(currentPlayer);
                System.out.println("Hey "+currentPlayer.getName()+" won the game!!!");
                break;
            }
        }
    }

    public void play(Player player){
        Move move = moveTheCoin(player);
        movesHistory.add(move);
        setCount(move.getX(),move.getY(),player.getCoin());
    }
    public Move moveTheCoin(Player p){
        Scanner in = new Scanner(System.in);
        System.out.println(p.getName()+"'s Turn");
        System.out.print("Enter x position:");
        int x = in.nextInt();
        System.out.print("Enter y position:");
        int y = in.nextInt();
        Move move = new Move(x,y,p,p.getCoin());

        board.setMove(move,x,y);
        return move;
    }
    public void setCount(int x,int y,Coin c){
        Character symbol = c.getSymbol();
        rowCount.get(x).put(symbol,rowCount.get(x).getOrDefault(symbol,0)+1);
        columnCount.get(y).put(symbol,columnCount.get(y).getOrDefault(symbol,0)+1);
        if(x == y){
            mainDiagonalCount.put(symbol,mainDiagonalCount.getOrDefault(symbol,0)+1);
        }
        if(x+y == board.getSize()-1){
            antiDiagonalCount.put(symbol,antiDiagonalCount.getOrDefault(symbol,0)+1);
        }
    }
    public boolean hasWon(Player p){
        return true;
    }

    public boolean isDraw(){
        return movesHistory.size() == board.getSize()*board.getSize();
    }
    private void setWinner(Player p){
        this.winner = p;
    }
    public void undo(){

    }
}
