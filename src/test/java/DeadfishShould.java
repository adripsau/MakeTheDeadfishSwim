import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DeadfishShould {
    @Test
    public void only_output_a_zero() {
        assertThat(Deadfish.parse("o")).isEqualTo(new int[] {0});
    }

    @Test
    public void increment_and_output_a_one() {
        assertThat(Deadfish.parse("io")).isEqualTo(new int[] {1});
    }

    @Test
    public void decrement_and_output_a_minus_one() {
        assertThat(Deadfish.parse("do")).isEqualTo(new int[] {-1});
    }

    @Test
    public void decrement_increment_and_output_a_zero() {
        assertThat(Deadfish.parse("dio")).isEqualTo(new int[] {0});
    }

    @Test
    public void increment_decrement_and_output_a_zero() {
        assertThat(Deadfish.parse("ido")).isEqualTo(new int[] {0});
    }

    @Test
    public void double_increment_squares_decrement_and_output_a_three() {
        assertThat(Deadfish.parse("iisdo")).isEqualTo(new int[] {3});
    }

    @Test
    public void output_two_numbers() {
        assertThat(Deadfish.parse("iisdoiiido")).isEqualTo(new int[] {3, 5});
    }

}
