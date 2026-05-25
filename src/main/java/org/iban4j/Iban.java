/*
 * Copyright 2013 Artur Mkrtchyan
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.iban4j;

import static org.iban4j.IbanFormatException.IbanFormatViolation.*;
import java.util.List;
import java.util.Random;
import org.iban4j.bban.BbanStructure;
import org.iban4j.bban.BbanStructureEntry;

/**
 * Represents an International Bank Account Number (IBAN).
 *
 * <p>This class encapsulates the IBAN string and provides utility methods
 * for parsing, validating, and extracting components of an IBAN according to
 * the <a href="http://en.wikipedia.org/wiki/ISO_13616">ISO 13616</a> standard.
 * It is an immutable class.</p>
 */
public final class Iban {

    /**
     * Default check digit used for temporary IBAN construction before actual check digit calculation.
     */
    static final String DEFAULT_CHECK_DIGIT = "00";

    /**
     * The actual IBAN string value.
     */
    private final String value;

    /**
     * Private constructor to create an IBAN instance.
     * Use {@link #valueOf(String)}, {@link #valueOf(String, IbanFormat)},
     * or the {@link Iban.Builder} to create instances.
     *
     * @param value The raw IBAN string.
     */
    private Iban(final String value) {
        this.value = value;
    }

    /**
     * Returns an {@code Iban} object holding the value of the specified String.
     * The provided IBAN string will be validated against ISO 13616 standard.
     *
     * @param iban The String to be parsed and validated.
     * @return An {@code Iban} object holding the value represented by the string argument.
     * @throws org.iban4j.IbanFormatException If the String does not contain a parsable IBAN
     * or has a format violation.
     * @throws org.iban4j.InvalidCheckDigitException If the IBAN has an invalid check digit.
     * @throws org.iban4j.UnsupportedCountryException If the IBAN's country is not supported.
     */
    public static Iban valueOf(final String iban) throws IbanFormatException, InvalidCheckDigitException, UnsupportedCountryException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns an {@code Iban} object holding the value of the specified String,
     * applying a specific formatting style during parsing.
     *
     * @param iban The String to be parsed.
     * @param format The {@link IbanFormat} to be used during parsing and validation.
     * @return An {@code Iban} object holding the value represented by the string argument.
     * @throws org.iban4j.IbanFormatException If the String does not contain a parsable IBAN,
     * has a format violation, or does not match the specified format.
     * @throws org.iban4j.InvalidCheckDigitException If the IBAN has an invalid check digit.
     * @throws org.iban4j.UnsupportedCountryException If the IBAN's Country is not supported.
     */
    public static Iban valueOf(final String iban, final IbanFormat format) throws IbanFormatException, InvalidCheckDigitException, UnsupportedCountryException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Creates a new random IBAN instance.
     * The country code will be randomly selected from the supported countries.
     *
     * @return A randomly generated {@code Iban} instance.
     * @throws IbanFormatException If an unexpected format issue occurs during generation.
     * @throws UnsupportedCountryException If no supported country can be found (highly unlikely).
     */
    public static Iban random() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Creates a new random IBAN instance using a specific {@link Random} number generator.
     * The country code will be randomly selected from the supported countries.
     *
     * @param random The {@link Random} instance to use for generating random components.
     * @return A randomly generated {@code Iban} instance.
     * @throws IbanFormatException If an unexpected format issue occurs during generation.
     * @throws UnsupportedCountryException If no supported country can be found (highly unlikely).
     */
    public static Iban random(Random random) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Creates a new random IBAN instance for a specific country.
     * All other components (bank code, account number, etc.) will be randomly generated.
     *
     * @param cc The {@link CountryCode} for which the IBAN should be generated.
     * @return A randomly generated {@code Iban} instance for the specified country.
     * @throws IbanFormatException If an unexpected format issue occurs during generation.
     * @throws UnsupportedCountryException If the provided country code is not supported.
     */
    public static Iban random(CountryCode cc) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the country code part of this IBAN.
     *
     * @return The {@link CountryCode} enum constant representing the IBAN's country.
     */
    public CountryCode getCountryCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the check digit part of this IBAN.
     * The check digit consists of two digits.
     *
     * @return A {@link String} representing the two-digit check digit.
     */
    public String getCheckDigit() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the account number part of this IBAN.
     * This is part of the BBAN (Basic Bank Account Number).
     *
     * @return A {@link String} representing the account number.
     */
    public String getAccountNumber() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the bank code part of this IBAN.
     * This is part of the BBAN (Basic Bank Account Number).
     *
     * @return A {@link String} representing the bank code.
     */
    public String getBankCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the branch code part of this IBAN.
     * This is an optional part of the BBAN (Basic Bank Account Number).
     *
     * @return A {@link String} representing the branch code, or an empty string if not present.
     */
    public String getBranchCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the national check digit part of this IBAN.
     * This is part of the BBAN (Basic Bank Account Number) for some countries.
     *
     * @return A {@link String} representing the national check digit, or an empty string if not applicable.
     */
    public String getNationalCheckDigit() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the account type part of this IBAN.
     * This is part of the BBAN (Basic Bank Account Number) for some countries.
     *
     * @return A {@link String} representing the account type, or an empty string if not applicable.
     */
    public String getAccountType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the owner account type part of this IBAN.
     * This is part of the BBAN (Basic Bank Account Number) for some countries.
     *
     * @return A {@link String} representing the owner account type, or an empty string if not applicable.
     */
    public String getOwnerAccountType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the identification number part of this IBAN.
     * This is part of the BBAN (Basic Bank Account Number) for some countries.
     *
     * @return A {@link String} representing the identification number, or an empty string if not applicable.
     */
    public String getIdentificationNumber() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the BBAN (Basic Bank Account Number) part of this IBAN.
     * The BBAN is the country-specific part of the IBAN that follows the check digits.
     *
     * @return A {@link String} representing the BBAN.
     */
    public String getBban() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a formatted version of the IBAN, typically grouped into four-character blocks
     * separated by spaces, for human readability.
     *
     * @return A {@link String} representing the formatted IBAN.
     */
    public String toFormattedString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(final Object obj) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Builder class for constructing {@link Iban} instances.
     * This builder provides methods to set individual components of an IBAN
     * and to build either a fully specified or a randomly generated IBAN.
     */
    public static final class Builder {

