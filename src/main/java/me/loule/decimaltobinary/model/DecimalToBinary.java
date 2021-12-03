package me.loule.decimaltobinary.model;

import java.util.ArrayList;

public class DecimalToBinary {
    private int decimal;

    public DecimalToBinary(int decimal){
        this.decimal = decimal;
    }

    public int getDecimal() {
        return decimal;
    }

    public void setDecimal(int decimal) {
        this.decimal = decimal;
    }

    public String result() {
        ArrayList<String> binary = new ArrayList<>();

        String result = "";

        while (this.decimal > 0) {
            binary.add(String.valueOf(this.decimal % 2));
            this.decimal = this.decimal / 2;
        }

        for (int i = binary.size() - 1; i >= 0; i--) {
            result += binary.get(i);
        }

        return result;
    }
}
