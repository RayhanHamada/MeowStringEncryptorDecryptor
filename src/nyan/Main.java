package nyan;

import java.sql.SQLOutput;

public class Main {

    private static String result;

    public static void main(String[] args) {

        Encryptor encryptor = new Encryptor("RayhanHamada");
        System.out.println(encryptor.encrypt());

        Decryptor decryptor = new Decryptor("MeOwwMeOWwmeoWWMEOwwMEOwWmeoWWmeowWMEoWWMeOwwMeowWMeowwMEOwWMeOWWmeowWMEowWmeOWwmeoW");
        System.out.println(decryptor.decrypt());
    }
}
