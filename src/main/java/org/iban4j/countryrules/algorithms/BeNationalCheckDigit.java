package org.iban4j.countryrules.algorithms;

import org.iban4j.CountryCode;
import org.iban4j.Iban;
import org.iban4j.countryrules.CountryRulesAlgorithm;
import org.iban4j.countryrules.util.Iso7064;

/**
 * Belgium: modulus 97 check on bankCode+accountNumber, 00 => 97 rule.
 */
public final class BeNationalCheckDigit implements CountryRulesAlgorithm {

    /**
     * Created instance of Belgium national check digit validator
     */
    public BeNationalCheckDigit() {
    }

    @Override
    public CountryCode getCountry() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean validate(final Iban iban) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
