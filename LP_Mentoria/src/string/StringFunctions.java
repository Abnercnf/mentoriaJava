package string;

public class StringFunctions {

    public static void main(String[] args) {
        String longStr = "lorem ipsum dolor sit amet";
        String shortStr = "abner narciso";
        String hashStr = "c204f1a64a862526676db939a60a422b2b56e79b0fb82ca8b5fed57e617b63b2";
        String txtStr = "Hey there! I am using Whatsapp since 2014";
        String upperStr = "CAPSLOCK ENABLED";
        String CPF = "149.999.057-87";

        System.out.println("## UPPCASE ##");
        System.out.println(longStr.toUpperCase());

        System.out.println("## lowercase ##");
        System.out.println(upperStr.toLowerCase());

        System.out.println("## CharAt ##");
        System.out.println(shortStr.charAt(0));

        System.out.println("## Substring ##");
        System.out.println(shortStr.substring(2));
        System.out.println("## Substring start-end ##");
        System.out.println(shortStr.substring(2, 5));

        System.out.println("## Replace ##");
        System.out.println(hashStr.replace("0", "ZERO"));

        System.out.println("## ReplaceAll ##");
        System.out.println(CPF.replaceAll("\\d", "*"));

        System.out.println("## Masking with ReplaceAll CPF ##");
        System.out.println(CPF.replaceAll(".\\d{5}$", "$1**"));

        System.out.println("## Masking with Substring ##");
        System.out.println(CPF.substring(0, CPF.length() - 2) + "**");

        System.out.println("## indexOf ##");
        System.out.println(txtStr.indexOf("e"));

        System.out.println("## lastIndexOf ##");
        System.out.println(txtStr.lastIndexOf("e"));

        System.out.println("## Split ##");
        String[] fullName = shortStr.split(" ");
        String firstName = fullName[0];
        String lastName = fullName[1];
        System.out.println(firstName);
        System.out.println(lastName);

    }
}
