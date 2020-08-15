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
