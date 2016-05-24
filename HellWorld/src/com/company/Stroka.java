import java.util.*;
import java.lang.*;

class Main
{
    public static String[] divide(String s) {
        ArrayList<String> tmp = new ArrayList<String>();
        int i = 0;
        boolean f = false;

        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) == ' ') {
                if (j > i) {
                    tmp.add(s.substring(i, j));
                }
                i = j + 1;
            }
        }
        if (i < s.length()) {
            tmp.add(s.substring(i));
        }
        return tmp.toArray(new String[tmp.size()]);
    }
    public static void main (String[] args)
    {
        String s = "   1  aaa  2 bbbbbb 3    cccc  4 5 6     7     x";
        String[] r = divide(s);
        for (int i = 0; i < r.length; i++)
            System.out.println('"' + r[i] + '"');
    }
}