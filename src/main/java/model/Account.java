package model;

import java.math.BigDecimal;

public class Account {
    private long id;
    private String account_number;
    private BigDecimal currency;

    public Account(long id, String account_number, BigDecimal currency) {
        this.id = id;
        this.account_number = account_number;
        this.currency = currency;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public BigDecimal getCurrency() {
        return currency;
    }

    public void setCurrency(BigDecimal currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return  id +
                ", account number='" + account_number + '\'' +
                ", currency=" + currency +
                '}';
    }
}
