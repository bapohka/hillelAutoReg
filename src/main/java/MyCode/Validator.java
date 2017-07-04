package MyCode;

import java.util.regex.Pattern;

/**
 * Created by hillel on 30.06.17.
 */
public class Validator {
    private String patternNumbers = "^(?:Numbers: )?(?:(?:[2-9][0-9]{3}|10000)(?:\\.\\d\\d)?(?:,|$))+$";
    private String patternEmails = "^(?i)(?:(?:[^@]+@gmail\\.com)(?:,|$))+$";

public Validator(){

}
    public boolean numbers(String input) {
        return Pattern.matches(this.patternNumbers, input);
    }
    public boolean emails(String input)
    {
        return Pattern.matches(this.patternEmails, input);
    }
}
