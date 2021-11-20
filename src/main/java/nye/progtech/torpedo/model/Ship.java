package nye.progtech.torpedo.model;

import java.util.List;

public class Ship {

    private List<Tile> NewShip;
    private ShipClass shipClass;

    public Ship(List<Tile> newShip, ShipClass shipClass) {
        NewShip = newShip;
        this.shipClass = shipClass;
    }

    public List<Tile> getFields() {
        return NewShip;
    }

    public ShipClass getShipClass() {
        return shipClass;
    }

    public void add(Tile tile) {
        NewShip.add(tile);
    }

    public boolean isPlacementOk(Ship ship1, List<Ship> ships, Board board) {
        int count = 0;
        for(int i =0; i< ship1.getFields().size(); i++) {
            if(ship1.getFields().get(i).getY() > board.getSizeY() ||
               ship1.getFields().get(i).getX() > board.getSizeX()) {
                count++;

            }
            for(int k= 0; k < ships.size(); k++) {
                for(int z=0; z< ships.get(k).getFields().size(); z++){
                    if(ship1.getFields().get(i).getX()==ships.get(k).getFields().get(z).getX() &&
                            ship1.getFields().get(i).getY()==ships.get(k).getFields().get(z).getY()) {
                        count++;
                    }
                }
            }
        }
        if(count== 0) {
            return true;
        }
        return false;
    }
}
