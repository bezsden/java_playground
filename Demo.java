package com.luxoft.oop.xtasks;

import java.util.Arrays;


public class Demo {
    public static void main (String[] args){
        PostOffice radisheva = new PostOffice();
        Human z1= new Human("z1");
        Human z2= new Human("z2");
        Human z3= new Human("z3");
        Human selo[] = {z1,z2,z3};
        radisheva.setClient(selo);
      // why ignored
        z1.toString();
        z2.toString();
        //System.out.println(z1);
        //System.out.println(Radisheva.getOneClient(z1));

        //Mail[] mailBox = new Mail[10];
       // radisheva.setMailPool(mailBox);

       radisheva.sendMail(z1,z2,"zz1");
        radisheva.sendMail(z2,z3,"zz2");
        radisheva.sendMail(z3,z2,"zz3");
        radisheva.sendMail(z1,z2,"zz4");

      radisheva.recieveMail(z2);
        System.out.println(radisheva.curMailToString());
        System.out.println(Arrays.toString(radisheva.getMailPool()));

        // history
        // , sort leftovers?
    }
}
