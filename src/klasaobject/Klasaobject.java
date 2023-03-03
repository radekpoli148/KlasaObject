/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package klasaobject;

public class Klasaobject {

    public static void main(String[] args) 
    {
        Object a = new Punkt(4, 6);
        
        Punkt p = new Punkt(4, 10); //adres
        Punkt p2 = new Punkt(5, 8); //adres
        
        System.out.println(p.getClass());
        
        if(p.equals(p2))
            System.out.println("są sobie równe");
        else
            System.out.println("nie są sobie równe");
        
        Object[] punkty = new Punkt[4];
        
        punkty[0] = new Punkt(2,8);
        punkty[1] = new Punkt(4,8);
        punkty[2] = new Punkt(5,7);
        punkty[3] = new Punkt(4,7);
        
        for(int i = 0; i < punkty.length; i++)
        {
            System.out.println(punkty[i]);
        }
    }
    
}

class Punkt
{
    private int x;
    private int y;

    Punkt()
    {

    }

    Punkt(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    int getX()
    {
        return x;
    }
    int getY()
    {
        return y;
    }
    @Override
    public boolean equals(Object o)
    {
        if(o == null)
            return false;
        if(this == o)
            return true;
        if(this.getClass() != o.getClass())
            return false;
        
        Punkt przyslany = (Punkt)o;
        
        return this.x == przyslany.x && this.y == przyslany.y;
    }
    @Override
    public String toString()
    {
        return getX() + " " + getY();
    }
}