//Copyright 2020 Miles Potter

// This file is part of CentralPartsUnit.
//
// CentralPartsUnit is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// CentralPartsUnit distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program.  If not, see <https://www.gnu.org/licenses/>.

package JCentralPartsUnit;

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
