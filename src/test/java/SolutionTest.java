import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void zero() {
        assertThat(new Solution().solution(0))
                .isZero();
    }

    @Test
    void one() {
        assertThat(new Solution().solution(1))
                .isZero();
    }
}