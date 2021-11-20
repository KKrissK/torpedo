package nye.progtech.torpedo.model;

import java.util.List;

public class Player {

    private List<Ship> ships;
    private Board board;
    private int  shipsLeft = 0;

    public Player(List<Ship> ships, Board board) {
        this.ships = ships;
        this.board = board;
    }

    public Board getBoard() {
        return board;
    }

    public int numberOfTilesOfShips(List<Ship> ships) {
        int sumOfTiles = 0;
        for(Ship ship : ships) {
            sumOfTiles += ship.getShipClass().label;
        }
        return sumOfTiles;
    }
    public boolean handleShot(int x, int y) {
        for(Ship ship : ships) {
            for(Tile tile : ship.getFields()) {
                if(tile.getY() == y && tile.getX() == x && tile.getTileStatus().equals(TileStatus.SHIP)) {
                    tile.setTileStatus(TileStatus.HIT);
                    board.getTile(x,y).setTileStatus(TileStatus.HIT);
                    return true;
                } else if(tile.getY() == y && tile.getX() == x && tile.getTileStatus().equals(TileStatus.HIT)) {
                    tile.setTileStatus(TileStatus.HIT);
                    board.getTile(x,y).setTileStatus(TileStatus.HIT);
                    System.out.println("Already hit that");
                    return false;
                }
            }
        }
        board.getTile(x,y).setTileStatus(TileStatus.MISS);
        System.out.println("Miss!");
        return false;
    }

}
