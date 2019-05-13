class GoodDog
{
private int size;
public int getsize();
{
return size;
}
public void setsize(int s)
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
a.setsize(70);
GoodDog b=new GoodDog();
b.setsize(8);
System.out.println("Dog a: " +a.getsize());
System.out.println("Dog b: " +b.getsize());
a.bark();
b.bark();
}
}