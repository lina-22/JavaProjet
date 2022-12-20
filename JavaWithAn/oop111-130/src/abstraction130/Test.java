package abstraction130;

public class Test {

    public static void main(String[] args) {
        MobileUser mu;

        mu = new Rahim();
        mu.call();
        mu.sendMessage();

        mu = new Karim();
        mu.sendMessage();
    }

}
