/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Types;

import factories.DragonFactory;
import factories.IceDragonFactory;

/**
 *
 * @author DELL
 */
public class IceDragonMaker extends DragonMaker{
    
        @Override
    public Dragon createDragon(int DragonType) {
        Dragon dragon = null;
        DragonFactory dragonFactoryIce = new IceDragonFactory();
        if (DragonType == 1)
        {
            dragon = new CruelDragon(dragonFactoryIce);
        }
        else if(DragonType == 2)
        {
            dragon = new PredatoryDragon(dragonFactoryIce);
        }
        else if ((DragonType == 3))
        {
            dragon = new FuriousDragon(dragonFactoryIce);
        }



        return dragon;
    }
    
}
