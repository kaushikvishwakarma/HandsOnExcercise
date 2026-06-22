package DecoratorPatternExample;

public class Main {
    public static void main(String[] args) {
        Notifier notifier = new SlackNotifierDecorator(new SMSNotifierDecorator(new EmailNotifier()));
        notifier.send("New notification sent");
    }
}
