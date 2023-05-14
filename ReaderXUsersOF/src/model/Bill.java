package model;

import java.util.Calendar;

public class Bill {

    private Calendar dateOperation;
    private double billValue;

    public Bill(Calendar dateOperation, double billValue){
        this.billValue=billValue;
        this.dateOperation= dateOperation;

    }

    public Calendar getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(Calendar dateOperation) {
        this.dateOperation = dateOperation;
    }

    public double getBillValue() {
        return billValue;
    }

    public void setBillValue(double billValue) {
        this.billValue = billValue;
    }
    
    
}
