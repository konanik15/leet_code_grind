package easy;

import data_structures.enums.RomanCharacters;

public class Daily13 {
    public int romanToInt(String s) {
        var result = 0;
        var next = RomanCharacters.valueOf(String.valueOf(s.charAt(0))).value;
        for (int i = 0; i < s.length() - 1; i++) {
            var curr = next;
            var nextChar = s.charAt(i + 1);
            next = RomanCharacters.valueOf(String.valueOf(nextChar)).value;
            if (curr < next) result -= curr;
            else result += curr;
        }

        return result + next;
    }
}

//
// public enum RomanCharacters {
//     I( 1),
//     V(5),
//     X(10),
//     L(50),
//     C(100),
//     D(500),
//     M(1000);
//
//     public final int value;
//
//     RomanCharacters(int value) {
//         this.value = value;
//     }
// }