package com.luxoft.oop.xtasks;

import java.util.Arrays;

public class PostOffice {
    private String postOfficeName = new String();
    private Human[] client =new Human[10];
    private Mail[] mailPool= new Mail[10];
    private Mail[] currentMail=new Mail[10];
    private static int cntMails =0;
    // init objects here in constructor for all variables
    // other way is to init objects in places where they are called



    public void sendMail(Human from, Human to, String msg){


        this.mailPool[cntMails] = new Mail();
        this.mailPool[cntMails].setFrom( from);
        this.mailPool[cntMails].setTo( to);
        this.mailPool[cntMails].setMsg(msg);
        //System.out.println(" "+cntMails+" "+        this.mailPool[0]);

        cntMails++;
    }


    public Mail[] recieveMail(Human address){
           int j=0;
        for (int i=0; i<mailPool.length;i++) {
            //System.out.println(mailPool.toString());
          //  System.out.println(currentMail.toString());
            if (this.mailPool[i]!=null &&this.mailPool[i].getTo().equals(address)) {

                currentMail[j]=this.mailPool[i];
                this.mailPool[i]=null;
                j++;
                cntMails--;
            }

        }
       // return currentMail;
        // return pool of mails or latest? for now just 1
        return currentMail;
      }
    public PostOffice() {
    }

    public String getPostOfficeName() {
        return postOfficeName;
    }

    public Human[] getClientPool() {
        return client;
    }
    public  Human getOneClient (Human z){
        for (int i=0;i<this.client.length;i++)
            if (this.client[i].equals(z)) {
                z = this.client[i];
            } else {
            return null;
        }
        return z;
    }

    public Mail[] getMailPool() {
        return mailPool;
    }

    public Mail[] getCurrentMail() {
        return currentMail;
    }

    public void setPostOfficeName(String postOfficeName) {
        this.postOfficeName = postOfficeName;
    }

    public void setClient(Human[] client) {
        this.client = client;
    }

    public void setMailPool(Mail[] mailPool) {
        this.mailPool = mailPool;
    }

    public void setCurrentMail(Mail[] currentMail) {
        this.currentMail = currentMail;
    }

    @Override
    public String toString() {
        return "PostO" +
                "ffice{" +
                "postOfficeName='" + postOfficeName + '\'' +
                ", client=" + Arrays.toString(client) +
                ", mailPool=" + Arrays.toString(mailPool) +
                ", currentMail=" + currentMail +
                '}';
    }



    public String curMailToString() {
        return "PostOffice{" +
                "currentMail=" + Arrays.toString(currentMail) +
                '}';
    }
}
