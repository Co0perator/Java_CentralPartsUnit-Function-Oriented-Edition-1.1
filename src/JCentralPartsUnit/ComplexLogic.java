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

public class ComplexLogic {

    public static char[] ADD(char BIT_A, char BIT_B, char CARRY_IN) {
        char C_OUT = 0;
        char OUT = 0;
        int bits = BIT_A + BIT_B + CARRY_IN;
        switch (bits) {
            case 1: {
                OUT = 1;
                break;
            }
            case 2: {
                C_OUT = 1;
                break;
            }
            case 3: {
                C_OUT = 1;
                OUT = 1;
                break;
            }
        }
        return new char[]{OUT, C_OUT};
    }

    public static char[] HALF_ADD(char BIT_A, char BIT_B) {
        int bits = BIT_A + BIT_B;
        char OUT = 0;
        char C_OUT = 0;
        switch (bits) {
            case 1: {
                OUT = 1;
                break;
            }
            case 2: {
                C_OUT = 1;
                break;
            }
        }
        return new char[]{OUT, C_OUT};
    }

    public static char[] TWO_COMP(char[] BYTE) {
        char[] output = new char[BYTE.length];
        char[] halfOut = new char[2];
        char carry = 1;
        for (int i = 0; i < BYTE.length; i++) {
            halfOut = HALF_ADD(BYTE[i], carry);
            output[i] = halfOut[0];
            carry = halfOut[1];
        }
        return output;
    }
}
