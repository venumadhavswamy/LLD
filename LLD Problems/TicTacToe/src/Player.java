import java.util.UUID;

public class Player {
    private final UUID uuid;
    private String name;
    private int gamesWon;
    private Coin coin;
    public Player(String name, Coin coin){
        this.coin = coin;
        this.name = name;
        this.gamesWon = 0;
        this.uuid = UUID.randomUUID();
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public int getGamesWon() {
        return gamesWon;
    }

    public Coin getCoin() {
        return coin;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGamesWon(int gamesWon) {
        this.gamesWon = gamesWon;
    }

    public void setCoin(Coin coin) {
        this.coin = coin;
    }
}
