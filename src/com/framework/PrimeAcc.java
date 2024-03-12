package com.framework;

public class PrimeAcc extends ShopAcc {
    private final boolean isPrime;

    public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
        super(accNo, accNm, charges);
        this.isPrime = isPrime;
    }

    @Override
    public void bookProduct(float amount) {
        float totalAmount = amount + getCharges();
        System.out.println("Amount with Tax charges: " + totalAmount);
    }

    @Override
    public String toString() {
        return super.toString() + ", Prime Account: " + isPrime;
    }
}
