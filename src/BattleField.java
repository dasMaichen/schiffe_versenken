import java.util.Arrays;

/**
 * Created by mai on 07.03.16.
 */
public class BattleField {

    private final char [][] shipGrid;
    private final char [][] hitGrid;


    public BattleField(String battlefield){
        shipGrid = convertToCharArray(battlefield);

        hitGrid = new char[shipGrid.length][shipGrid.length];

        for (char[] row : hitGrid) {
            Arrays.fill(row, '?');
        }
    }

    public static char [][] convertToCharArray(String rows){
        char[] array = rows.toCharArray();

       // System.out.println(array);
       // System.out.println(array.length);

        int arrayPosition = 0;
        int battlefielfSize = (int)Math.sqrt(array.length);

        char [][] battlefield = new char[battlefielfSize][battlefielfSize];

        for (int i = 0; i < battlefielfSize; i++) {
            for (int j = 0; j < array.length/battlefielfSize;j++){

                battlefield [i][j] = array[arrayPosition];
                arrayPosition = arrayPosition+1;
            }

        }

        return battlefield;
    }


    public void attack(int xPosition, int yPosition) {

        char field = shipGrid[xPosition][yPosition];

        switch (field) {
            case '#':
                System.out.println("Treffer!");
                hitGrid[xPosition][yPosition] = 'X';
                break;
            case '.':
                System.out.println("Oh ein Schuss ins Leere. Schade...");
                hitGrid[xPosition][yPosition] = 'O';
                break;
            default:
                System.out.println("ungültiger Zug");
        }

        System.out.println(Arrays.deepToString(hitGrid));
    }

    public char[][] getHitgrid() {
        return hitGrid;
    }
}
