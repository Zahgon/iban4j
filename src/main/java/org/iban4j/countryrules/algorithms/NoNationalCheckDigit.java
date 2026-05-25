package org.iban4j.countryrules.algorithms;

import org.iban4j.CountryCode;
import org.iban4j.Iban;
import org.iban4j.countryrules.CountryRulesAlgorithm;

/**
 * Norway: Mod 11 with weights 5,4,3,2,7,6,5,4,3,2 on bank+account vs 1-digit check.
 */
public final class NoNationalCheckDigit implements CountryRulesAlgorithm {

    private static final int[] WEIGHTS = { 5, 4, 3, 2, 7, 6, 5, 4, 3, 2 };

    /**
     * Created instance of Norway national check digit validator
     */
    public NoNationalCheckDigit() {
    }

    @Override
    public CountryCode getCountry() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean validate(Iban iban) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
