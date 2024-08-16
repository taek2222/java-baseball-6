package baseball.view;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.*;

class InputTest {

    @Test
    @DisplayName("사용자 입력 테스트")
    void readInput() {
        String input = "Test message";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Scanner scanner = new Scanner(System.in);

        assertThat(input).isEqualTo(scanner.nextLine());
    }
}