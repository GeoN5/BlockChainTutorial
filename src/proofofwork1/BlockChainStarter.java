package proofofwork1;

import util.Util;

public class BlockChainStarter {

    public static void main(String[] args) {
        //정답
        int nonce = 0;
        //채굴 개념
        while(true){
            if(Util.getHash(String.valueOf(nonce)).substring(0,6).equals("000000")){
                System.out.println("정답: " + nonce);
                System.out.println("해시 값: " + Util.getHash(String.valueOf(nonce)));
                break;
            }
            nonce++;
        }
    }
}
