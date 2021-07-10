import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class offer20_isNumber {
    public boolean isNumber(String s) {
        String[] str = {"(\\s)*(-)?([0-9]*\\.){0,1}[0-9]+(\\s)*|(\\s)*(\\+)?([0-9]*\\.){0,1}[0-9]+(\\s)*"
                ,"(\\s)*(-)?[0-9]+(\\.[0-9]*){0,1}(\\s)*|(\\s)*(\\+)?[0-9]+(\\.[0-9]*){0,1}(\\s)*"
                ,"(\\s)*((-)?([0-9]*\\.){0,1}[0-9]+(\\s)*|(\\s)*(\\+)?([0-9]*\\.){0,1}[0-9]+)" +
                "[eE]" +
                "(((-)?([0-9]*\\.){0,1}[0-9]+(\\s)*|(\\s)*(\\+)?([0-9]*\\.){0,1}[0-9]+)(\\s)*)*"};
        for (String string : str) {
            Pattern pattern = Pattern.compile(string);
            Matcher matcher = pattern.matcher(s);
            if (matcher.matches()) return true;
        }
        return false;
    }
}
