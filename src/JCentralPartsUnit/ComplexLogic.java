package JCentralPartsUnit;

public class ComplexLogic {

    public static char[] ADD(char BIT_A, char BIT_B, char CARRY_IN) {
        char C_OUT = 0;
        char OUT = 0;
        int bits = BIT_A + BIT_B + CARRY_IN;
        switch(bits) {
            case 1:
                OUT = 1;
            case 2:
                C_OUT = 1;
            case 3:
                C_OUT = 1;
                OUT = 1;
        }
        return new char[]{OUT, C_OUT};
    }

    public static char[] HALF_ADD(char BIT_A, char BIT_B) {
        int bits = BIT_A + BIT_B;
        char OUT = 0;
        char C_OUT = 0;
        switch (bits){
            case 1:
                OUT = 1;
            case 2:
                C_OUT = 1;
        }
        return new char[]{OUT, C_OUT};
    }

    public static char[] TWO_COMP(char[] BYTE) {
        char[] output = new char[BYTE.length];
        char[] halfOut = new char[2];
        char carry = 0;
        halfOut = HALF_ADD(BYTE[0], (char) 1);
        output[0] = halfOut[0];
        carry = halfOut[1];
        for (int i = 1; i < BYTE.length; i++) {
            halfOut = HALF_ADD(BYTE[i], carry);
            output[i] = halfOut[0];
            carry = halfOut[1];
        }
        return output;
    }
}
