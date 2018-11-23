package pattern.interpreter;

import java.util.StringTokenizer;

public class Context {

    private StringTokenizer tokenizer;
    private String currnetToken;

    public Context(String text) {
        tokenizer = new StringTokenizer(text);
        nextToken();
    }

    public String nextToken() {
        if (tokenizer.hasMoreTokens()) {
            currnetToken = tokenizer.nextToken();
        } else{
            currnetToken = null;
        }
        return currnetToken;
    }

    public String getCurrnetToken() {
        return currnetToken;
    }

    public void skipToken(String token) throws ParseException {
        if (!token.equals(currnetToken)) {
            throw new ParseException("Warning : " + token + " is expected. But " + currnetToken + " is found.");
        }
        nextToken();
    }

    public int currentNumber() throws ParseException {
        int number = 0;
        try {
            number = Integer.parseInt(currnetToken);
        } catch (NumberFormatException e) {
            throw new ParseException("Warning : " + e);
        }
        return number;
    }
}
