package nye.progtech.torpedo.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in);
    private List<Board> boards = new ArrayList<>();
    int choice;
    List<Integer> CoordinatesAndShipClass = new ArrayList<>();

    public List<Board> getBoards() {
        generateBoard();
        return boards;
    }

    public void generateBoard() {
        System.out.println("select height: ");
        int x = scanner.nextInt();
        scanner.nextLine();
        System.out.println("select width: ");
        int y = scanner.nextInt();
        Board board1 = new Board(x,y);
        Board board2 = new Board(x,y);
        boards.add(board1);
        boards.add(board2);

    }
    public Input() {


    }

    public int getIntegerMenuOption() {
        choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }

    private List<Integer> AskCoordinatesForShipAndClass() {
        this.CoordinatesAndShipClass = new ArrayList<>();
        System.out.println("select row : ");
        int row = scanner.nextInt();
        scanner.nextLine();
        System.out.println("select col : ");
        int col = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Select ship: \n" + "1. PATROLBOAT \n" + "2. SUBMARINE \n" + "3. DESTROYER \n"
                + "4. BATTLESHIP \n" + "5. CARRIER ");
        int shipClass = scanner.nextInt();
        CoordinatesAndShipClass.add(row);
        CoordinatesAndShipClass.add(col);
        CoordinatesAndShipClass.add(shipClass);
        return CoordinatesAndShipClass;
    }
    public Ship createShip(int player) {
        int GamePlayer = player +1;
        Tile shipPart;
        Ship ship;
        System.out.println("Player " + GamePlayer + " place ship");
        CoordinatesAndShipClass = AskCoordinatesForShipAndClass();
        int row = CoordinatesAndShipClass.get(0);
        int col = CoordinatesAndShipClass.get(1);
        int shipClass = CoordinatesAndShipClass.get(2);
        shipPart = new Tile(row,col,TileStatus.SHIP);
        ship = new Ship(new ArrayList<>(),ShipClass.values()[shipClass-1]);
        boards.get(player).buildSip(shipPart,ship);
        return ship;
    }

    public int[] shoot(int player) {
        int GamePlayer = player +1;
        System.out.println("Player " + GamePlayer + " shoot");
        System.out.println("select row: ");
        int row = scanner.nextInt();
        System.out.println("select col: ");
        int col = scanner.nextInt();
        return new int[]{row,col};

    }
}
