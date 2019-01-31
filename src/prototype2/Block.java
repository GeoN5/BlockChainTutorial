package prototype2;

import util.Util;

public class Block {

    private int blockID;
    private String previousBlockHash;//이전해쉬
    private int nonce;
    private String data;

    public Block(int blockID, String previousBlockHash, int nonce, String data) {
        this.blockID = blockID;
        this.previousBlockHash = previousBlockHash;
        this.nonce = nonce;
        this.data = data;
    }

    public int getBlockID() {
        return blockID;
    }

    public void setBlockID(int blockID) {
        this.blockID = blockID;
    }

    public String getPreviousBlockHash() {
        return previousBlockHash;
    }

    public void setPreviousBlockHash(String previousBlockHash) {
        this.previousBlockHash = previousBlockHash;
    }

    public int getNonce() {
        return nonce;
    }

    public void setNonce(int nonce) {
        this.nonce = nonce;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void getInformation(){
        System.out.println("----------------------------------------");
        System.out.println("블록 번호: " + getBlockID());
        System.out.println("이전 해시: " + getPreviousBlockHash());
        System.out.println("채굴 변수 값: " + getNonce());
        System.out.println("블록 데이터: " + getData());
        System.out.println("블록 해시: " + getBlockHash());
        System.out.println("----------------------------------------");
    }
    //무결성을 위해 블록의 이전 해쉬값을 현재 블록의 해쉬키를 생성하는데 활용.
    public String getBlockHash(){
        return Util.getHash(nonce + data + previousBlockHash);
    }

    //채굴 원리
    public void mine(){
        while(true){
            if(getBlockHash().substring(0,4).equals("0000")){
                System.out.println(blockID + "번째 블록의 채굴에 성공했습니다.");
                break;
            }
            nonce++;
        }
    }

}
