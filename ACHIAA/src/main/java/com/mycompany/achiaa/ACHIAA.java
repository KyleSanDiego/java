/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.achiaa;
import java.util.Scanner;

/**
 *
 * @author CL3-PC16
 */
public class ACHIAA {

    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
        System.out.println("[1] - Snacks");
        System.out.println("[2] - Drinks");
     
        
        System.out.println("Enter your choice:");
        int ch1 = input.nextInt();
        
       
            if(ch1==1)
            {
            System.out.println("Snacks");
            System.out.println("[1] - martis");
            System.out.println("[2] - chicharon");
            
                System.out.println("Enter your choice:");
                int ch2 = input.nextInt();
               
                    if(ch2==1)
                    {
                    System.out.println("marits 15.00");
                    int martis,chicharon;
                    martis = 15;
                    chicharon = 30;
                    
                    System.out.println("do you want drinks? [1] yes [2] no:");
                    int ch3 = input.nextInt();
                    
                        if(ch3==1)
                        {
                        System.out.println("Drinks");
                        System.out.println("[1] = sprite");
                        System.out.println("[2] = water");
                        
                            System.out.println("Enter your choice:");
                            int ch4 = input.nextInt();
                            
                                if(ch4==1)
                                {
                                System.out.println("sprite 20.00");
                                int sprite,water;
                                sprite = 20;
                                water = 15;
                                
                                int tot;
                                tot = martis + sprite;
                                System.out.println("Total is :" + tot);
                                System.out.println("Enter your cash:");
                                int csh = input.nextInt();
                                
                                    
                                
                                    while(csh<tot)
                                    {
                                    System.out.println("Invalid Amount");
                                    System.out.println("Enter your cash:");
                                    csh = input.nextInt();
                                    }
                                    int chnge;
                                    chnge = csh - tot;
                                    System.out.println("change is :"+chnge);
                                    
                                    
                                
                                    
                                
                                }
                                
                                if(ch4==2)
                                {
                                System.out.println("water 15.00");
                                int sprite,water;
                                sprite = 20;
                                water = 15;
                                
                                int tot;
                                tot = martis + water;
                                System.out.println("Total is :" + tot);
                                System.out.println("Enter your cash:");
                                int csh = input.nextInt();
                                
                                    
                                
                                    while(csh<tot)
                                    {
                                    System.out.println("Invalid Amount");
                                    System.out.println("Enter your cash:");
                                    csh = input.nextInt();
                                    }
                                    int chnge;
                                    chnge = csh - tot;
                                    System.out.println("change is :"+chnge);
                                    
                                    
                                
                                
                                }
                                
                        }
                        else {
                                System.out.println("invalid input");
                                int tot;
                                tot = martis;
                                System.out.println("Total is :" + martis);
                                System.out.println("Enter your cash:");
                                int csh = input.nextInt();
                                
                                    
                                
                                    while(csh<tot)
                                    {
                                    System.out.println("Invalid Amount");
                                    System.out.println("Enter your cash:");
                                    csh = input.nextInt();
                                    }
                                    int chnge;
                                    chnge = csh - tot;
                                    System.out.println("change is :"+chnge);
                        }        
                                    
                        
                    }
                    
                   
                      if(ch2==2)
                    {
                    System.out.println("nova 17.00");
                    int martis,chicharon;
                    martis = 15;
                    chicharon = 30;
                    
                    System.out.println("do you want drinks? [1] yes [2] no:");
                    int ch3 = input.nextInt();
                    
                        if(ch3==1)
                        {
                        System.out.println("Drinks");
                        System.out.println("[1] = sprite");
                        System.out.println("[2] = water");
                        
                            System.out.println("Enter your choice:");
                            int ch4 = input.nextInt();
                            
                                if(ch4==1)
                                {
                                System.out.println("sprite 20.00");
                                int sprite,water;
                                sprite = 20;
                                water = 15;
                                
                                int tot;
                                tot = chicharon + sprite;
                                System.out.println("Total is :" + tot);
                                System.out.println("Enter your cash:");
                                int csh = input.nextInt();
                                
                                    
                                
                                    while(csh<tot)
                                    {
                                    System.out.println("Invalid Amount");
                                    System.out.println("Enter your cash:");
                                    csh = input.nextInt();
                                    }
                                    int chnge;
                                    chnge = csh - tot;
                                    System.out.println("change is :"+chnge);
                                    
                                    
                                
                                
                                }
                                
                                if(ch4==2)
                                {
                                System.out.println("water 15.00");
                                int sprite,water;
                                sprite = 20;
                                water = 15;
                                
                                int tot;
                                tot = chicharon + water;
                                System.out.println("Total is :" + tot);
                                System.out.println("Enter your cash:");
                                int csh = input.nextInt();
                                
                                    
                                
                                    while(csh<tot)
                                    {
                                    System.out.println("Invalid Amount");
                                    System.out.println("Enter your cash:");
                                    csh = input.nextInt();
                                    }
                                    int chnge;
                                    chnge = csh - tot;
                                    System.out.println("change is :"+chnge);
                                    
                                    
                                
                                
                                }
                                
                        }
                        else {System.out.println("invalid input");
                         int tot;
                                tot = chicharon;
                                System.out.println("Total is :" + chicharon);
                                System.out.println("Enter your cash:");
                                int csh = input.nextInt();
                                
                                    
                                
                                    while(csh<tot)
                                    {
                                    System.out.println("Invalid Amount");
                                    System.out.println("Enter your cash:");
                                    csh = input.nextInt();
                                    }
                                    int chnge;
                                    chnge = csh - tot;
                                    System.out.println("change is :"+chnge);
                        }        
                                    
                                    
                                    
                                    
                    }  
                      
                      
                
            } 
                
           
            if(ch1==2)
            {
            System.out.println("Drinks");
            System.out.println("[1] = sprite");
            System.out.println("[2] = water");
            
                System.out.println("Enter your choice:");
                int ch2 = input.nextInt();
               
                    if(ch2==1)
                    {
                    System.out.println("sprite 20.00");
                    int sprite,water;
                    sprite = 20;
                    water = 15;
                    
                    System.out.println("Do you want snacks? [1] yes [2] no:");
                    int ch3 = input.nextInt();
                    
                        if(ch3==1)
                        {
                        System.out.println("Snacks");
                        System.out.println("[1] - martis");
                        System.out.println("[2] - chicharon");
                        
                            System.out.println("Enter your choice:");
                            int ch4 = input.nextInt();
                            
                                if(ch4==1)
                                {
                                System.out.println("martis 15.00");
                                int pia,chicharon;
                                pia = 15;
                                chicharon = 30;
                                
                                int tot;
                                tot = sprite + pia;
                                System.out.println("Total is :" + tot);
                                System.out.println("Enter your cash:");
                                int csh = input.nextInt();
                                
                                    
                                
                                    while(csh<tot)
                                    {
                                    System.out.println("Invalid Amount");
                                    System.out.println("Enter your cash:");
                                    csh = input.nextInt();
                                    }
                                    int chnge;
                                    chnge = csh - tot;
                                    System.out.println("change is :"+chnge);
                                    
                                    
                                
                                
                                }
                               
                                if(ch4==2)
                                {
                                System.out.println("chicharon 30.00");
                                int martis,chicharon;
                                martis = 15;
                                chicharon = 17;
                                
                                int tot;
                                tot = sprite + chicharon;
                                System.out.println("Total is :" + tot);
                                System.out.println("Enter your cash:");
                                int csh = input.nextInt();
                                
                                    
                                
                                    while(csh<tot)
                                    {
                                    System.out.println("Invalid Amount");
                                    System.out.println("Enter your cash:");
                                    csh = input.nextInt();
                                    }
                                    int chnge;
                                    chnge = csh - tot;
                                    System.out.println("change is :"+chnge);
                                    
                                    
                                
                                
                                }
                                
                        }
                        else {  System.out.println("invalid input");
                         int tot;
                                tot = sprite;
                                System.out.println("Total is :" + sprite);
                                System.out.println("Enter your cash:");
                                int csh = input.nextInt();
                                
                                    
                                
                                    while(csh<tot)
                                    {
                                    System.out.println("Invalid Amount");
                                    System.out.println("Enter your cash:");
                                    csh = input.nextInt();
                                    }
                                    int chnge;
                                    chnge = csh - tot;
                                    System.out.println("change is :"+chnge);
                        }        
                                    
                    }
                    
                    
                      if(ch2==2)
                    {
                    System.out.println("water 15.00");
                    int sprite,water;
                    sprite = 20;
                    water = 15;
                    
                    System.out.println("Do you want snacks? [1] yes [2] no:");
                    int ch3 = input.nextInt();
                    
                        if(ch3==1)
                        {
                        System.out.println("Snacks");
                        System.out.println("[1] - martis");
                        System.out.println("[2] - chicharon");
                        
                            System.out.println("Enter your choice:");
                            int ch4 = input.nextInt();
                            
                                if(ch4==1)
                                {
                                System.out.println("martis 15.00");
                                int martis,chicharon;
                                martis = 15;
                                chicharon = 30;
                                
                                int tot;
                                tot = water + martis;
                                System.out.println("Total is :" + tot);
                                System.out.println("Enter your cash:");
                                int csh = input.nextInt();
                                
                                    
                                
                                    while(csh<tot)
                                    {
                                    System.out.println("Invalid Amount");
                                    System.out.println("Enter your cash:");
                                    csh = input.nextInt();
                                    }
                                    int chnge;
                                    chnge = csh - tot;
                                    System.out.println("change is :"+chnge);
                                    
                                    
                                
                                
                                }
                                
                                if(ch4==2)
                                {
                                System.out.println("chicharon 30.00");
                                int martis,chicharon;
                                martis = 15;
                                chicharon = 30;
                                
                                int tot;
                                tot = sprite + chicharon;
                                System.out.println("Total is :" + tot);
                                System.out.println("Enter your cash:");
                                int csh = input.nextInt();
                                
                                    
                                
                                
                                    while(csh<tot)
                                    {
                                    System.out.println("Invalid Amount");
                                    System.out.println("Enter your cash:");
                                    csh = input.nextInt();
                                    }
                                    int chnge;
                                    chnge = csh - tot;
                                    System.out.println("change is :"+chnge);
                                    
                                
                                
                                }
                              
                                    
                        }
                        
                           int tot;
                                tot = water;
                                System.out.println("Total is :" + water);
                                System.out.println("Enter your cash:");
                                int csh = input.nextInt();
                                
                                    
                                
                                    while(csh<tot)
                                    {
                                    System.out.println("Invalid Amount");
                                    System.out.println("Enter your cash:");
                                    csh = input.nextInt();
                                    }
                                    int chnge;
                                    chnge = csh - tot;
                                    System.out.println("change is :"+chnge);
                                    
                                      
                                     
                    }  
                    
            }
        
    }   
    
}
