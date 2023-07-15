/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dragonfight;

import Hero.Hero;
import Types.Dragon;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author DELL
 */
public class FightScreen extends javax.swing.JFrame {

    /**
     * Creates new form FightScreen
     */
    Dragon dragon;
    Hero hero;
    Random random = new Random();
    Random chooseChar = new Random();
    Random powerType = new Random();
    int damageNum;
    int Char;
    int powertyp;
    
    
    public FightScreen(Dragon dragon, Hero hero) 
    {
        initComponents();
        this.dragon = dragon;
        this.hero = hero;
        setIcons();
       
     
       
    }
    
    public final void startfight()
    {
       

        if(hero.getHp() > 0 && dragon.getHp() > 0)
        {
             damageNum =  random.nextInt(5); // select damage number
             Char =  chooseChar.nextInt(2); // select character
             powertyp = powerType.nextInt(4);
            if (Char == 0)// dragon attack
            {
                if (powertyp == 1)
                {
                   dragonUlti(dragon,hero);
                }
                else
                {
                   dragonAttack(dragon,hero);
                }

            }
            else  // hero attack
            {
                if (powertyp == 1)
                {
                     heroUlti(dragon,hero);
                }
                else
                {
                    heroAttack(dragon,hero);
                }


            }
        }
       else if (hero.getHp() <= 0)
        {

            finallbl.setText(" dragon wins");
        }
        else
        {
             finallbl.setText(hero.getName() + " wins");
        }

    }

    public void heroUlti(Dragon dragon, Hero hero)
    {
        lbl1.setText("**** ULTI ATTACK *****");
        lbl2.setText(hero.getName() + " attack " + damageNum + " times");
        int damage = hero.getWeapon().getUltiPower()* damageNum;
        lbl3.setText("damage " + damage);
        dragon.setHp(dragon.getHp()- damage);
       
    }
    public void heroAttack(Dragon dragon, Hero hero)
    {
        lbl1.setText(" ");
        lbl2.setText(hero.getName() + " attack " + damageNum + " times");
        int damage = hero.getWeapon().getPower() * damageNum;
        lbl3.setText( "damage"  + damage);
        dragon.setHp(dragon.getHp()- damage);
        //  System.out.println("remaining hp" + dragon.getHp());
        
    }
    public void dragonUlti(Dragon dragon, Hero hero)
    {
        lbl1.setText("**** ULTI ATTACK *****");
        lbl2.setText( dragon.getElement() + " " + dragon.getDragonType() + " attack " + damageNum + " times ");
        int damage =(dragon.getUltiAttack()) * damageNum;
        lbl3.setText( "damage " + damage);
        hero.setHp(hero.getHp() - damage);
        // System.out.println("remaining hp" + hero.getHp());
       
    }
    public void dragonAttack(Dragon dragon, Hero hero)
    {
        lbl1.setText(" ");
        lbl2.setText(  dragon.getElement() + " " + dragon.getDragonType() + " attack " + damageNum + " times ");
        int damage = Integer.parseInt(dragon.getPower()) * damageNum;
        lbl3.setText( "damage " + damage);
        hero.setHp(hero.getHp() - damage);
        // System.out.println("remaining hp" + hero.getHp());
       
    }

    
    


        
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl1 = new javax.swing.JLabel();
        finallbl = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        icon2 = new javax.swing.JLabel();
        icon1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        lbl1.setForeground(new java.awt.Color(153, 0, 0));
        lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl1.setText(".");

        finallbl.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        finallbl.setForeground(new java.awt.Color(102, 0, 0));
        finallbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        finallbl.setText("...");
        finallbl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        finallbl.setFocusable(false);
        finallbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lbl2.setBackground(new java.awt.Color(101, 80, 25));
        lbl2.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lbl2.setForeground(new java.awt.Color(102, 51, 0));
        lbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl2.setText(".");
        lbl2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 0), 3, true));
        lbl2.setFocusable(false);
        lbl2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lbl3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        lbl3.setForeground(new java.awt.Color(51, 51, 51));
        lbl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl3.setText(".");

        jButton1.setBackground(new java.awt.Color(153, 51, 0));
        jButton1.setFont(new java.awt.Font("Verdana", 1, 32)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setText("attack");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        icon2.setBackground(new java.awt.Color(204, 204, 204));
        icon2.setText(".");
        icon2.setPreferredSize(new java.awt.Dimension(70, 16));

        icon1.setBackground(new java.awt.Color(204, 204, 204));
        icon1.setText(".");
        icon1.setPreferredSize(new java.awt.Dimension(70, 16));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 102, 0));
        jButton2.setText("new game");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(icon1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(finallbl, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(icon2, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jButton2)
                        .addGap(114, 114, 114))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(249, 249, 249))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(icon1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(icon2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(finallbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, Short.MAX_VALUE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       startfight();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CreateDragonScreen newgame = new  CreateDragonScreen();
        this.dispose();
        newgame.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

  
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel finallbl;
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel icon2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    // End of variables declaration//GEN-END:variables

    private void setIcons() {
        switch (dragon.getElement()) {
            case "FIRE":
                ImageIcon img = new ImageIcon("src/images/reddragon.png");
                icon1.setIcon(img);
                break;
            case "ICE":
                ImageIcon img1 = new ImageIcon("src/images/icedragon.png");
                icon1.setIcon(img1);
                break;
            default:
                ImageIcon img2 = new ImageIcon("src/images/thunder1.png");
                icon1.setIcon(img2);
                break;
        }
        
        switch(hero.getWeapon().getName())
        {
            case "sword":
                ImageIcon imgHero = new ImageIcon("src/images/hero.png");  
            icon2.setIcon(imgHero);
                break;
                
            case "hammer":
                ImageIcon imgHero2 = new ImageIcon("src/images/hero2.png");  
            icon2.setIcon(imgHero2);
            break;
        }
        
        
    }
}
