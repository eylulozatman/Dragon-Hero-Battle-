/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Types;

import factories.DragonFactory;

/**
 *
 * @author DELL
 */
public class CruelDragon extends Dragon{
    
      DragonFactory dragonFactory;

    public CruelDragon(DragonFactory dragonFactory) {
        this.dragonFactory = dragonFactory;
    }

    @Override
    public void GetDragonProperties()
    {
      
        setElement(dragonFactory.elementName());
        setDragonType("Furious");
        setWings(dragonFactory.CreateWings());
        setSkinColor(dragonFactory.CreateSkinColor1(DragonEnum.Furious));
        setPower(dragonFactory.CreatePower(80));
        setHp(dragonFactory.createHP());
        setUltiAttack(dragonFactory.CreateUlti());



    }
    
}
