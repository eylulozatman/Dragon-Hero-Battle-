/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hero;

/**
 *
 * @author DELL
 */
public class Hero {
    
    String name;
    weapon weapon;
    int hp;
    Armor armor;
    public Hero(String name, weapon weapon,Armor armor)
    {
        this.name = name;
        this.weapon = weapon;
        this.hp = 2000 + armor.getDef();
    }

    public Armor getArmor()
    {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(weapon weapon) {
        this.weapon = weapon;
    }
    
}
