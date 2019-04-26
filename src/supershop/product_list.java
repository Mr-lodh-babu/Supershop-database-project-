/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supershop;

/**
 *
 * @author Shawon
 */
public class product_list {
    private String name;
   // private String catagory;
    private double vat;
    private double price;
    private String supplier_company;
   // private String description;
    private String seller_name;

    public product_list(String name, double vat, double price, String supplier_company, String seller_name) {
        this.name = name;
        //this.catagory = catagory;
        this.vat = vat;
        this.price = price;
        this.supplier_company = supplier_company;
        //this.description = description;
        this.seller_name = seller_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    /*
    public String getCatagory() {
        return catagory;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }
    */
    public double getVat() {
        return vat;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }

    public double getprice() {
        return price;
    }

    public void setprice(double original_price) {
        this.price = original_price;
    }
    
    
    
/*
    public double getPack_price() {
        return pack_price;
    }

    public void setPack_price(double pack_price) {
        this.pack_price = pack_price;
    }
    */
    public String getsupplier_company() {
        return supplier_company;
    }

    public void setsupplier_company(String supplier_company) {
        this.supplier_company = supplier_company;
    }
    /*
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    } 
   */
    public String getseller_name() {
        return seller_name;
    }

    public void setseller_name(String supplier_company) {
        this.seller_name = seller_name;
    }
}
