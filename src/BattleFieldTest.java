import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

/**
 * Created by mai on 07.03.16.
 */
@RunWith(Theories.class)
public class BattleFieldTest {

    public static class Parameters {
        private final String input;
        private final char[][] expectedOutput;

        public Parameters(String input, char[][] expectedOutput) {
            this.input = input;
            this.expectedOutput = expectedOutput;
        }
    }

    @DataPoint
    public static Parameters test1 = new Parameters(
            "###...##.",
            new char[][] {{'#','#','#'},{'.','.','.'},{'#','#','.'}}
    );

    @DataPoint
    public static Parameters test2 = new Parameters(
            "###...##a",
            new char[][] {{'#','#','#'},{'.','.','.'},{'#','#','a'}}
    );

    @DataPoint
    public static Parameters test3 = new Parameters(
            "12345#####+++++oooooxxxxx",
            new char[][] {
                    {'1','2','3','4','5'},
                    {'#','#','#','#','#'},
                    {'+','+','+','+','+'},
                    {'o','o','o','o','o'},
                    {'x','x','x','x','x'}
            }
    );

    @DataPoint
    public static String invalidInput = "quatsch";

    @Test
    @Theory
    public void testConvertToCharArray(Parameters parameters) throws Exception {
        char [][] output = BattleField.convertToCharArray(parameters.input);

        Assert.assertArrayEquals(parameters.expectedOutput,output);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    @Theory
    public void testConvertToCharArray_fail(String input) throws Exception {
        BattleField.convertToCharArray(input);
    }




    @Test
    public void testAttack() throws Exception {
        BattleField battleField = new BattleField("###...###");
        battleField.attack(2,1);

        char [][] expectedGrid = new char[][] {{'?','?','?'},{'?','?','?'},{'?','X','?'}};

        Assert.assertArrayEquals(expectedGrid,battleField.getHitgrid());

    }
}
