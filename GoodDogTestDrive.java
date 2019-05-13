class GoodDog
{
private int size;
public int getSize()
{
return size;
}
public void setSize(int s)
{
size=s;
}
void bark()
{
if(size>60)
{
System.out.println("Woof! woof!");
}
else
if(size>14)
{
System.out.println("Ruff! Ruff!");
}
else
{
System.out.println("Yip! yip!");
}
}
}
class GoodDogTestDrive
{
public static void main(String[] args)
{
GoodDog a=new GoodDog();
a.setSize(70);
GoodDog b=new GoodDog();
b.setSize(8);
System.out.println("Dog a: " +a.getSize());
System.out.println("Dog b: " +b.getSize());
a.bark();
b.bark();
}
}