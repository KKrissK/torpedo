package nye.progtech.torpedo.model;

public class Battleship {
    private Display display;
    private Game game = new Game();
    private Input input;

    public Battleship() {
        display = new Display();
    }
    public void start() {
        display.printMenu();
        mainMenu();
    }
    public void mainMenu() {
        int choice;
        boolean exit = false;
        input = new Input();

        while(!exit) {
            display.printMainOptions();
            System.out.println("Choose an option: ");
            System.out.println();
            choice = input.getIntegerMenuOption() ;
            switch(choice) {
                case 0:
                    display.printMessages("you choose to play the game ");
                    game.gameLogic();
                    break;
                case 1:
                    System.out.flush();
                    display.gameRules();
                    break;
                case 2:
                    System.out.println("you choose to exit");
                    exitGame();
                    break;
            }
        }
    }
    public void exitGame() {
        display.printExitMsg();
            System.exit(0);
    }
}
