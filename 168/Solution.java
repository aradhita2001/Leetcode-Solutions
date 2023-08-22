class Solution {
    public String convertToTitle(int columnNumber) {

        if (columnNumber < 0)
            return "";
        if (columnNumber == 0)
            return "Z";
        if (columnNumber < 27) {
            return Character.toString('A' - 1 + columnNumber);
        }

        return convertToTitle((columnNumber - 1) / 26) + convertToTitle(columnNumber % 26);
    }
}
