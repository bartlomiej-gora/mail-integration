package pl.bgora.mail.integration;

import org.springframework.integration.mail.transformer.AbstractMailMessageTransformer;
import org.springframework.integration.support.AbstractIntegrationMessageBuilder;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.stereotype.Component;


@Component("emailTransformer")
public class InboundEmailTransformer extends AbstractMailMessageTransformer<EmailData> {


    @Override
    protected AbstractIntegrationMessageBuilder<EmailData> doTransform(javax.mail.Message message) throws Exception {
        EmailData data = new EmailData(message.getSubject(), message.getFrom()[0].toString(), "");
        return MessageBuilder.withPayload(data);
    }
}
