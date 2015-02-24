/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hotel;

/**
 *
 * @author anurag
 */
public class Guest {
    private String mobile;
    private String name;
    private String address;
    private String email;
    private String dob;
    private String doa;
    private double amount;
    private String doci;

    public String getDoci() {
        return doci;
    }

    public void setDoci(String doci) {
        this.doci = doci;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDoa() {
        return doa;
    }

    public void setDoa(String doa) {
        this.doa = doa;
    }

    @Override
    public String toString() {
        return "Guest{" + "mobile=" + mobile + ", name=" + name + ", email=" + email + ", dob=" + dob + ", doa=" + doa + '}';
    }
    
    
    
}