        private final Random random;

        private CountryCode countryCode;

        private String bankCode;

        private String bankCodeExt;

        private String branchCode;

        private String nationalCheckDigit;

        private String accountType;

        private String accountNumber;

        private String ownerAccountType;

        private String identificationNumber;

        private boolean enableLeftPadding;

        private char padChar = '0';

        /**
         * Creates an Iban Builder instance using a specific {@link Random} generator.
         *
         * @param random The {@link Random} instance to use for random generation.
         */
        public Builder(Random random) {
            this.random = random;
        }

        /**
         * Creates an Iban Builder instance using a default, randomly seeded {@link Random} generator.
         */
        public Builder() {
            this(new Random());
        }

        /**
         * Sets the IBAN's country code.
         * This is a mandatory component for building an IBAN.
         *
         * @param countryCode The {@link CountryCode} for the IBAN.
         * @return The current {@code Builder} instance for method chaining.
         */
        public Builder countryCode(final CountryCode countryCode) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Sets the IBAN's bank code.
         * The bank code is part of the BBAN structure.
         *
         * @param bankCode The bank code {@link String}.
         * @return The current {@code Builder} instance for method chaining.
         */
        public Builder bankCode(final String bankCode) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Sets the IBAN's bank code extension.
         * This is an optional part of the BBAN for some countries.
         *
         * @param bankCodeExt The bank code extension {@link String}.
         * @return The current {@code Builder} instance for method chaining.
         */
        public Builder bankCodeExt(final String bankCodeExt) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Sets the IBAN's branch code.
         * This is an optional part of the BBAN for some countries.
         *
         * @param branchCode The branch code {@link String}.
         * @return The current {@code Builder} instance for method chaining.
         */
        public Builder branchCode(final String branchCode) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Sets the IBAN's account number.
         * This is a mandatory component for building an IBAN.
         *
         * @param accountNumber The account number {@link String}.
         * @return The current {@code Builder} instance for method chaining.
         */
        public Builder accountNumber(final String accountNumber) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Sets the IBAN's national check digit.
         * This is an optional part of the BBAN for some countries.
         *
         * @param nationalCheckDigit The national check digit {@link String}.
         * @return The current {@code Builder} instance for method chaining.
         */
        public Builder nationalCheckDigit(final String nationalCheckDigit) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Sets the IBAN's account type.
         * This is an optional part of the BBAN for some countries.
         *
         * @param accountType The account type {@link String}.
         * @return The current {@code Builder} instance for method chaining.
         */
        public Builder accountType(final String accountType) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Sets the IBAN's owner account type.
         * This is an optional part of the BBAN for some countries.
         *
         * @param ownerAccountType The owner account type {@link String}.
         * @return The current {@code Builder} instance for method chaining.
         */
        public Builder ownerAccountType(final String ownerAccountType) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Sets the IBAN's identification number.
         * This is an optional part of the BBAN for some countries.
         *
         * @param identificationNumber The identification number {@link String}.
         * @return The current {@code Builder} instance for method chaining.
         */
        public Builder identificationNumber(final String identificationNumber) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Sets whether or not the BBAN components should be left-padded with the padding character.
         * Default padding character is '0'.
         *
         * @param enableLeftPadding {@code true} to enable left-padding, {@code false} otherwise.
         * @return The current {@code Builder} instance for method chaining.
         */
        public Builder leftPadding(boolean enableLeftPadding) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Sets the character used for left-padding BBAN components if padding is enabled.
         * The default padding character is '0'.
         *
         * @param paddingCharacter The character to use for padding.
         * @return The current {@code Builder} instance for method chaining.
         */
        public Builder paddingCharacter(char paddingCharacter) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Builds a new {@code Iban} instance with the currently configured attributes.
         * The generated IBAN will be validated against ISO 13616 specification.
         *
         * @return A new {@code Iban} instance.
         * @throws IbanFormatException If the provided values are not parsable by IBAN Specification
         * <a href="http://en.wikipedia.org/wiki/ISO_13616">ISO 13616</a>.
         * @throws IllegalArgumentException If required fields (e.g., country code, bank code, account number) are null
         * when building a non-random IBAN.
         * @throws UnsupportedCountryException If the specified country is not supported by the IBAN specification.
         */
        public Iban build() throws IbanFormatException, IllegalArgumentException, UnsupportedCountryException {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Builds a new {@code Iban} instance with the currently configured attributes.
         *
         * @param validate {@code true} to validate the generated IBAN after generation, {@code false} otherwise.
         * @return A new {@code Iban} instance.
         * @throws IbanFormatException If the provided values are not parsable by IBAN Specification
         * <a href="http://en.wikipedia.org/wiki/ISO_13616">ISO 13616</a>.
         * @throws IllegalArgumentException If required fields (e.g., country code, bank code, account number) are null
         * when building a non-random IBAN.
         * @throws UnsupportedCountryException If the specified country is not supported by the IBAN specification.
         */
        public Iban build(boolean validate) throws IbanFormatException, IllegalArgumentException, UnsupportedCountryException {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Builds a new random {@code Iban} instance.
         * If a country code is not set, it will be randomly selected from the supported countries.
         * Missing BBAN fields will be randomly filled according to the BBAN structure of the selected country.
         *
         * @return A new randomly generated {@code Iban} instance.
         * @throws IbanFormatException If an unexpected format issue occurs during random generation.
         * @throws IllegalArgumentException If the random generator is null or other internal configuration issues occur.
         * @throws UnsupportedCountryException If the selected or generated country is not supported.
         */
        public Iban buildRandom() throws IbanFormatException, IllegalArgumentException, UnsupportedCountryException {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Formats the BBAN (Basic Bank Account Number) part of the IBAN based on the country's BBAN structure.
         * Missing fields (if not set in the builder) will be padded or filled according to the structure rules.
         *
         * @return A {@link String} representing the formatted BBAN.
         * @throws UnsupportedCountryException If the country code is not supported, and its BBAN structure cannot be retrieved.
         */
        private String formatBban() {
            final StringBuilder sb = new StringBuilder();
            final BbanStructure structure = BbanStructure.forCountry(countryCode);
            if (structure == null) {
                throw new UnsupportedCountryException(countryCode.toString(), "Country code is not supported.");
            }
            for (final BbanStructureEntry entry : structure.getEntries()) {
                switch(entry.getEntryType()) {
                    case bank_code:
                        sb.append(getPaddedString(bankCode, entry.getLength()));
                        break;
                    case bank_code_ext:
                        sb.append(getPaddedString(bankCodeExt, entry.getLength()));
                        break;
                    case branch_code:
                        sb.append(getPaddedString(branchCode, entry.getLength()));
                        break;
                    case account_number:
                        sb.append(getPaddedString(accountNumber, entry.getLength()));
                        break;
                    case national_check_digit:
                        sb.append(nationalCheckDigit);
                        break;
                    case account_type:
                        sb.append(accountType);
                        break;
                    case owner_account_number:
                        sb.append(ownerAccountType);
                        break;
                    case identification_number:
                        sb.append(identificationNumber);
                        break;
                }
            }
            return sb.toString();
        }

        /**
         * Pads the given input string with the configured padding character to reach the specified length.
         * Padding is applied only if {@link #leftPadding(boolean)} is enabled.
         *
         * @param input The string to be padded (e.g., a BBAN component).
         * @param len The desired length of the padded string.
         * @return The padded string, or the original string if padding is not enabled.
         */
        private String getPaddedString(String input, int len) {
            if (enableLeftPadding)
                return IbanUtil.padLeft(input, len, padChar);
            else
                return input;
        }

        /**
         * Formats the full IBAN string with the country code and a default check digit ("00")
         * before the actual check digit calculation.
         *
         * @return A {@link String} representing the preliminary formatted IBAN.
         */
        private String formatIban() {
            String sb = countryCode.getAlpha2() + DEFAULT_CHECK_DIGIT + formatBban();
            return sb;
        }

        /**
         * Validates that mandatory IBAN components are not null for non-random IBAN construction.
         *
         * @param countryCode The country code.
         * @param bankCode The bank code.
         * @param accountNumber The account number.
         * @param nationalCheckDigit The national check digit (if applicable for the country).
         * @throws IbanFormatException If any required component is {@code null}.
         */
        private void require(final CountryCode countryCode, final String bankCode, final String accountNumber, final String nationalCheckDigit) throws IbanFormatException {
            if (countryCode == null) {
                throw new IbanFormatException(COUNTRY_CODE_NOT_NULL, "countryCode is required; it cannot be null");
            }
            if (bankCode == null) {
                throw new IbanFormatException(BANK_CODE_NOT_NULL, "bankCode is required; it cannot be null");
            }
            if (accountNumber == null) {
                throw new IbanFormatException(ACCOUNT_NUMBER_NOT_NULL, "accountNumber is required; it cannot be null");
            }
            if (BbanStructure.hasNationalCheckDigit(countryCode)) {
                if (nationalCheckDigit == null) {
                    throw new IbanFormatException(NATIONAL_CHECK_DIGIT_NOT_NULL, "nationalCheckDigit is required; it cannot be null");
                }
            }
        }

        /**
         * Fills any missing BBAN fields with randomly generated values based on the
         * BBAN structure of the selected country.
         *
         * @param random The {@link Random} instance to use for generating random values.
         * @throws UnsupportedCountryException If the country code is not supported, and its BBAN structure cannot be retrieved.
         */
        private void fillMissingFieldsRandomly(final Random random) {
            final BbanStructure structure = BbanStructure.forCountry(countryCode);
            if (structure == null) {
                throw new UnsupportedCountryException(countryCode.toString(), "Country code is not supported.");
            }
            for (final BbanStructureEntry entry : structure.getEntries()) {
                switch(entry.getEntryType()) {
                    case bank_code:
                        if (bankCode == null) {
                            bankCode = entry.getRandom(random);
                        }
                        break;
                    case bank_code_ext:
                        if (bankCodeExt == null) {
                            bankCodeExt = entry.getRandom(random);
                        }
                        break;
                    case branch_code:
                        if (branchCode == null) {
                            branchCode = entry.getRandom(random);
                        }
                        break;
                    case account_number:
                        if (accountNumber == null) {
                            accountNumber = entry.getRandom(random);
                        }
                        break;
                    case national_check_digit:
                        if (nationalCheckDigit == null) {
                            nationalCheckDigit = entry.getRandom(random);
                        }
                        break;
                    case account_type:
                        if (accountType == null) {
                            accountType = entry.getRandom(random);
                        }
                        break;
                    case owner_account_number:
                        if (ownerAccountType == null) {
                            ownerAccountType = entry.getRandom(random);
                        }
                        break;
                    case identification_number:
                        if (identificationNumber == null) {
                            identificationNumber = entry.getRandom(random);
                        }
                        break;
                }
            }
        }
    }
}
