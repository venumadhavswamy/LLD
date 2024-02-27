public class Board {
    private int size;
    Move[][] cells;
    public Board(int size){
        this.size = size;
        cells = new Move[size][size];
    }

    public int getSize() {
        return size;
    }
    public void setMove(Move move,int x,int y){
        cells[x][y] = move;
    }
}
