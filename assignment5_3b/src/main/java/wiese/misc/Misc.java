package wiese.misc;

import java.util.UUID;

public class Misc {

    public static String generateId() {
        return UUID.randomUUID().toString();
    }
}
