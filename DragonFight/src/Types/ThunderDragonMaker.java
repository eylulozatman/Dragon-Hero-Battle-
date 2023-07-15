/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Types;

import Types.Dragon;
import factories.DragonFactory;
import factories.ThunderDragonFactory;


/**
 *
 * @author DELL
 */
public class ThunderDragonMaker extends DragonMaker {
    
     @Override
    public Dragon createDragon(int DragonType)
    {
        Dragon dragon = null;
        DragonFactory dragonFactoryThunder = new ThunderDragonFactory();
        if (DragonType == 1)
        {
            dragon = new CruelDragon(dragonFactoryThunder);
        }
        else if(DragonType == 2)
        {
            dragon = new PredatoryDragon(dragonFactoryThunder);
        }
        else if ((DragonType == 3))
        {
            dragon = new FuriousDragon(dragonFactoryThunder);
        }


        return dragon;
    }
    
}
