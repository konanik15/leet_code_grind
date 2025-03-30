package medium;

public class Daily2390 {
    public String removeStars(String s) {
        var chars = s.toCharArray();
        int currStars = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (chars[i] == '*') {
                chars[i] = '0';
                currStars++;
            } else if (currStars != 0) {
                chars[i] = '0';
                currStars--;
            }
        }
        return String.valueOf(chars).replace("0", "");
    }
}
