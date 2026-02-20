//String Methods

public class StringCh {
    public static void main(String[] args) {
        String str = "programmer@gmail.com";

        int i = str.indexOf('@');
        //int j = str.indexOf(".s");
        String username = str.substring(0, i);
        String domain = str.substring(i+1);

        System.out.println("Username: " + username);
        System.out.println("Domain: " + domain);
    }
}

//Regular Expression



//Regular Expression 2
 //System.out.println("is the email a gmail account? " + str.matches(".*[gmail]*."));