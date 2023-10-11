package UnitTestHW1.Calculator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CalculatorTest {
    public static void main(String[] args) {
            // Проверка, что метод выбрасывает исключение при недопустимых аргументах
            assertThatThrownBy(() -> Calculator.calculatingDiscount(-1, 50))
                    .isInstanceOf(ArithmeticException.class)
                    .hasMessage("Ошибочная сумма покупки");
            assertThatThrownBy(() -> Calculator.calculatingDiscount(100, -1))
                    .isInstanceOf(IllegalArgumentException.class)
                    .hasMessage("Не верная скидка");
            assertThatThrownBy(() -> Calculator.calculatingDiscount(100, 101))
                    .isInstanceOf(IllegalArgumentException.class)
                    .hasMessage("Не верная скидка");
            // Проверка, что метод возвращает правильную сумму покупки со скидкой
            assertThat(Calculator.calculatingDiscount(1000, 10)).isEqualTo(900.0);
            assertThat(Calculator.calculatingDiscount(2000, 20)).isEqualTo(1600.0);
            assertThat(Calculator.calculatingDiscount(3000, 50)).isEqualTo(1500.0);

    }
}