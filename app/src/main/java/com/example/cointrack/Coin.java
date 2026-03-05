package com.example.cointrack;

public class Coin {
    private String name;
    private String symbol;
    private double currentPrice;

    public Coin(String name, String symbol, double currentPrice){
        this.name = name;
        this.symbol = symbol;
        this.currentPrice = currentPrice;
    }

    public String getName(){
        return name;
    }
    public String getSymbol(){
        return symbol.toUpperCase();
    }

    public double getCurrentPrice() {
        return currentPrice;
    }
}
