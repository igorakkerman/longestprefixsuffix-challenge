public class LongestPrefixSuffix {

    // Longest Prefix/Suffix (LPS) based on Knuth-Morris-Pratt algorithm (KMP)
    // https://en.wikipedia.org/wiki/Knuth-Morris-Pratt_algorithm

    public int lengthIn(String input) {

        int length = input.length();

        if (length == 0)
            return 0;

        int[] lps = new int[length];

        int high = 1;
        int low = 0;

        while (high < length) {
            if (areEqual(input, high, low)) {
                lps[high] = low + 1;
                low++;
                high++;
            }
            else if (low != 0)
                low = lps[low - 1];
            else {
                lps[high] = 0;
                high++;
            }
        }
        return lps[length - 1];
    }


    private int compareCounter = 0;

    public int getCompareCounter() {
        return compareCounter;
    }

    private boolean areEqual(String input, int high, int low) {
        compareCounter ++;
        return input.charAt(high) == input.charAt(low);
    }
}

