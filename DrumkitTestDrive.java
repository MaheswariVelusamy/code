class Drumkit
{
boolean tophat=true;
boolean snare=true;
void playtophat()
{
System.out.println("ding ding da-ding");
}
void playsnare()
{
System.out.println("bang bang ba-bang");
}
}

class DrumkitTestDrive
{
public static void main(String[] args)
{
Drumkit d=new Drumkit();
d.playsnare();
d.snare=false;
d.playtophat();
if(d.snare==true)
{
d.playsnare();
}
}
}