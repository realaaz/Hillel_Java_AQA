import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class L080_mailChecker {

    public static void main(String[] args) {

        String emailsContent = "qqq@gmail.com; www@yandex.ru; " + "eee@yahoo.com; r@gmail.com";
        String domainsContent = "gmail.com; yandex.ru";

        System.out.println(mailChecker(emailsContent, domainsContent));

    }


    public static int mailChecker(String emailsContent, String domainsContent) {

        int checkedEmailsCounter = 0;

        // Domains processing
        // TODO: Convert arrDomains from array to hashSet for performance purposes
        String[] arrDomains = domainsContent.replaceAll("[\\s]", "").split(";");

        for (int i = 0; i < arrDomains.length; i++) {

            String domainsRegex = "(?:.+)" + "@" + arrDomains[i];
            //System.out.println(domainsRegex);

            // Emails+domains processing
            Pattern p = Pattern.compile(domainsRegex);

            Set<String> hashAddress = new HashSet<>(Arrays.asList(emailsContent.replaceAll("[\\s]", "").split(";")));

            for (String checkedEmails : hashAddress) {
                Matcher m = p.matcher(checkedEmails);
                //System.out.println(checkedEmails + " : " + m.matches());

                if (m.matches()) {
                    checkedEmailsCounter = checkedEmailsCounter + 1;
                    //System.out.println(checkedEmailsCounter);
                }
            }

        }
        return checkedEmailsCounter;
    }



}
