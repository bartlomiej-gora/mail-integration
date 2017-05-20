package pl.bgora.mail.integration;

public class EmailData {

    private String subject;

    private String from;

    private String message;

    public EmailData(String subject, String from, String message) {
        this.subject = subject;
        this.from = from;
        this.message = message;
    }

    public String getSubject() {
        return subject;
    }

    public String getFrom() {
        return from;
    }

    public String getMessage() {
        return message;
    }
}
