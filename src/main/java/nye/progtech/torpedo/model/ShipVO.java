package nye.progtech.torpedo.model;

import java.util.List;

public class ShipVO {

    private List<Tile> NewShip;
    private ShipClass shipClass;

    public ShipVO(List<Tile> newShip, ShipClass shipClass) {
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

    public boolean isPlacementOk(ShipVO ship1, List<ShipVO> ships,Board board) {
        int count = 0;
        for(int i =0; i< ship1.getFields().size(); i++) {
            if(ship1.getFields().get(i).getY() > board.getSizeY() ||
               ship1.getFields().get(i).getX() > board.getSizeX()) {
                count++ ;

            }
            for(int k= 0; k < ships.size(); k++) {
                for(int z=0)
            }
        }
    }
}
