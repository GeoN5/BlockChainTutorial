package proofofwork1;

import util.Util;

public class BlockChainStarter {

    public static void main(String[] args) {
        //정답
        int nonce = 0;
        //채굴 개념 주사위 원리
        //주사위 두 개를 던져서 나올 값의 합이 특정 목표값 보다 낮은 숫자가 나올 확률을 생각해보자.
        // 만약 목표값이 12이면 (6, 6) 을 던지지 않는 이상 성공한다. 거의 100%에 가깝다.
        // 하지만 목표값이 11, 10, 9… 점점 떨어지면 확률 또한 기하급수적으로 떨어진다.
        // 만약 목표값이 2라면 주사위를 던져 (1, 1)이 나와야 하므로 확률은 1/36, 약 2%이다.
        // 이런식으로, hashing 과정에서 0의 개수가 늘어난다는 것은, 목표값에 만족할 수 있는 확률 또한 기하급수적으로 낮아진다는 것이다.
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
