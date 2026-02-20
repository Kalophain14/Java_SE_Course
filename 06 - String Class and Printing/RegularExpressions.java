/*

Regular expression == they give out true if it matches the characters etc else false

*Matching Symbols*
. >  any letter/symbol/character
[abc] > exactly given letters
[abc][vz] > either first or second set
[^abc] > expect abc
[a-z1-7] > a-z or 1-7
A | B > A or B
XZ > exactly XZ
 */


/* public class RegularExpressions {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(str.matches("cba"));
    }
}

/*

*Meta characters*
\d > Digits
\D > Not digits
\s > Space
\S > Not space
\w > Alphabets or digit
\W > Neither alphabet or digit

 */

public class RegularExpressions{
    public static void main(String[] args) {
        String str2 = " ";
        System.out.println(str2.matches("\\s"));
    }
}


