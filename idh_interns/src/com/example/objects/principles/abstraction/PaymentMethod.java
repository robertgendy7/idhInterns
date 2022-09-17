package com.example.objects.principles.abstraction;



public interface PaymentMethod {

    boolean pay(double amount);
}


class PaymobPaymentMethod implements PaymentMethod{

    @Override
    public boolean pay(double amount) {
        if(amount == 0 || amount<0)
            return false ;

        System.out.println("Paying through Paymob , amount: "+amount);
        return true;
    }
}


class FawryPaymentMethod implements PaymentMethod{

    @Override
    public boolean pay(double amount) {
        if(amount == 0 || amount<0)
            return false ;

        System.out.println("Paying through Fawry , amount: "+amount);
        return true;
    }
}
