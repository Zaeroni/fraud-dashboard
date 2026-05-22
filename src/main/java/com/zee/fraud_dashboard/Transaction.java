package com.zee.fraud_dashboard;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double amount;
    private boolean flagged;

    public Transaction() {} 

    public Transaction(int id, double amount, boolean flagged) {
        this.id = id;
        this.amount = amount;
        this.flagged = flagged;
    }

    public int getId() { return id; }
    public double getAmount() { return amount; }
    public boolean isFlagged() { return flagged; }
}