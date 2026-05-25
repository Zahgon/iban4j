package org.iban4j.countryrules.algorithms;

import org.iban4j.CountryCode;
import org.iban4j.Iban;
import org.iban4j.countryrules.CountryRulesAlgorithm;
import org.iban4j.countryrules.util.Iso7064;

/**
 * Bosnia and Herzegovina: ISO 7064 MOD 97-10 over entire BBAN.
 */
public final class BaNationalCheckDigit implements CountryRulesAlgorithm {

    /**
     * Created instance of Bosnia and Herzegovina national check digit validator
     */
    public BaNationalCheckDigit() {
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
