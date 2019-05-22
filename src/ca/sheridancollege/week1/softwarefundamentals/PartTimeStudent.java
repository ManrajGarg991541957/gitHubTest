/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 *
 * @author manra
 */
public class PartTimeStudent extends Student{  
    private int noOfHours; //Number of credit hours. 
    
    /** 
     * Subclass constructor 
     */
    public PartTimeStudent(String name, String stdID, int hours){
        super(name, stdID,);
        this.noOfHours = hours;
    }

    /**
     * @return the noOfHours
     */
    public int getNoOfHours() {
        return noOfHours;
    }

    /**
     * @param noOfHours the noOfHours to set
     */
    public void setNoOfHours(int noOfHours) {
        this.noOfHours = noOfHours;
    }
    
}
