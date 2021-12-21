package me.coopersully.Survival.tokens;

import java.text.NumberFormat;
import java.util.Locale;

public class Tokens {

    public static String amountWithCommas(long amount) {
        return NumberFormat.getNumberInstance(Locale.US).format(amount);
    }

    public static String amountWithCommas(int amount) {
        return NumberFormat.getNumberInstance(Locale.US).format(amount);
    }

}
