package nye.progtech.torpedo.model;

public class Board {
    private int sizeX;
    private int sizeY;
    Tile matrix[][];

    public Board(int sizeX, int sizeY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        fillBoard(sizeX,sizeY);
    }

    public int getSizeX() {
        return sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }
    public Tile getTile(int x, int y) {
        return matrix[x][y];
    }

    public Tile[][] fillBoard(int x, int y) {
        matrix = new Tile[sizeX][sizeY];
        for(int row =0; row < x; row++) {
            for(int col = 0; col < y; col++) {
                matrix[row][col] = new Tile(row,col, TileStatus.OCEAN);
            }
        }
        return matrix;
    }

    public void buildSip(Tile tile, Ship ship) {
        switch(ship.getShipClass().label) {
            case 1:
                tile.setTileStatus(TileStatus.SHIP);
                ship.add(tile);
                break;
            case 2:
                tile.setTileStatus(TileStatus.SHIP);
                ship.add(tile);
                int x = tile.getX();
                int y = tile.getY();
                ship.add(new Tile(x, y+1,TileStatus.SHIP));
                break;
            case 3:
                tile.setTileStatus(TileStatus.SHIP);
                ship.add(tile);
                x = tile.getX();
                y = tile.getY();
                ship.add(new Tile(x, y+1,TileStatus.SHIP));
                ship.add(new Tile(x, y+2,TileStatus.SHIP));
                break;
            case 4:
                tile.setTileStatus(TileStatus.SHIP);
                ship.add(tile);
                x = tile.getX();
                y = tile.getY();
                ship.add(new Tile(x, y+1,TileStatus.SHIP));
                ship.add(new Tile(x, y+2,TileStatus.SHIP));
                ship.add(new Tile(x, y+3,TileStatus.SHIP));
                break;
            case 5:
                tile.setTileStatus(TileStatus.SHIP);
                ship.add(tile);
                x = tile.getX();
                y = tile.getY();
                ship.add(new Tile(x, y+1,TileStatus.SHIP));
                ship.add(new Tile(x, y+2,TileStatus.SHIP));
                ship.add(new Tile(x, y+3,TileStatus.SHIP));
                ship.add(new Tile(x, y+4,TileStatus.SHIP));
                break;
        }

    }
}
