package com.arman;

//How do you remove all occurrences of a given character from an input string in Java?
public class RemoveOccurrence {
    public static void main(String[] args) {

        String s1 = "Banana";
        char occurrence = 'a';
        String sum = "";

//        Approach 1 : using for loop
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (ch != occurrence) {
                sum = sum + ch;
            }

        }
        System.out.println("Remove all occurrence : " + sum);

//        Approach 2 : Using for Method

         String s2=s1.replaceAll("a","").toString();
        System.out.println("Remove the all occurrence : "+s2);

    }
}

