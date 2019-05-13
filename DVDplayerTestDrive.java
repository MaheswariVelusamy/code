class DVDplayer
{
boolean canRecord=false;
void recordDVD()
{
System.out.println("DVD recording");
}
void playDVD()
{
System.out.println("DVD playing");
}
}
class DVDplayerTestDrive
{
public static void main(String[] args)
{
DVDplayer t=new DVDplayer();
t.canRecord=true;
t.playDVD();
if(t.canRecord==true)
{
t.recordDVD();
}
}
}