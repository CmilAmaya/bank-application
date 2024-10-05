package com.bank.demo;

import java.util.Scanner;

public class BankLogic {
    Scanner sc = new Scanner(System.in);
    private float amount = 0;
    public boolean run() {
        System.out.println("Bienvenido al Banco Cochinito feliz :3");
        int option;
        do {
            display_menu();
            option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    amount = create_account();
                    break;
                case 2:
                    display_balance();
                    break;
                case 3:
                    withdraw_money();
                    break;
                case 4:
                    deposit_money();
                    break;
                case 5:
                    System.out.println("Adiós, vuelve pronto :)");
                    return false;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (true);
    }
    public void display_menu() {
        System.out.println("****************************************************************************************");
        System.out.println("** Escriba el número de la opción que desea seleccionar y presione Enter:            **");
        System.out.println("1 - Crear cuenta");
        System.out.println("2 - Consultar saldo");
        System.out.println("3 - Retirar dinero");
        System.out.println("4 - Depositar dinero");
        System.out.println("5 - Salir");
    }

    public float create_account() {
        System.out.println("Creando cuenta...");
        System.out.println("Escriba su nombre completo:");
        String name = sc.nextLine();
        System.out.println("Ingrese un monto inicial:");
        float amount = sc.nextFloat();
        sc.nextLine();
        System.out.println("Cuenta creada con éxito");
        return amount;
    }

    public void display_balance() {
        System.out.println("Su saldo actual es de: " + amount);
    }

    public void withdraw_money() {
        System.out.println("Escriba el monto que desea retirar:");
        sc.nextLine();
        float amount_withdraw = sc.nextFloat();
        if (amount_withdraw > amount) {
            System.out.println("No tiene suficiente saldo :(");
        } else {
            amount -= amount_withdraw;
            System.out.println("Ha retirado " + amount_withdraw + " su saldo actual es de: " + amount);
        }
    }

    public void deposit_money() {
        System.out.println("Escriba el monto que desea depositar:");
        sc.nextLine();
        float amount_deposit = sc.nextFloat();
        amount += amount_deposit;
        System.out.println("Ha depositado " + amount_deposit + " su saldo actual es de: " + amount);
    }
}
