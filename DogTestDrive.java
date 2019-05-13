class Dog
{
int size;
String name;
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
class DogTestDrive
{
public static void main(String[] args)
{
Dog a=new Dog();
a.size=70;
Dog b=new Dog();
b.size=8;
Dog c=new Dog();
c.size=35;
a.bark();
b.bark();
c.bark();
}
}