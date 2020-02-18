/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsu.finalproject.models;

/**
 *
 * @author chiquillo
 */
public class ShoppingCart {

    private int idshoppingcart;
    private int productid;
    private int userid;
    private int quantity;

    public ShoppingCart(int productid, int userid, int quantity) {
        this.productid = productid;
        this.userid = userid;
        this.quantity = quantity;
    }

    public ShoppingCart(int idshoppingcart, int productid, int userid, int quantity) {
        this.idshoppingcart = idshoppingcart;
        this.productid = productid;
        this.userid = userid;
        this.quantity = quantity;
    }

    public int getIdshoppingcart() {
        return idshoppingcart;
    }

    public void setIdshoppingcart(int idshoppingcart) {
        this.idshoppingcart = idshoppingcart;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
