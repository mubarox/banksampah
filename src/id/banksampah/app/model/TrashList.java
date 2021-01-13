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
public class TrashList {
    public int Price;
  public String Type, Code;
  
  //SETTER
  public void setCode(String code) {
    this.Code = code;
  }

  public void setType(String type) {
    this.Type = type;
  }

  public void  setPrice(int price) {
    this.Price = price;
  }

 

  //GETTER
  public String getCode() {
    return Code;
  }
  
  public int getPrice() {
    return Price;
  }
  
  public String getType() {
    return Type;
  }
}

