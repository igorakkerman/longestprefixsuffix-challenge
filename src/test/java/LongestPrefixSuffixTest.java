import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static java.util.Collections.nCopies;
import static org.assertj.core.api.Assertions.assertThat;

class LongestPrefixSuffixTest {

    // constants extracted to measure algorithm without fixture initialization
    private static final int TEN_M = 10000000;

    private static final String TEN_M_OF_A = String.join("", nCopies(TEN_M, "A"));

    private static final String AB_PLUS_TEN_M_OF_A_PLUS_B = "AB" + String.join("", TEN_M_OF_A) + "B";

    private LongestPrefixSuffix longestPrefixSuffix;

    @BeforeEach
    void init() {
        longestPrefixSuffix = new LongestPrefixSuffix();
    }

    @AfterEach
    void printCompareCount() {
        System.out.println("Comparisons: " + longestPrefixSuffix.getCompareCounter());
    }

    @Test
    void a() {
        assertThat(longestPrefixSuffix.lengthIn("A"))
            .isEqualTo(0);
    }

    @Test
    void aba() {
        assertThat(longestPrefixSuffix.lengthIn("ABA"))
            .isEqualTo(1);
    }

    @Test
    void bba() {
        assertThat(longestPrefixSuffix.lengthIn("BBA"))
            .isEqualTo(0);
    }

    @Test
    void abba() {
        assertThat(longestPrefixSuffix.lengthIn("ABBA"))
            .isEqualTo(1);
    }

    @Test
    void ababa() {
        assertThat(longestPrefixSuffix.lengthIn("ABABA"))
            .isEqualTo(3);
    }

    @Test
    void abaaba() {
        assertThat(longestPrefixSuffix.lengthIn("ABAABA"))
            .isEqualTo(3);
    }

    @Test
    void abaabb() {
        assertThat(longestPrefixSuffix.lengthIn("ABAABB"))
            .isEqualTo(0);
    }

    @Test
    void ababba() {
        assertThat(longestPrefixSuffix.lengthIn("ABABBA"))
            .isEqualTo(1);
    }

    @Test
    void abababa() {
        assertThat(longestPrefixSuffix.lengthIn("ABABABA"))
            .isEqualTo(5);
    }

    @Test
    void abbabba() {
        assertThat(longestPrefixSuffix.lengthIn("ABBABBA"))
            .isEqualTo(4);
    }

    @Test
    void aabaaa() {
        assertThat(longestPrefixSuffix.lengthIn("AABAAA"))
            .isEqualTo(2);
    }

    @Test
    void aaaabaaaa() {
        assertThat(longestPrefixSuffix.lengthIn("AAAABAAAA"))
            .isEqualTo(4);
    }

    @Test
    void aabaac() {
        assertThat(longestPrefixSuffix.lengthIn("AABAAC"))
            .isEqualTo(0);
    }

    @Test
    void abcdeabcdeabcde() {
        assertThat(longestPrefixSuffix.lengthIn("ABCDEABCDEABCDE"))
            .isEqualTo(10);
    }

    @Test
    void abcdeabcdeabcdee() {
        assertThat(longestPrefixSuffix.lengthIn("ABCDEABCDEABCDEE"))
            .isEqualTo(0);
    }

    @Test
    void a10_7() {
        assertThat(longestPrefixSuffix.lengthIn(TEN_M_OF_A))
            .isEqualTo(TEN_M - 1);
    }

    @Test
    void ab10_7ab() {
        assertThat(longestPrefixSuffix.lengthIn(AB_PLUS_TEN_M_OF_A_PLUS_B))
            .isEqualTo(2);
    }
}