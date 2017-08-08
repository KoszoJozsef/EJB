/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.ejb;

import javax.ejb.Stateless;

/**
 *
 * @author K
 */
@Stateless
public class StatelessBean {

    private int number = 123;
    private String str = "abc";

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "StatelessBean{" + "number=" + number + ", str=" + str + '}';
    }
    
}
