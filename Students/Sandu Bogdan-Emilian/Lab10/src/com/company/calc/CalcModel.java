package com.company.calc;

// CalcModel.java
// Fred Swartz - December 2004
// Model
// This model is completely independent of the user interface.
// It could as easily be used by a command line or web interface.
import java.math.BigInteger;

public class CalcModel {
    //... Constants
    private static final String INITIAL_VALUE = "1";

    //... Member variable defining state of calculator.
    private BigInteger m_total; // The total current value state.

    //============================================================== constructor
    /** Constructor */
    CalcModel() {
        reset();
    }

    //==================================================================== reset
    /** Reset to initial value. */
    public void reset() {
        m_total = new BigInteger(INITIAL_VALUE);
    }

    //=============================================================== multiplyBy
    /** Multiply current total by a number.
     *@param operand Number (as string) to multiply total by.
     */
    public void multiplyBy(String operand) {
        m_total = m_total.multiply(new BigInteger(operand));
    }

    //================================================================= setValue
    /** Set the total value.
     *@param value New value that should be used for the calculator total.
     */
    public void setValue(String value) {
        m_total = new BigInteger(value);
    }

    //================================================================= getValue
    /** Return current calculator total. */
    public String getValue() {
        return m_total.toString();
    }
}
