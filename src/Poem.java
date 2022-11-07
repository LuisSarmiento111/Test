public class Poem
{
    private String name;

    public Poem(String yourName)
    {
        name = yourName;
    }

    public boolean sameStarChar(String str) {
        int len = str.length();
        boolean same = true;
        char letter = ' ';
        for (int i = 1; i < str.length() - 1; i++) {
            letter = str.charAt(i);
            if (letter == '*') {
                if (str.charAt(i-1) != str.charAt(i+1)) {
                    same = false;
                }
                else {
                    same = true;
                }
            }
        }
        return same;
    }

    public String lastTwo(String str) {
        int len = str.length();
        if (len > 1) {
            String secondLast = str.substring(len - 2, len -1);
            String last = str.substring(len - 1);
            str = str.substring(0, len - 2) + last + secondLast;
        }
        return str;

    }

}
