package util;

import java.security.MessageDigest;

public class Util {

    public static String getHash(String input){

        StringBuilder result = new StringBuilder();

        try{
            MessageDigest md = MessageDigest.getInstance("SHA-256");//해시 알고리즘
            md.update(input.getBytes());
            byte[] bytes = md.digest(); //해싱 후 바이트배열 형태로 리턴

            for (byte aByte : bytes) { //문자열 변환
                result.append(Integer.toString((aByte & 0xff) + 0x100, 16).substring(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result.toString();
    }

}

