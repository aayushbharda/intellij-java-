/*this program help to see a certain word is present in the provided paragraph or not*/

package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write a word to search");
        String s = sc.nextLine();
        System.out.println("paste the paragraph to search the word");
        String t =sc.nextLine();
        Pattern pattern = Pattern.compile(s, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(t);
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }

    }
}

