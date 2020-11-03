package br.edu.infnet.clonegmailui;


public class EmailItem {

    private String sender;
    private String subject;
    private String brief;
    private String date;
    private boolean isImportant = false;

    public EmailItem(String sender, String subject, String brief, String date) {
        this.sender = sender;
        this.subject = subject;
        this.brief = brief;
        this.date = date;
    }

    public EmailItem(String sender, String subject, String brief, String date, boolean isImportant) {
        this.sender = sender;
        this.subject = subject;
        this.brief = brief;
        this.date = date;
        this.isImportant = isImportant;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isImportant() {
        return isImportant;
    }

    public void setImportant(boolean important) {
        isImportant = important;
    }

    public static EmailItem[] samples(){
        //Retorna um vetor de exemplos de ítens
        EmailItem[] emails = {
                new EmailItem("Christian", "Hi",
                        "Hello, Nice to meet you!", "11:22 PM"),
                new EmailItem("Roger", "Hi",
                        "Hello, Nice to meet you!", "10:30 PM"),
                new EmailItem("Maria", "Hi",
                        "Hello, Nice to meet you!", "9:41 PM"),
                new EmailItem("Lucas", "Hi",
                        "Hello, Nice to meet you!", "9:35 PM"),
                new EmailItem("Bernardo", "Hi",
                        "Hello, Nice to meet you!", "7:56 PM"),
                new EmailItem("Costa", "Hi",
                        "Hello, Nice to meet you!", "6:12 PM"),
                new EmailItem("Pedro", "Hi",
                        "Hello, Nice to meet you!", "2:46 PM"),
                new EmailItem("Luiz", "Hi",
                        "Hello, Nice to meet you!", "2:37 PM"),
                new EmailItem("Mayna", "Hi",
                        "Hello, Nice to meet you!", "9:30 AM"),
                new EmailItem("Igor", "Hi",
                        "Hello, Nice to meet you!", "8:50 AM"),
                new EmailItem("Marcos", "Hi",
                        "Hello, Nice to meet you!", "7:30 AM"),
                new EmailItem("Elizabeth", "Hi",
                        "Hello, Nice to meet you!", "6:00 AM"),
        };

        return emails;
    }
}
