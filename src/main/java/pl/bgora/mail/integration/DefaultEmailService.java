package pl.bgora.mail.integration;

import org.springframework.stereotype.Service;

@Service
public class DefaultEmailService implements EmailService {


    @Override
    public EmailData handleEmail(EmailData emailData) {
        return null;
    }
}
