package com.framework;

public class NormalAcc extends ShopAcc {
    private static final float deliveryCharges = 5.0f;

    public NormalAcc(int accNo, String accNm, float charges) {
        super(accNo, accNm, charges);
    }

    @Override
    public void bookProduct(float amount) {
        float totalAmount = amount + getCharges() + deliveryCharges;
        System.out.println("Amount with Tax & delivery charges: " + totalAmount);
    }

    @Override
    public String toString() {
        return super.toString() + ", Delivery Charges: " + deliveryCharges;
    }
}
