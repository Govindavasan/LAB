/*
@author : Govindavasan S
Date    : 25/08/2022.
Title   : To find FAN Speed,Colour,Radius,Fan status it is ON or OFF.
Question: Design a class named Fan to represent a fan. The class contains:
  - Three constants named SLOW, MEDIUM, and FAST with the values 1, 2, and 3 to
    denote the fan speed.
  - A private int data field named speed that specifies the speed of the fan
    (the default is SLOW).
  - A private boolean data field named on that specifies whether the fan is on
    (the default is false).
  - A private double data field named radius that specifies the radius of the
    fan (the default is 5).
  - A string data field named color that specifies the color of the fan (the
    default is blue).
  - The accessor and mutator methods for all four data fields.
  - A no-arg constructor that creates a default fan.
  - A method named toString() that returns a string description for the fan. If
    the fan is on, the method returns the fan speed, color, and radius in one
    combined string. If the fan is not on, the method returns the fan color and
    radius along with the string "fan is off" in one combined string.
  Write a test program that creates two Fan objects. Assign maximum speed,
  radius 10, color yellow, and turn it on to the first object. Assign medium
  speed, radius 5, color blue, and turn it off to the second object. Display
  the objects by invoking their toString method.
*/
class Fan
{
 public static final int SLOW=1,MEDIUM=2,FAST=3;
 int speed;
 boolean f_on;
 double radius;
 String color;
 
 Fan()
 {
  speed=FAST;
  f_on=false;
  radius=10;
  color="YELLOW";
 }
 
 Fan(int speed,double radius,String color,boolean f_on)
 {
  this.speed=speed;
  this.radius=radius;
  this.color=color;
  this.f_on=f_on;
 }
 
 void display()
 {
  if(f_on==true)
  {
   System.out.println("Fan is OFF \n the speed  is = "+speed+"\n the color  is = "+color+"\n the radius is = "+radius);
  }
  else
  {
   System.out.println("Fan is ON \n the speed  is = "+speed+"\n the color  is = "+color+"\n the radius is = "+radius);
  }
 }
 
public static void main(String [] args)
{
 Fan obj = new Fan();
 Fan obj1 = new Fan(MEDIUM,5,"BLUE",true);
 obj.display();
 obj1.display();
 
}
}
