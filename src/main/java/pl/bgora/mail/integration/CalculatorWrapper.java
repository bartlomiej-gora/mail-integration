package pl.bgora.mail.integration;

import pl.bgora.rpn.exceptions.NoSuchFunctionFound;
import pl.bgora.rpn.exceptions.WrongArgumentException;

import java.math.BigDecimal;


public interface CalculatorWrapper {


    BigDecimal calculate(String input) throws WrongArgumentException, NoSuchFunctionFound;
}
