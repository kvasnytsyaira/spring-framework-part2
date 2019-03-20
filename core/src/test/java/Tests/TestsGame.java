package Tests;

import com.service.NumberService;
import com.wire.GameResult;
import com.wire.NumberGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestsGame {

    @Test
    void TestGame_WhenGuessEqualsProgNum_ExpectedGameResultWinner() {
        NumberGenerator numberGenerator = new NumberGenerator();
        NumberService numberService = new NumberService(numberGenerator);

        numberGenerator.setBound(1);
        GameResult gameResult = numberService.game(0);
        System.out.println(gameResult.getResult());
        Assertions.assertEquals("Winner!", gameResult.getResult());
    }

    @Test
    void TestGame_WhenGuessEqualsProgNum_ExpectedGameResultLooser() {
        NumberGenerator numberGenerator = new NumberGenerator();
        NumberService numberService = new NumberService(numberGenerator);

        numberGenerator.setBound(1);
        GameResult gameResult = numberService.game(5);
        System.out.println(gameResult.getResult());
        Assertions.assertEquals("Looser!", gameResult.getResult());
    }

    @Test
    void TestNumberGenerator_GenerateRandomNumber_ExpectedIntegerGiven() {
        NumberGenerator numberGenerator = new NumberGenerator();
        numberGenerator.setBound(1);
        Assertions.assertEquals(0, numberGenerator.generateRandomNumber());
    }

}

