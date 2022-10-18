package RVCE;

import CSE.*;

public class Isedept extends Thirdsem {
    @Override
    public void welcomeMessage()
    {
        System.out.println("welcome to cse-young budding engineers");
    }

    public static void main(String[] args) {
        Thirdsem cs=new Thirdsem();
        cs.welcomeMessage();
    }
}