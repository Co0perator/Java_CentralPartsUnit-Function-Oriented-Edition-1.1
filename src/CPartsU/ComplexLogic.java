package CPartsU;
import CPartsU.Logic;

public class ComplexLogic {

    public static char[] ADD(char BIT_A, char BIT_B, char CARRY_IN) {
        char[] output = new char[2];
        char C_OUT = 0;
        char OUT = 0;
        int bits = BIT_A + BIT_B + CARRY_IN;
        switch(bits) {
            case 0:
                C_OUT = 0;
                OUT = 0;
            case 1:
                C_OUT = 0;
                OUT = 1;
            case 2:
                C_OUT = 1;
                OUT = 0;
            case 3:
                C_OUT = 1;
                OUT = 1;
        }
        output[0] = OUT;
        output[1] = C_OUT;
        return output;
    }

    public static char HALF_ADD(char BIT_A, char BIT_B) {

    }

    public static char[] TWO_COMP(char[] BYTE) {
        
    }
}
