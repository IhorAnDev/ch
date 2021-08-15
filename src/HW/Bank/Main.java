package HW.Bank;

import HW.Bank.Entity.Account;
import HW.Bank.Entity.Bill;
import HW.Bank.Entity.Person;
import HW.Bank.Services.DepositService;
import HW.Bank.Services.PaymentService;
import HW.Bank.Services.TransferService;

public class Main {
    public static void main(String[] args) {
        Person luisPerson = new Person("Luis", "Figurov", "0978333367");
        Bill luisSchet = new Bill(11000);
        Account luisAccount = new Account(luisSchet, luisPerson);

        Person borisPerson = new Person("Boris", "Britva", "0639876532");
        Bill borisSchet = new Bill(15000);
        Account borisAccount = new Account(borisSchet, borisPerson);

//        PaymentService paymentService = new PaymentService();
//        paymentService.pay(luisAccount,800);
//        paymentService.pay(borisAccount,600);

//        DepositService depositService = new DepositService();
//        depositService.deposit(luisAccount,1200);
//        depositService.deposit(borisAccount,200);

        TransferService transferService = new TransferService();
        transferService.transfer(luisAccount,borisAccount,1300);
    }

}
