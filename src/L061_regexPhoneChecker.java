import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class L061_regexPhoneChecker {

    public static void main(String[] args) {

        System.out.print(phoneChecker("sd0 +3(80)  532-26_447:12 ss"));
    }


    public static boolean phoneChecker(String inString) {

        String strPattern = "(\\s*)?(\\+)?([- _():=+]?\\d[- _():=+]?){10,14}(\\s*)?";

        Pattern p = Pattern.compile(strPattern);
        Matcher m = p.matcher(inString);

        if (m.find()) {
            return true;
        } else {
            return false;
        }

    }

}
