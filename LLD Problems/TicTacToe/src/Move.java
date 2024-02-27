public class Move {
    private int x;
    private int y;
    private Player player;
    private Coin coin;
    Move(int x,int y,Player player,Coin coin){
        this.x = x;
        this.y = y;
        this.player = player;
        this.coin = coin;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Player getPlayer() {
        return player;
    }

    public Coin getCoin() {
        return coin;
    }
}
