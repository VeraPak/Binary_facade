package org.example;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        String itIs_23 = "10111";
        String itIs_7 = "111";

        System.out.println(bins.sum(itIs_7, itIs_23));
        System.out.println(bins.mult(itIs_7, itIs_23));

    }
}