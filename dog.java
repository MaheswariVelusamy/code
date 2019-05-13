class dog
{
String name;
public static void main(String[] args)
{
dog dog1=new dog();
dog1.bark();
dog1.name="Fido";
dog[] mydogs=new dog[3];
mydogs[0]=new dog();
mydogs[1]=new dog();
mydogs[2]=dog1;
mydogs[0].name="Fred";
mydogs[1].name="Marge";
System.out.print("last dog's name is");
System.out.println(mydogs[2].name);
int x=0;
while(x<mydogs.length)
{
mydogs[x].bark();
x=x+1;
}
}
public void bark()
{
System.out.println(name+"says Ruff!");
}
}

