/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Types;

/**
 *
 * @author DELL
 */
public abstract class Dragon 
{
    
    int hp;
   String skinColor;
   String wings;
   String power;

   String Element;

   String DragonType;
   int ultiAttack ;

   public int getUltiAttack() {
      return ultiAttack;
   }

   public void setUltiAttack(int ultiAttack) {
      this.ultiAttack = ultiAttack;
   }

   public String getSkinColor() {
      return skinColor;
   }

   public void setSkinColor(String skinColor) {
      this.skinColor = skinColor;
   }

   public String getWings() {
      return wings;
   }

   public void setWings(String wings) {
      this.wings = wings;
   }

   public String getPower() {
      return power;
   }

   public String getElement() {
      return Element;
   }

   public void setElement(String element) {
      Element = element;
   }

   public String getDragonType() {
      return DragonType;
   }

   public void setDragonType(String dragonType) {
      DragonType = dragonType;
   }

   public void setPower(String power) {
      this.power = power;
   }

   public int getHp() {
      return hp;
   }

   public void setHp(int hp) {
      this.hp = hp;
   }

   public abstract void GetDragonProperties();

  
    
}
