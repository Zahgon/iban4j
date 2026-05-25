package org.iban4j.countryrules.algorithms;

import org.iban4j.CountryCode;
import org.iban4j.Iban;
import org.iban4j.countryrules.util.Iso7064;
import org.iban4j.countryrules.CountryRulesAlgorithm;

/**
 * Portugal: ISO 7064 MOD 97-10 over BBAN.
 */
public final class PtNationalCheckDigit implements CountryRulesAlgorithm {

    /**
     * Created instance of Portugal national check digit validator
     */
    public PtNationalCheckDigit() {
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
