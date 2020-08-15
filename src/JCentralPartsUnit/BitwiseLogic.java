//Copyright 2020 Miles Potter

// This file is part of CentralPartsUnit.
//
// CentralPartsUnit is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// CentralPartsUnit is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program.  If not, see <https://www.gnu.org/licenses/>.

package JCentralPartsUnit;

class BitwiseLogic { //this class contains bitwise logic for two bytes of any size (or one byte in the case of NOT)

    public static char[] BITWISE_OR(char[] BYTE_A, char[] BYTE_B) {
        if (BYTE_A.length != BYTE_B.length) {
            System.err.println("Input byte lengths do no match!");
            return null;
        } else {
            char[] output = new char[BYTE_A.length];
            for (int i = 0; i < BYTE_A.length; i++) {
                if (BYTE_A[i] >= 1 || BYTE_B[i] >= 1) {
                    output[i] = 1;
                } else {
                    output[i] = 0;
                }
            }
            return output;
        }
    }

    public static char[] BITWISE_NOR(char[] BYTE_A, char[] BYTE_B) {
        if (BYTE_A.length != BYTE_B.length) {
            System.err.println("Input byte lengths do no match!");
            return null;
        } else {
            char[] output = new char[BYTE_A.length];
            for (int i = 0; i < BYTE_A.length; i++) {
                if (BYTE_A[i] >= 1 || BYTE_B[i] >= 1) {
                    output[i] = 0;
                } else {
                    output[i] = 1;
                }
            }
            return output;
        }
    }

    public static char[] BITWISE_XOR(char[] BYTE_A, char[] BYTE_B) {
        if (BYTE_A.length != BYTE_B.length) {
            System.err.println("Input byte lengths do no match!");
            return null;
        } else {
            char[] output = new char[BYTE_A.length];
            for (int i = 0; i < BYTE_A.length; i++) {
                if (BYTE_A[i] >= 1 && BYTE_B[i] >= 1) {
                    output[i] = 0;
                } else {
                    if (BYTE_A[i] >= 1 || BYTE_B[i] >= 1) {
                        output[i] = 1;
                    } else {
                        output[i] = 0;
                    }
                }
            }
            return output;
        }
    }

    public static char[] BITWISE_XNOR(char[] BYTE_A, char[] BYTE_B) {
        if (BYTE_A.length != BYTE_B.length) {
            System.err.println("Input byte lengths do no match!");
            return null;
        } else {
            char[] output = new char[BYTE_A.length];
            for (int i = 0; i < BYTE_A.length; i++) {
                if (BYTE_A[i] >= 1 && BYTE_B[i] >= 1) {
                    output[i] = 1;
                } else {
                    if (BYTE_A[i] >= 1 || BYTE_B[i] >= 1) {
                        output[i] = 0;
                    } else {
                        output[i] = 1;
                    }
                }
            }
            return output;
        }
    }

    public static char[] BITWISE_AND(char[] BYTE_A, char[] BYTE_B) {
        if (BYTE_A.length != BYTE_B.length) {
            System.err.println("Input byte lengths do no match!");
            return null;
        } else {
            char[] output = new char[BYTE_A.length];
            for (int i = 0; i < BYTE_A.length; i++) {
                if (BYTE_A[i] >= 1 && BYTE_B[i] >= 1) {
                    output[i] = 1;
                } else {
                    output[i] = 0;
                }
            }
            return output;
        }
    }

    public static char[] BITWISE_NAND(char[] BYTE_A, char[] BYTE_B) {
        if (BYTE_A.length != BYTE_B.length) {
            System.err.println("Input byte lengths do no match!");
            return null;
        } else {
            char[] output = new char[BYTE_A.length];
            for (int i = 0; i < BYTE_A.length; i++) {
                if (BYTE_A[i] >= 1 || BYTE_B[i] >= 1) {
                    output[i] = 0;
                } else {
                    output[i] = 1;
                }
            }
            return output;
        }
    }

    public static char[] BITWISE_NOT(char[] BYTE) {
    char[] output = new char[BYTE.length]; //output BYTE
        for (int i = 0; i < BYTE.length; i++) { //going through the indices doing the NOT operation;
        if (BYTE[i] >= 1) {
            output[i] = 0;
        } else {
            output[i] = 1;
        }
    }
        return output;
    }
}
