package DTO;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class DTO_Bill {
    private String bill_ID;
    private Date date;
    private Float total;
    private List<String> productLines=new ArrayList<>();

    public DTO_Bill(){}
    public DTO_Bill(String bill_ID, Date date, Float total, List<String> productLines) {
        this.bill_ID = bill_ID;
        this.date = date;
        this.total = total;
        this.productLines = productLines;
    }

    public String getBill_ID() {
        return bill_ID;
    }

    public void setBill_ID(String bill_ID) {
        this.bill_ID = bill_ID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public List<String> getProductLines() {
        return productLines;
    }

    public void setProductLines(List<String> productLines) {
        this.productLines = productLines;
    }
}
