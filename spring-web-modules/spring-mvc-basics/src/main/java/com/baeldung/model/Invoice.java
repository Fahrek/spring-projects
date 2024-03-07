package com.baeldung.model;

public class Invoice {

    private String invoiceNumber;
    private String customerName;
    private String concept;
    private double amount;
    private double retentionPercentage;

    public Invoice () {

    }

    public Invoice(String invoiceNumber, String customerName, String concept, double amount, double retentionPercentage) {
        this.invoiceNumber = invoiceNumber;
        this.customerName = customerName;
        this.concept = concept;
        this.amount = amount;
        this.retentionPercentage = retentionPercentage;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getRetentionPercentage() {
        return retentionPercentage;
    }

    public void setRetentionPercentage(double retentionPercentage) {
        this.retentionPercentage = retentionPercentage;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceNumber='" + invoiceNumber + '\'' +
                ", customerName='" + customerName + '\'' +
                ", concept='" + concept + '\'' +
                ", amount=" + amount +
                ", retentionPercentage=" + retentionPercentage +
                '}';
    }
}
