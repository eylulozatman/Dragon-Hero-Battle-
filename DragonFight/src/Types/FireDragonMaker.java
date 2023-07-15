package Types;

import factories.DragonFactory;
import factories.FireDragonFactory;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class FireDragonMaker extends DragonMaker{
    
     @Override
    public Dragon createDragon(int DragonType)
    {
        Dragon dragon = null;
       DragonFactory dragonFactoryFire = new FireDragonFactory();
       if (DragonType == 1)
       {
           dragon = new CruelDragon(dragonFactoryFire);
       }
       else if(DragonType == 2)
       {
           dragon = new PredatoryDragon(dragonFactoryFire);
       }
       else if ((DragonType == 3))
       {
         dragon = new FuriousDragon(dragonFactoryFire);
       }


       return dragon;
    }

    
}
