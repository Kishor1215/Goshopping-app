package com.framework;

public abstract class ShopAcc {
    private final int accNo;
    private String accNm;
    private final float charges;

    public ShopAcc(int accNo, String accNm, float charges) {
        this.accNo = accNo;
        this.accNm = accNm;
        this.charges = charges;
    }

    public float getCharges() {
        return charges;
    }

    public abstract void bookProduct(float amount);

    public void items(float amount) {
        System.out.println("Item details - for item no 1 which has amount=" + amount);
    }

    @Override
    public String toString() {
        return "Account Number: " + accNo + ", Account Name: " + accNm + ", Tax Charges: " + charges;
    }
}
