/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.K2600143.ecoride;

/**
 *
 * @author arunagamage
 */
public class K2600143_Customer {
    private String nicOrPassport;
    private String name;
    private String contact;
    private String email;

    public K2600143_Customer(String nicOrPassport, String name, String contact, String email) {
        this.nicOrPassport = nicOrPassport;
        this.name = name;
        this.contact = contact;
        this.email = email;
    }

    public String getName() { return name; }

    public void displayInfo() {
        System.out.println("Customer: " + name + " (" + nicOrPassport + ")");
    }
}

