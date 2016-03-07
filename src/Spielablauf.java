/**
 * Created by mai on 07.03.16.
 */
public class Spielablauf {

    public static void main(String[] args){

//        //String myShips = "....#...........";
//        //String enemiesShips = "#.#.#.#..###....";
//        String attackString = "????????????????";
//
//        Scanner initializeFieldPlayer1 = new Scanner(System.in);
//        String myShips1;
//        System.out.println("Gebe dein Feld ein, Player 1: ");
//        myShips1 = initializeFieldPlayer1.nextLine();
//
//        Scanner initializeFieldPlayer2 = new Scanner(System.in);
//        String myShips2;
//        System.out.println("Gebe dein Feld ein, Player 2: ");
//        myShips2 = initializeFieldPlayer1.nextLine();
//
//        BattleField myField = new BattleField(myShips1);
//        BattleField enemy = new BattleField(myShips2);
//        BattleField attackField = new BattleField(attackString);
//
//
//
//        int startPlayer = (int)Math.random()*10;
//
//
//        Scanner attackCoordinate = new Scanner(System.in);
//        String coordinate;
//        System.out.println("Gib die Angriffskoordinate ein: ");
//        coordinate = attackCoordinate.nextLine();
//
//
//
//        System.out.println(Arrays.deepToString(myField.convertToCharArray(myShips1)));
//        System.out.println(Arrays.deepToString(enemy.convertToCharArray(myShips2)));
//        System.out.println(Arrays.deepToString(attackField.convertToCharArray(attackString)));
//

        char [][] probe = new char [][] {{'#','#','#','#'},{'.','.','.','.'},{'#','#','#','#'},{'.','.','.','.'}};
        char [][] probeEnemy = new char [][] {{'?','?','?','?'},{'?','?','?','?'},{'?','?','?','?'},{'?','?','?','?'}};

        Player player1 = new Player(new BattleField("###...###"));
        Player player2 = new Player(new BattleField("...##...."));

        player1.attackEnemy(player2, 1, 2);
        player2.attackEnemy(player1, 2, 2);


     //   do {
       //     System.out.println("");



        //}while (!player1.isDefeated(player1Field)||!player2.isDefeated(player2Field));









   }


}
