package nyan;

public class Main {

    public static void main(String[] args) {

        Encryptor encryptor = new Encryptor("RayhanHamada");
        System.out.println(encryptor.encrypt());

        Decryptor decryptor = new Decryptor("MeOwwMeOWwmeoWWMEOwwMEOwWmeoWWmeowWMEoWWMeOwwMeowWMeowwMEOwWMeOWWmeowWMEowWmeOWwmeoW");
        System.out.println(decryptor.decrypt());
    }
}
