package util;

import java.security.MessageDigest;


//블록의 해쉬키를 구하는 유틸 클래스
public class Util {

    public static String getHash(String input){

        StringBuilder result = new StringBuilder();

        try{
            MessageDigest md = MessageDigest.getInstance("SHA-256");//해시 알고리즘
            md.update(input.getBytes());
            byte[] bytes = md.digest(); //해싱 후 바이트배열 형태로 리턴

            for (byte aByte : bytes) { //문자열 변환 : 256이랑 AND연산 후 16진수 (0x제거)
                result.append(Integer.toString((aByte & 0xff) + 0x100, 16).substring(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result.toString();
    }

}

