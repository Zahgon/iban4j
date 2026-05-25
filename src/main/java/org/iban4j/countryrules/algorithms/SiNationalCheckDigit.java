package org.iban4j.countryrules.algorithms;

import org.iban4j.CountryCode;
import org.iban4j.Iban;
import org.iban4j.countryrules.util.Iso7064;
import org.iban4j.countryrules.CountryRulesAlgorithm;

/**
 * Slovenia: ISO 7064 MOD 97-10 over BBAN.
 */
public final class SiNationalCheckDigit implements CountryRulesAlgorithm {

    /**
     * Created instance of Slovenia national check digit validator
     */
    public SiNationalCheckDigit() {
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
