package com.example.petshop;

public class Sad extends Mood {
    public Sad() {
        super("sad");
    }

    @Override
    public String express() {
        return "The pet is feeling angry!";
    }
}
