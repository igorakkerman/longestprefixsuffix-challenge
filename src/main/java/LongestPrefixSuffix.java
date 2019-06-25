public class LongestPrefixSuffix {
    public int lengthIn(String input) {
        int max = 0;
        for (int l = 1; l < input.length() - 1; l++) {
            boolean match = false;
            for (int offset = 0; offset < l; offset++) {
                int back = input.length() - (l - offset);
                match = input.charAt(offset) == input.charAt(back);
                if (!match)
                    break;
            }
            if (match)
                max = l;

        }
        return max;
    }
}