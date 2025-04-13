package medium;

public class Daily649 {

    public static final String RADIANT = "Radiant";
    public static final String DIRE = "Dire";

    public String predictPartyVictory(String senate) {
        var s = senate.toCharArray();

        var radiant = 0;
        var dire = 0;


        for (char c : s) {
            if (c == 'R') radiant++;
            else dire++;
        }

        while (!(radiant == 0 || dire == 0)) {
            for (int pos = 0; pos < senate.length() && radiant != 0 && dire != 0; pos++) {
                if (s[pos] == 'R') {
                    --dire;
                    remove(s, pos, 'D');
                } else if (s[pos] == 'D') {
                    --radiant;
                    remove(s, pos, 'R');
                }
            }
        }

        return radiant == 0 ? DIRE : RADIANT;
    }

    private void remove(char[] s, int pos, char r) {
        for (int i = pos + 1; i <= s.length; i++) {
            if (i == s.length) i = 0;
            if (s[i] == r) {
                s[i] = ' ';
                return;
            }
        }
    }
}
