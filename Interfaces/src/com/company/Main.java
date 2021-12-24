package com.company;

public class Main {

    public static void main(String[] args) {
	ITelephone myPhone = new DeskPhone(123456);
    myPhone.powerOn();
    myPhone.callPhone(123456);
    myPhone.answer();

    myPhone = new MobilePhone(987665);
    myPhone.powerOn();
    myPhone.callPhone(987665);
    myPhone.answer();

    }
}
