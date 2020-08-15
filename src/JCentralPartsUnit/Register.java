package JCentralPartsUnit;

import java.util.Arrays;

public class Register {
    String name;
    char[] value;
    boolean inputEnable = false;
    boolean outputEnable = false;

    Register(int size, String name) {
        this.name = name;
        if (size <= 0) {
            System.err.println("Cannot make register of size < 1");
            System.exit(0);
        } else {
            this.value = new char[size];
            Arrays.fill(this.value, (char) 0);
        }
    }

    public void erase() { //sets all bits to zero
        Arrays.fill(this.value, (char) 0);
    }

    public void setValue(char[] new_value) { //sets a value to the register
        if (inputEnable) {
            if (new_value.length == this.value.length)
                System.arraycopy(new_value, 0, this.value, 0, this.value.length);
            else
                System.err.printf("Cannot set value to %s, byte lengths do not match!\r\n", this.name);
        } else
            System.err.printf("Cannot set value to %s, input is disabled!\r\n", this.name);

    }

    public void setBit(int bit, char value) { //sets a specific bit high or low
        if (value > 1)
            System.err.println("Cannot set bits higher than 1!");
        else
            if (bit - 1 > this.value.length || bit <= 0)
                System.err.println("Cannot set that bit. Your index is too high!");
            else
                this.value[bit - 1] = value;
    }

    //this section is just enabling and disabling output and input to the register
    public void outputEnable() { outputEnable = true; }
    public void outputDisable() { outputEnable = false; }
    public void inputEnable() { inputEnable = true; }
    public void inputDisable() { inputEnable = false; }

    public char[] getValue() { if (outputEnable) return this.value; else return null;} //Gets the value of the register

    public char getBit(int bit) {
        if (bit - 1 > this.value.length || bit <= 0) {
            System.err.printf("Could not get bit, as bit %d does not exist! Returned 0.\r\n", bit);
            return 0;
        } else
            return this.value[bit - 1];
    }
}
