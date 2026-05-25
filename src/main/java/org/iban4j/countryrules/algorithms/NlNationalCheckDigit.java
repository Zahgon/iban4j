package org.iban4j.countryrules.algorithms;

import org.iban4j.CountryCode;
import org.iban4j.Iban;
import org.iban4j.countryrules.CountryRulesAlgorithm;

/**
 * Netherlands: Mod 11 with weights 10..1 on account number; allow Postbank starting with 000.
 */
public final class NlNationalCheckDigit implements CountryRulesAlgorithm {

    /**
     * Created instance of Netherlands national check digit validator
     */
    public NlNationalCheckDigit() {
    }

    private static final int[] WEIGHTS = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

    @Override
    public CountryCode getCountry() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean validate(Iban iban) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
