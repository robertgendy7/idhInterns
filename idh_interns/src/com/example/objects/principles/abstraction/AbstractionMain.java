package com.example.objects.principles.abstraction;

public class AbstractionMain {


    public static void main(String[] args) {
        payThroughFawry(50000);
    }


    public static void payThroughFawry(double amount){
        boolean isSuccess =doPayment(new FawryPaymentMethod(),1123312);
        System.out.println("Payment Process result: "+isSuccess);
    }


    public static void payThroughPaymob(double amount){
        boolean isSuccess =doPayment(new PaymobPaymentMethod(),1123312);
        System.out.println("Payment Process result: "+isSuccess);
    }



    public  static boolean  doPayment(PaymentMethod p,double amount){
       return p.pay(amount);  // late binding
                              // decides which pay method to call
                              // at runtime !
    }



}
