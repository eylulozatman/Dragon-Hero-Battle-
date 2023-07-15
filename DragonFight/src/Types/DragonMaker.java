/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Types;

import Types.Dragon;
import dragonfight.SelectTypeScreen;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public abstract class DragonMaker 
        
       
{
      public abstract Dragon createDragon(int DragonType);

     

       Dragon dragon;

       public Dragon getDragon() {
              return dragon;
       }

       public  Dragon selectDetails(int type)
       {
              dragon = createDragon(type);
              dragon.GetDragonProperties();
             return dragon;
       }
       
    
}
