package ru.starovoytov1725.forGit;

/**
 * Created by User on 017 17.06.20.
 */
public class SecondClass {

    private static int id;
    private static String name;

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        SecondClass.id = id;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        SecondClass.name = name;
    }

    @Override
    public String toString() {
        return "SecondClass{}";
    }
}
