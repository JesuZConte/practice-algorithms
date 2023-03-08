package com.practice.algorithms.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenerateDVByRut {

    public static void main(String[] args) {
        System.out.println(addVerificationDigit("35090607"));
    }

    public static String addVerificationDigit(String documentId) {
        List<String> documentIdList = new ArrayList<>(Arrays.asList(documentId.split("")));
        List<String> replaced = new ArrayList<>();

        int multiplier = 2;
        int sum = 0;
        for (int i = documentIdList.size() - 1, j = 0; i >= 0; i--, j++) {
            replaced.add(j, String.valueOf(Integer.parseInt(documentIdList.get(i)) * multiplier));
            sum += Integer.parseInt(String.valueOf(replaced.get(j)));

            if (multiplier == 7) {
                multiplier = 1;
            }
            multiplier++;
        }
        String result = String.valueOf(sum);

        int mod = Integer.parseInt(result) % 11;
        String verificationDigit = String.valueOf(11 - mod);

        if (verificationDigit.equals("11")) {
            verificationDigit = "0";
        }
        if (verificationDigit.equals("10")) {
            verificationDigit = "K";
        }
        return documentId + "-" + verificationDigit;
    }

}
