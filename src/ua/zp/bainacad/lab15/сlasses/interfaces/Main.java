package ua.zp.bainacad.lab15.сlasses.interfaces;

public class Main {
    public static void main(String[] args) {

        SmartPhone smartPhone = new SmartPhone();
        smartPhone.call();
        smartPhone.sendMail(smartPhone.editMail(smartPhone.createMail("qwerty")));
        System.out.println();

        DialPhone dialPhone = new DialPhone();
        dialPhone.call();
        System.out.println();

        Post post = new Post();
        post.sendMail(post.createMail("йцукен"));
        System.out.println();

        sendAllMails("Some text of mail", smartPhone, post);
    }

    public static void sendAllMails(String someText, MailSender... mailSenders) {
        for (MailSender sender : mailSenders) {
            sender.sendMail(sender.createMail(someText));
        }
    }
}
