package org.iban4j.countryrules.algorithms;

import org.iban4j.CountryCode;
import org.iban4j.Iban;
import org.iban4j.countryrules.CountryRulesAlgorithm;

/**
 * Slovak Republic: Mod 11 two-part validation on account number (prefix and basic).
 */
public final class SkNationalCheckDigit implements CountryRulesAlgorithm {

    /**
     * Created instance of Slovak Republic national check digit validator
     */
    public SkNationalCheckDigit() {
    }

    private static final int[] FIRST_PART_WEIGHTS = { 10, 5, 8, 4, 2, 1 };

    private static final int[] SECOND_PART_WEIGHTS = { 6, 3, 7, 9, 10, 5, 8, 4, 2, 1 };

    @Override
    public CountryCode getCountry() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean validate(Iban iban) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static int mod11WithWeights(String digits, int[] weights) {
        int sum = 0;
        for (int i = 0; i < digits.length(); i++) {
            int d = digits.charAt(i) - '0';
            int w = weights[i % weights.length];
            sum += d * w;
        }
        return sum % 11;
    }
}
