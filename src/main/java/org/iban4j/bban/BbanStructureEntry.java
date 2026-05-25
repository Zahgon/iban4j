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
package org.iban4j.bban;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * BBAN Structure Entry representation.
 */
public class BbanStructureEntry {

    private static final Map<EntryCharacterType, char[]> charByCharacterType;

    static {
        charByCharacterType = new HashMap<>();
        StringBuilder charTypeN = new StringBuilder();
        for (char ch = '0'; ch <= '9'; ch++) {
            charTypeN.append(ch);
        }
        charByCharacterType.put(EntryCharacterType.n, charTypeN.toString().toCharArray());
        StringBuilder charTypeA = new StringBuilder();
        for (char ch = 'A'; ch <= 'Z'; ++ch) {
            charTypeA.append(ch);
        }
        charByCharacterType.put(EntryCharacterType.a, charTypeA.toString().toCharArray());
        charByCharacterType.put(EntryCharacterType.c, (charTypeN.toString() + charTypeA).toCharArray());
    }

    private final BbanEntryType entryType;

    private final EntryCharacterType characterType;

    private final int length;

    private BbanStructureEntry(final BbanEntryType entryType, final EntryCharacterType characterType, final int length) {
        this.entryType = entryType;
        this.characterType = characterType;
        this.length = length;
    }

    /**
     * <p>bankCode.</p>
     *
     * @param length a int
     * @param characterType a char
     * @return a {@link org.iban4j.bban.BbanStructureEntry} object
     */
    public static BbanStructureEntry bankCode(final int length, final char characterType) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * <p>bankCodeExt.</p>
     *
     * @param length a int
     * @param characterType a char
     * @return a {@link org.iban4j.bban.BbanStructureEntry} object
     */
    public static BbanStructureEntry bankCodeExt(final int length, final char characterType) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * <p>branchCode.</p>
     *
     * @param length a int
     * @param characterType a char
     * @return a {@link org.iban4j.bban.BbanStructureEntry} object
     */
    public static BbanStructureEntry branchCode(final int length, final char characterType) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * <p>accountNumber.</p>
     *
     * @param length a int
     * @param characterType a char
     * @return a {@link org.iban4j.bban.BbanStructureEntry} object
     */
    public static BbanStructureEntry accountNumber(final int length, final char characterType) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * <p>nationalCheckDigit.</p>
     *
     * @param length a int
     * @param characterType a char
     * @return a {@link org.iban4j.bban.BbanStructureEntry} object
     */
    public static BbanStructureEntry nationalCheckDigit(final int length, final char characterType) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * <p>accountType.</p>
     *
     * @param length a int
     * @param characterType a char
     * @return a {@link org.iban4j.bban.BbanStructureEntry} object
     */
    public static BbanStructureEntry accountType(final int length, final char characterType) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * <p>ownerAccountNumber.</p>
     *
     * @param length a int
     * @param characterType a char
     * @return a {@link org.iban4j.bban.BbanStructureEntry} object
     */
    public static BbanStructureEntry ownerAccountNumber(final int length, final char characterType) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * <p>identificationNumber.</p>
     *
     * @param length a int
     * @param characterType a char
     * @return a {@link org.iban4j.bban.BbanStructureEntry} object
     */
    public static BbanStructureEntry identificationNumber(final int length, final char characterType) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * <p>Getter for the field <code>entryType</code>.</p>
     *
     * @return a {@link org.iban4j.bban.BbanEntryType} object
     */
    public BbanEntryType getEntryType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * <p>Getter for the field <code>characterType</code>.</p>
     *
     * @return a {@link org.iban4j.bban.BbanStructureEntry.EntryCharacterType} object
     */
    public EntryCharacterType getCharacterType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * <p>Getter for the field <code>length</code>.</p>
     *
     * @return a int
     */
    public int getLength() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * <p>getRandom.</p>
     *
     * @return a {@link java.lang.String} object
     */
    public String getRandom() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * <p>getRandom.</p>
     *
     * @param random a {@link java.util.Random} object
     * @return a {@link java.lang.String} object
     */
    public String getRandom(Random random) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public enum EntryCharacterType {

        /**
         * Numerical digits (0-9 only)
         */
        n,
        /**
         * Alphabetical characters (A-Z only)
         */
        a,
        /**
         * Combined alphabetical (uppercase) and numeric characters (A-Z and 0-9)
         */
        c
    }
}
