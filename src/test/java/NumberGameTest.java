import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class NumberGameTest {
    @ParameterizedTest(name = "should_return_{0}_when_given_{1}")
    @CsvSource({
        "1, 1",
        "fizz, 3",
        "buzz, 5",
        "fizzbuzz, 15",
    })
    void test(String result, int i){
        Assertions.assertThat(result).isEqualTo(NumberGame.of(i));
    }
}
