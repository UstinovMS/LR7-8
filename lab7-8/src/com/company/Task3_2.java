package com.company;

public class Task3_2 {
    public static void main(String[] args) {

        Type1[] types = Type1.values();
        for (Type1 s : types) { System.out.println(s); }
    }
}
enum Type1
{
    SCIENCE,
    BELLETRE,
    PHANTASY,
    SCIENCE_FICTION
}


