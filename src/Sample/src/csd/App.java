package csd;

class App {
    public static void main(String[] args)
    {    
        StringUtilRemoveWhitespacesTest.run();
    }
}

class StringUtilRemoveWhitespacesTest {
    public static void run() 
    {
        System.out.println(StringUtil.removeWhitespaces("Bugün hava çok güzel.  ").equals("Bugünhavaçokgüzel."));
        System.out.println(StringUtil.removeWhitespaces("\t     ").isEmpty());
    }
}

class StringUtil {
    public static String removeWhitespaces(String s)
    {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);

            if (!Character.isWhitespace(c))
                sb.append(c);
        }

        return sb.toString();
    }
}


