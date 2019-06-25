import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LongestPrefixSuffixTest {

    @Test
    void empty() {
        assertThat(new LongestPrefixSuffix().lengthIn(""))
                .isEqualTo(0);
    }
    @Test
    void a() {
        assertThat(new LongestPrefixSuffix().lengthIn("A"))
                .isEqualTo(0);
    }

    @Test
    void aba() {
        assertThat(new LongestPrefixSuffix().lengthIn("ABA"))
                .isEqualTo(1);
    }

    @Test
    void bba() {
        assertThat(new LongestPrefixSuffix().lengthIn("BBA"))
                .isEqualTo(0);
    }

    @Test
    void abba() {
        assertThat(new LongestPrefixSuffix().lengthIn("ABBA"))
                .isEqualTo(1);
    }

    @Test
    void ababa() {
        assertThat(new LongestPrefixSuffix().lengthIn("ABABA"))
                .isEqualTo(3);
    }

    @Test
    void abaaba() {
        assertThat(new LongestPrefixSuffix().lengthIn("ABAABA"))
                .isEqualTo(3);
    }

    @Test
    void ababba() {
        assertThat(new LongestPrefixSuffix().lengthIn("ABABBA"))
                .isEqualTo(1);
    }

    @Test
    void abababa() {
        assertThat(new LongestPrefixSuffix().lengthIn("ABABABA"))
                .isEqualTo(5);
    }

    @Test
    void abbabba() {
        assertThat(new LongestPrefixSuffix().lengthIn("ABBABBA"))
                .isEqualTo(4);
    }
}