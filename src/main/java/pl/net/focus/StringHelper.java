package pl.net.focus;

public class StringHelper {

        // AABCDEF --> BCDEF   DEFGH --> DEFGH
        public String truncateAInFirst2Positions(String str) {

            if (str == null) {
                return null;
            }
            if (str.length() <= 2)
                return str.replaceAll("A", "");

            String first2Chars = str.substring(0, 2);
            String stringMinusFirst2Chars = str.substring(2);

            return first2Chars.replaceAll("A", "")
                    + stringMinusFirst2Chars;
        }

        // true if ABcdefAB     false if ABcdefGH
        public boolean areFirstAndLastTwoCharactersTheSame(String str) {
            if (str == null) {
                return false;
            }
            if (str.length() <= 1)
                return false;
            if (str.length() == 2)
                return true;

            String first2Chars = str.substring(0, 2);

            String last2Chars = str.substring(str.length() - 2);

            return first2Chars.equals(last2Chars);
        }

        public boolean areStringTheSameBetweenDelimiter(String text) {
            String tokens[] = text.trim().split("/");
            String left = tokens[0];
            String right = tokens[1];
            boolean isLeftEqualsToRight = left.equals(right);
            return isLeftEqualsToRight;
        }
}

