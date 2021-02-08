class A2
{
String name;
int id;
A2()
{
this.name="Aditya";
this.id=101;
}
public static void main(String args[])
{
A2 ob1=new A2();
System.out.println(ob1.name+"\t"+ob1.id);
A2 ob2=new A2();
ob2.name="Sai";
ob2.id=102;
System.out.println(ob2.name+"\t"+ob2.id);
}
}