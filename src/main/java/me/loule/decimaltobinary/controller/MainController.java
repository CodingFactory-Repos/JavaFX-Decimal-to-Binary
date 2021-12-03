package me.loule.decimaltobinary.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import me.loule.decimaltobinary.model.BinaryToDecimal;
import me.loule.decimaltobinary.model.DecimalToBinary;

import java.net.URL;
import java.util.ArrayList;
import java.util.Objects;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML
    private TextField textFieldDecimal;

    @FXML
    private TextField textFieldBinary;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("MainController initialized");

        textFieldDecimal.setOnKeyReleased(event -> {
            if (!Objects.equals(textFieldDecimal.getText(), "") && textFieldDecimal.getText().length() <= 3) {
                DecimalToBinary decimalToBinary = new DecimalToBinary(Integer.parseInt(textFieldDecimal.getText()));

                textFieldBinary.setText(decimalToBinary.result());
            } else {
                textFieldBinary.setText("");
            }
        });

        textFieldBinary.setOnKeyReleased(event -> {
            if (!Objects.equals(textFieldBinary.getText(), "") && textFieldBinary.getText().length() <= 10) {
                BinaryToDecimal binaryToDecimal = new BinaryToDecimal(Integer.parseInt(textFieldBinary.getText()));

                textFieldDecimal.setText(binaryToDecimal.result());
            } else {
                textFieldDecimal.setText("");
            }
        });
    }

    public String convertDecimalToBinary(int num) {
        ArrayList<String> binary = new ArrayList<>();

        String result = "";

        while (num > 0) {
            binary.add(String.valueOf(num % 2));
            num = num / 2;
        }

        for (int i = binary.size() - 1; i >= 0; i--) {
            result += binary.get(i);
        }

        return result;
    }

    public String convertBinaryToDecimal(int num) {
        int result = 0;

        for (int i = 0; num != 0; i++) {
            result += (num % 10) * Math.pow(2, i);
            num = num / 10;
        }

        return Integer.toString(result);
    }
}