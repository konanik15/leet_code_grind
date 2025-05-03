package medium;

public class Daily1007 {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        var top = tops[0];
        var bot = bottoms[0];

        var topAttempt = 0;
        var topAttempt2 = 0;
        var botAttempt = 0;
        var botAttempt2 = 0;

        for (int i = 1; i < tops.length; i++) {
            if (tops[i] == top) continue;
            if (bottoms[i] == top) topAttempt++;
            else if (!(tops[i] == top)) {
                topAttempt = -1;
                break;
            }
        }

        top = bottoms[0];

        for (int i = 0; i < tops.length; i++) {
            if (tops[i] == top) continue;
            if (bottoms[i] == top) topAttempt2++;
            else if (!(tops[i] == top)) {
                topAttempt2 = -1;
                break;
            }
        }

        if (topAttempt != -1 && topAttempt2 != -1) topAttempt = Math.min(topAttempt, topAttempt2);
        else topAttempt = Math.max(topAttempt, topAttempt2);

        for (int i = 1; i < tops.length; i++) {
            if (bottoms[i] == bot) continue;
            if (tops[i] == bot) botAttempt++;
            else if (!(bottoms[i] == bot)) {
                botAttempt = -1;
                break;
            }
        }

        bot = tops[0];

        for (int i = 0; i < tops.length; i++) {
            if (bottoms[i] == bot) continue;
            if (tops[i] == bot) botAttempt2++;
            else if (!(bottoms[i] == bot)) {
                botAttempt2 = -1;
                break;
            }
        }

        if (botAttempt != -1 && botAttempt2 != -1) botAttempt = Math.min(botAttempt, botAttempt2);
        else botAttempt = Math.max(botAttempt, botAttempt2);


        if (topAttempt != -1 && botAttempt != -1) return Math.min(topAttempt, botAttempt);

        return topAttempt != -1 ? topAttempt : botAttempt;
    }
}
