public class Item 
{
private String code;
private String name;
private double price;

// CONSTRUCTORS
public Item(){
code = "" ;
name = "" ;
price = 0.0 ;
}
public Item(String code,String name,double price){
this.code = code ;
this.name = name ;
this.price = price ;
}
public String getcode()
{
return code;
}
public void setcode(String code)
{
this.code = code;
}
public String getname()
{ 
return name;
}
public void setname(String name)
{
this.name = name ;
}
public double getprice()
{
return price ;
}
public void setprice(double price)
{
this.price = price;
}
public double CalcProfit()
{
double profit;
profit = price *5/100;
return profit;
}

@Override
public String toString()
{
String str;
str = "Item code:" + code + "\n Item name:" + name +"\n Item price :" + price + "\n profit:"+ CalcProfit();
return str;
}
}
