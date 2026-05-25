package org.iban4j.countryrules.algorithms;

import org.iban4j.CountryCode;
import org.iban4j.Iban;
import org.iban4j.countryrules.CountryRulesAlgorithm;

/**
 * Spain: dual modulus 11 with weights 1,2,4,8,5,10,9,7,3,6 over 00+bank+branch and account.
 */
public final class EsNationalCheckDigit implements CountryRulesAlgorithm {

    private static final int[] WEIGHTS = { 1, 2, 4, 8, 5, 10, 9, 7, 3, 6 };

    /**
     * Created instance of Spain national check digit validator
     */
    public EsNationalCheckDigit() {
    }

    @Override
    public CountryCode getCountry() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean validate(final Iban iban) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static int calculateCheckDigit(String firstData) {
        final int firstSum = weightedSum(firstData);
        if (firstSum < 0) {
            return -1;
        }
        int firstRem = firstSum % 11;
        int firstCd = (firstRem == 0) ? 0 : (11 - firstRem);
        switch(firstCd) {
            case 10:
                return 1;
            case 11:
                return 2;
            default:
                return firstCd;
        }
    }

    private static int weightedSum(final String digits) {
        int sum = 0;
        for (int i = 0; i < digits.length(); i++) {
            final char ch = digits.charAt(i);
            if (ch < '0' || ch > '9') {
                return -1;
            }
            final int weight = WEIGHTS[i % WEIGHTS.length];
            sum += (ch - '0') * weight;
        }
        return sum;
    }
}
