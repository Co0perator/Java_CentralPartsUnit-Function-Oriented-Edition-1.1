package CPartsU;

public class Logic { //this class contains single bit logic
    public static char OR(char BIT_A, char BIT_B) {
        if (BIT_A >= 1 || BIT_B >= 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public static char NOR(char BIT_A, char BIT_B) {
        if (BIT_A >= 1 || BIT_B >= 1) {
            return 0;
        } else {
            return 1;
        }
    }

    public static char XOR(char BIT_A, char BIT_B) {
        if (BIT_A >= 1 && BIT_B >= 1) {
            return 0;
        } else {
            if (BIT_A >= 1 || BIT_B >= 1) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    public static char XNOR(char BIT_A, char BIT_B) {
        if (BIT_A >= 1 && BIT_B >= 1) {
            return 1;
        } else {
            if (BIT_A >= 1 || BIT_B >= 1) {
                return 0;
            } else {
                return 1;
            }
        }
    }

    public static char AND(char BIT_A, char BIT_B) {
        if (BIT_A >= 1 && BIT_B >= 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public static char NAND(char BIT_A, char BIT_B) {
        if (BIT_A >= 1 && BIT_B >= 1) {
            return 0;
        } else {
            return 1;
        }
    }

    public static char NOT(char BIT) {
        if (BIT >= 1) {
            return 0;
        } else {
            return 1;
        }
    }
}
