package org.iban4j.countryrules.util;

/**
 * Utilities for ISO 7064 MOD 97-10 calculations, implemented in a streaming manner
 * to avoid overflows for long numeric strings.
 */
public final class Iso7064 {

    private Iso7064() {
    }

    /**
     * Compute the MOD 97-10 remainder for a numeric string. Returns -1 for invalid input.
     * @param numeric number represented as a string to compute MOD 97 operation
     * @return result of MOD 97 operation or {@code -1} if {@code numeric} values is not a number
     */
    public static int mod97_10(final String numeric) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Compute French/Tunisian style RIB check digits: (number * 100) % 97 and 97 - remainder.
     * Returns the two-digit string or null on invalid input.
     * @param numeric number represented as a string to compute RIB check digits
     * @return RIB check digits or {@code null} if {@code numeric} values is not a number
     */
    public static String ribCheckDigits(final String numeric) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
