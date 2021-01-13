/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.banksampah.app.model;

/**
 *
 * @author user
 */
public class Customer {
  int Amount, Deposit;
  TrashList trashlist;
  
  //SETTER
  public void setTrashList(TrashList trashlist) {
      this.trashlist = trashlist; 
  }
  
  public void setAmount(int amount) {
    this.Amount = amount;
  }

  public void setDeposit(int deposit) {
    this.Deposit = deposit;
  }
  
  //GETTER
     public TrashList getTrashList() {
    return trashlist; 
  }
   
    public int getAmount() {
    return Amount;
  }
  
    public int getDeposit() {
    return Deposit;
  }



  
} 


