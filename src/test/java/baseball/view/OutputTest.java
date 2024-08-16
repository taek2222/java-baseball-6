package baseball.view;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class OutputTest {

    @Test
    @DisplayName("사용자 출력 테스트")
    void outputTest() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream original = System.out;
        System.setOut(new PrintStream(outputStream));

        Output.printlnMessage("Test Message");

        assertEquals("Test Message", outputStream.toString().trim());

        System.setOut(original);
    }
}