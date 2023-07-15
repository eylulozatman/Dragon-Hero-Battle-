package factories;

import Types.DragonEnum;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author DELL
 */
public interface DragonFactory {
    
    
    public String elementName();
    public String CreateSkinColor();
    public String CreateWings();

    public String CreatePower(int power);

    public String CreateSkinColor1(DragonEnum e);

    public int createHP();

    public int CreateUlti();

    
}
