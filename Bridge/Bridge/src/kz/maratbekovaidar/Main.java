package kz.maratbekovaidar;

public class Main {
    public static void main(String[] args) {
        Program[] programs = {
                new BankingSystem(new PythonDeveloper()),
                new TelegramBot(new JavaDeveloper())
        };

        for (Program program: programs) {
            program.develop();
        }
    }
}
