import java.util.Arrays;

/**
 * Created by mai on 07.03.16.
 */
public class Player {


    private final BattleField battleField;

    public BattleField getBattleField() {
        return battleField;
    }

    public Player(BattleField battleField){
        this.battleField = battleField;

    }



    public void attackEnemy(Player enemy, int xPosition, int yPosition) {

        enemy.getBattleField().attack(xPosition, yPosition);

    }


    public void defend(){

    }


    public boolean isDefeated(char[][] battleField){

        int shipsCount = 0;

        for (int i = 0; i < battleField.length; i++) {
            for (int j = 0; j < battleField.length; j++) {
                if(battleField[i][j] == '#'){
                    shipsCount = shipsCount+1;
                }

            }
        }

        if(shipsCount>0){
            System.out.println("noch Schiffe vorhanden");
            return false;
        }

        System.out.println("Keine Schiffe mehr.");
        System.out.println(Arrays.deepToString(battleField));
        return true;

    }

}
