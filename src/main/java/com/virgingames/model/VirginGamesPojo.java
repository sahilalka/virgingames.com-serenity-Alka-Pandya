package com.virgingames.model;

public class VirginGamesPojo {
static int id;
static String name;
static double amount;
static String currency;

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        VirginGamesPojo.id = id;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        VirginGamesPojo.name = name;
    }

    public static double getAmount() {
        return amount;
    }

    public static void setAmount(double amount) {
        VirginGamesPojo.amount = amount;
    }

    public static String getCurrency() {
        return currency;
    }

    public static void setCurrency(String currency) {
        VirginGamesPojo.currency = currency;
    }
}
