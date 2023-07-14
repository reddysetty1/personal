package com.example.Bank.Model;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Table;

@Table(name = "accounts")
@Embeddable
@AttributeOverrides(
    {
        
        @AttributeOverride(name = "savingsAccount", column = @Column(name = "savings_account")),
        @AttributeOverride(name = "assets", column = @Column(name = "assets")),
        @AttributeOverride(name = "LoanAccount", column = @Column(name = "loan_account")),
        @AttributeOverride(name = "liabilities", column = @Column(name = "liabilities"))
    }
)
public class accounts 
{
    
    
    private boolean savingsAccount;
    private double assets;
    private boolean LoanAccount;
    private double liabilities;

    
    

    public accounts( boolean savingsAccount, double assets, boolean loanAccount, double liabilities) {
        this.savingsAccount = savingsAccount;
        this.assets = assets;
        LoanAccount = loanAccount;
        this.liabilities = liabilities;
    }


    public boolean isSavingsAccount() {
        return savingsAccount;
    }

    public void setSavingsAccount(boolean savingsAccount) {
        this.savingsAccount = savingsAccount;
    }

    public double getAssets() {
        return assets;
    }

    public void setAssets(double assets) {
        this.assets = assets;
    }

    public boolean isLoanAccount() {
        return LoanAccount;
    }

    public void setLoanAccount(boolean loanAccount) {
        LoanAccount = loanAccount;
    }

    public double getLiabilities() {
        return liabilities;
    }

    public void setLiabilities(double liabilities) {
        this.liabilities = liabilities;
    }

    public accounts() {
    }

    
}

