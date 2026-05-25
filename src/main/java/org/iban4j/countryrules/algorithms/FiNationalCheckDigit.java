package org.iban4j.countryrules.algorithms;

import org.iban4j.CountryCode;
import org.iban4j.Iban;
import org.iban4j.countryrules.CountryRulesAlgorithm;

/**
 * Finland: Mod 10 with weights 2,1,2,1 from right to left over bank+account.
 */
public final class FiNationalCheckDigit implements CountryRulesAlgorithm {

    /**
     * Created instance of Finland national check digit validator
     */
    public FiNationalCheckDigit() {
    }

    private static final int[] WEIGHTS = { 2, 1, 2, 1 };

    @Override
    public CountryCode getCountry() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean validate(Iban iban) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
