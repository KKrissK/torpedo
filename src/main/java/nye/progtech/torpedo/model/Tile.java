package nye.progtech.torpedo.model;

public class Tile {
    private int x;
    private int y;
    private TileStatus tileStatus;

    public Tile(int x, int y, TileStatus tileStatus) {
        this.x = x;
        this.y = y;
        this.tileStatus = tileStatus;
    }
    public void setTileStatus(TileStatus tileStatus) {
        this.tileStatus = tileStatus;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public TileStatus getTileStatus() {
        return tileStatus;
    }
    public char getCharacter() {
        char result = ' ' ;
        switch(tileStatus){
            case EMPTY:
                result = 'E';
            case HIT:
                result = 'H';
            case SHIP:
                result = 'S';
            case OCEAN:
                result = 'O';
            case MISS:
                result = 'M';
        }
        return result;
    }
}
