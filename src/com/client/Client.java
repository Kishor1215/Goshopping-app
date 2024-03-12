package com.client;

import com.application.GSShopFactory;
import com.framework.*;

public class Client {
    public static void main(String[] args) {
        ShopFactory shopFactory = new GSShopFactory();
        System.out.println("\n" + "Item details - for item no 1 which has amount= " + 100.0f + "\n");

        PrimeAcc primeAcc = shopFactory.getNewPrimeAccount(1, "John Doe", 20.0f, true);
        NormalAcc normalAcc = shopFactory.getNewNormalAccount(2, "David Roth", 20.0f);

        System.out.println("Booking product for Prime Account.");
        System.out.println(primeAcc.toString());
        primeAcc.bookProduct(100.0f);

        System.out.println("\n");
        System.out.println("Booking product for Normal Account.");
        System.out.println(normalAcc.toString());
        normalAcc.bookProduct(100.0f);

    }
}
