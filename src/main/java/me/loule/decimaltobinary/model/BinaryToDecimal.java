package me.loule.decimaltobinary.model;

public class BinaryToDecimal {
    private int binary;

    public BinaryToDecimal(int binary) {
        this.binary = binary;
    }

    public int getBinary() {
        return binary;
    }

    public void setBinary(int binary) {
        this.binary = binary;
    }

    public String result() {
        int result = 0;

        for (int i = 0; this.binary != 0; i++) {
            result += (this.binary % 10) * Math.pow(2, i);
            this.binary = this.binary / 10;
        }

        return String.valueOf(result);
    }
}