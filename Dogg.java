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
Dog 1=new Dog();
1.size=70;
Dog 2=new Dog();
2.size=8;
Dog 3=new Dog();
3.size=35;
1.bark();
2.bark();
3.bark();
}
}