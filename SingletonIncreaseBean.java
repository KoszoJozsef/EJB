/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.ejb;

import javax.ejb.Singleton;

/**
 *
 * @author K
 */
@Singleton
public class SingletonIncreaseBean {

    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    public void increase(){
        count++;
    }
}
