/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan_pertama;

/**
 *
 * @author user
 */
public class Percobaan_pertama {
    public Percobaan_pertama head = null;
    public Percobaan_pertama tail = null;
    
    public int data;
    public Percobaan_pertama next;
    
    public Percobaan_pertama (int d)
    {
        this.data = d;
        this.next = null;
    }
    public void addfirst (int serahnamanya)
    {
        Percobaan_pertama newnode = new Percobaan_pertama(serahnamanya);
        
        if(head == null)
        {
            head = newnode;
            tail = newnode;
        }
        else
        {
            Percobaan_pertama isisementara = head;
            head = newnode;
            head.next = isisementara;
        }
    }
    
    public void addlast(int serahnamanya)
    {
        Percobaan_pertama newnode = new Percobaan_pertama(serahnamanya);
        
        if (head == null)
        {
            head = newnode;
            tail = newnode;
        }
        else
        {
            tail.next = newnode;
            tail = newnode;
        }
    }
    
    
    public void delete(int pos)
    {
        if (pos == 0)
        {
            head = head.getnext();
            return;
        }
        
        Percobaan_pertama current = head;
        int count = 0;
        while (count < pos-1)
        {
            current = current.getnext();
            if (current == null)
            {
                throw new IndexOutOfBoundsException("404 not found");
            }
             count++;
        }
        if (current.getnext()==null)
        {
            throw new IndexOutOfBoundsException("404 not found");
        }
        current.setnext(current.getnext().getnext());
    }
    public Percobaan_pertama()
    {
        this.getClass();
    }
    public String txt()
    {
        String output = "";
        Percobaan_pertama current = head;
        while(current!=null)
        {
            output += current.getdata()+",";
            current = current.getnext();
        }
        return output;
    }
    public int getdata() {return data;}
    public Percobaan_pertama getnext(){return next;}
    
    public void setdata(int d){data = d;}
    public void setnext(Percobaan_pertama nx){next = nx;}
    
    public static void main(String[]args)
    {
        Percobaan_pertama nb = new Percobaan_pertama();
        nb.addfirst(10);
        nb.addfirst(1);
        nb.addfirst(5);
        nb.addfirst(3);
        nb.addlast(10);
        nb.addlast(100);
        
        System.out.println(nb.txt());
        
        nb.delete(2);
        System.out.println(nb.txt());
    }

    /**
     * @param args the command line arguments
     */

    
}
