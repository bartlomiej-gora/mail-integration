package pl.bgora.mail.integration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.mail.MailHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import pl.bgora.rpn.Calculator;
import pl.bgora.rpn.exceptions.NoSuchFunctionFound;
import pl.bgora.rpn.exceptions.WrongArgumentException;

import javax.annotation.Resource;
import java.math.BigDecimal;

@Service
public class DefaultEmailService implements EmailService {

    @Resource
    MessageChannel outboundMailChannel;

    @Autowired
    CalculatorWrapper calculatorWrapper;

    @Override
    public void handleEmail(EmailData emailData) throws WrongArgumentException, NoSuchFunctionFound {
        String input = emailData.getSubject();
        BigDecimal result = calculatorWrapper.calculate(input);
        Message<String> message = getMessage(emailData, result);
        outboundMailChannel.send(message);

    }

    private Message<String> getMessage(EmailData emailData, BigDecimal result) {
        MessageBuilder<String> builder =  MessageBuilder.withPayload(result.toString())
        .setHeader(MailHeaders.TO, emailData.getFrom())
        .setHeader(MailHeaders.SUBJECT, emailData.getSubject());
        return builder.build();
    }
}
