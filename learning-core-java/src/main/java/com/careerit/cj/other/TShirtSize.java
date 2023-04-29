package com.careerit.cj.other;

public enum TShirtSize {
    S(38),M(40),L(42),XL(44);

    private final int size;
    TShirtSize(int size){
        this.size = size;
    }
    public int getSize(){
        return size;
    }

}
