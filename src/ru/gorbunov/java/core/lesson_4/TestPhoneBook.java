package ru.gorbunov.java.core.lesson_4;

public class TestPhoneBook {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();
        pb.AddInstance("Art", "123123");
        pb.AddInstance("Bart", "123321");
        pb.AddInstance("Bart", "232343");
        pb.AddInstance("Bart", "2342344");
        pb.AddInstance("Pall", "23234432");
        pb.AddInstance("Matt", "1233213");
        pb.AddInstance("Matt", "23424332");

        pb.GetAllSimilar("Bart");
        System.out.println(pb.toString());
    }
}
