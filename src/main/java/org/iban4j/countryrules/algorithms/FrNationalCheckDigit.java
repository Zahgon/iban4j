package org.iban4j.countryrules.algorithms;

import org.iban4j.CountryCode;
import org.iban4j.Iban;
import org.iban4j.countryrules.CountryRulesAlgorithm;
import org.iban4j.countryrules.util.Iso7064;

/**
 * France: Mod 97 RIB with letter conversion.
 */
public final class FrNationalCheckDigit implements CountryRulesAlgorithm {

    /**
     * Created instance of France national check digit validator
     */
    public FrNationalCheckDigit() {
    }

    @Override
    public CountryCode getCountry() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean validate(Iban iban) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static String ribCheckDigits(String numeric) {
        return Iso7064.ribCheckDigits(numeric);
    }

    private static void convert(String input, StringBuilder builder) {
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                builder.append(c);
            } else if (Character.isLetter(c)) {
                builder.append(getFrenchLetterValue(Character.toUpperCase(c)));
            } else {
                builder.append(c);
            }
        }
    }

    private static int getFrenchLetterValue(char letter) {
        switch(letter) {
            case 'A':
            case 'J':
                return 1;
            case 'B':
            case 'K':
            case 'S':
                return 2;
            case 'C':
            case 'L':
            case 'T':
                return 3;
            case 'D':
            case 'M':
            case 'U':
                return 4;
            case 'E':
            case 'N':
            case 'V':
                return 5;
            case 'F':
            case 'O':
            case 'W':
                return 6;
            case 'G':
            case 'P':
            case 'X':
                return 7;
            case 'H':
            case 'Q':
            case 'Y':
                return 8;
            case 'I':
            case 'R':
            case 'Z':
                return 9;
            default:
                return 0;
        }
    }
}
