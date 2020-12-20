package dataobjects;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateData {

    private GenerateData() {

    }

    public static String generateEmail(int length) {
        String allowedChars = "abcdefghijklmnopqrstuvwxyz" +   //alphabets
                "1234567890";   //numbers
        String email = "";
        String temp = RandomStringUtils.random(length, allowedChars);
        email = temp.substring(0, temp.length() - 9) + "@test.test";
        return email;
    }


}
