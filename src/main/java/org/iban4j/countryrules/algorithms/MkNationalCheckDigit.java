package org.iban4j.countryrules.algorithms;

import org.iban4j.CountryCode;
import org.iban4j.Iban;
import org.iban4j.countryrules.util.Iso7064;
import org.iban4j.countryrules.CountryRulesAlgorithm;

/**
 * Macedonia: ISO 7064 MOD 97-10 over BBAN.
 */
public final class MkNationalCheckDigit implements CountryRulesAlgorithm {

    /**
     * Created instance of Macedonia national check digit validator
     */
    public MkNationalCheckDigit() {
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
