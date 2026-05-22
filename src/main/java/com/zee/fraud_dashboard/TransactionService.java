package com.zee.fraud_dashboard;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TransactionService {

    
    private final TransactionRepository transactionRepository;

    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    
    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

    
    public Transaction getTransactionById(int id) {
        return transactionRepository.findById(id).orElse(null);
    }
}