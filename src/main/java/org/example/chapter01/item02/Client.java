package org.example.chapter01.item02;

public class Client
{
    public static void main(String[] args) {
        FontFactory fontFactory = new FontFactory();
        Character character1 = new Character('h', "white", fontFactory.getFont("nanum:12"));
        Character character2 = new Character('h', "white", fontFactory.getFont("nanum:12"));


    }
}
