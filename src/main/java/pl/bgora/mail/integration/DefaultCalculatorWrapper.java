package pl.bgora.mail.integration;

import org.springframework.stereotype.Component;
import pl.bgora.rpn.Calculator;
import pl.bgora.rpn.exceptions.NoSuchFunctionFound;
import pl.bgora.rpn.exceptions.WrongArgumentException;

import java.math.BigDecimal;

@Component
public class DefaultCalculatorWrapper implements CalculatorWrapper {


    public BigDecimal calculate(String input) throws WrongArgumentException, NoSuchFunctionFound {
        input = input.substring(10).trim();
        Calculator calc = Calculator.createDefaultCalculator();
        return calc.calculate(input);
    }
}
