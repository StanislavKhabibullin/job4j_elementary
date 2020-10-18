package job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean temp = true;
        for (int i = 0; i < pref.length; i++) {
            if (pref[i] != word[i]) {
                temp = false;
                break;
            }
        }
        return temp;
    }
}
