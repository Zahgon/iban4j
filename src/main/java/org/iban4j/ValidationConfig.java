package org.iban4j;

import java.util.Objects;

/**
 * Configuration for national check digit validation.
 *
 * This class provides configuration options for enabling national check digit validation.
 *
 * @since 1.0.0
 */
public class ValidationConfig {

    private final boolean enableNationalCheckDigitValidation;

    private ValidationConfig(Builder builder) {
        this.enableNationalCheckDigitValidation = builder.enableNationalCheckDigitValidation;
    }

    /**
     * Creates a new builder for ValidationConfig.
     *
     * @return a new builder instance
     */
    public static Builder builder() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Checks if national check digit validation is enabled.
     *
     * @return true if validation is enabled
     */
    public boolean isEnabled() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean equals(Object obj) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Builder for ValidationConfig.
     */
    public static class Builder {

        private boolean enableNationalCheckDigitValidation = false;

        private Builder() {
        }

        /**
         * Enables or disables national check digit validation.
         *
         * @param enabled true to enable validation
         * @return this builder
         */
        public Builder enableNationalCheckDigitValidation(boolean enabled) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Enables or disables country specific rules
         * @see Builder#enableNationalCheckDigitValidation
         * @param enabled true to enable validation
         * @return this builder
         */
        public Builder enableCountryRules(boolean enabled) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Builds the ValidationConfig instance.
         *
         * @return the configured ValidationConfig
         */
        public ValidationConfig build() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
