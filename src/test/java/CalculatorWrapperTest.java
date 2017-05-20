import org.junit.Test;
import pl.bgora.mail.integration.CalculatorWrapper;
import pl.bgora.mail.integration.DefaultCalculatorWrapper;
import pl.bgora.rpn.exceptions.NoSuchFunctionFound;
import pl.bgora.rpn.exceptions.WrongArgumentException;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class CalculatorWrapperTest {

    @Test
    public void shouldReturnValue() throws WrongArgumentException, NoSuchFunctionFound {

        CalculatorWrapper calculatorWrapper = new DefaultCalculatorWrapper();
        BigDecimal result = calculatorWrapper.calculate("Calculate:1+2");

        assertEquals(BigDecimal.valueOf(3), result);
    }
}
