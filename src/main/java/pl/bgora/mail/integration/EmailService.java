package pl.bgora.mail.integration;

import pl.bgora.rpn.exceptions.NoSuchFunctionFound;
import pl.bgora.rpn.exceptions.WrongArgumentException;

public interface EmailService {

    void handleEmail(final EmailData emailData) throws WrongArgumentException, NoSuchFunctionFound;
}
