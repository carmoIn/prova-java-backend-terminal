package com.company;

import java.util.List;

public class Main {

    private static boolean isNumeric(String number) {
        try {
            Float.parseFloat(number);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    private static Float stringToFloat(String number) {
        if (isNumeric(number)) {
            return Float.parseFloat(number);
        }
        return null;
    }

    private static Float averageFromNumericList(List<String> list) {
        float sum = 0f;
        int length = 0;
        for (String item : list) {
            Float floatItem = stringToFloat(item);
            if (floatItem != null) {
                sum += floatItem;
                length++;
            }
        }
        return sum / length;
    }

    private static Float minFromNumericList(List<String> list) {
        Float minValue = stringToFloat(list.get(0));
        if (minValue != null) {
            for (String item : list) {
                Float floatItem = stringToFloat(item);
                if (floatItem != null && floatItem < minValue) {
                    minValue = floatItem;
                }
            }
        }
        return minValue;
    }

    private static Float maxFromNumericList(List<String> list) {
        Float maxValue = stringToFloat(list.get(0));
        if (maxValue != null) {
            for (String item : list) {
                Float floatItem = stringToFloat(item);
                if (floatItem != null && floatItem > maxValue) {
                    maxValue = floatItem;
                }
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        List<String> dataList = List.of(new String[]{
            "1.2", "0.4", "4"
        });

        System.out.println(dataList);
        System.out.printf("Avg %f\n", averageFromNumericList(dataList));
        System.out.printf("Min %f\n", minFromNumericList(dataList));
        System.out.printf("Min %f", maxFromNumericList(dataList));
    }
}
