package baseball.view;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.*;

class OutputTest {

    @Test
    @DisplayName("사용자 출력 테스트")
    void outputTest() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream original = System.out;
        System.setOut(new PrintStream(outputStream));

        Output.printlnMessage("Test Message");
        assertThat("Test Message\n").isEqualTo(outputStream.toString());

        outputStream.reset();

        Output.printMessage("Test Message");
        assertThat("Test Message").isEqualTo(outputStream.toString());

        System.setOut(original);
    }
}