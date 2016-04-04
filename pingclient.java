import java.io.*;
import java.net.*;
public class pingclient
{
public static void main(String args[])
{
PrintWriter out=null;
int i,j,k;
BufferedReader networkIn=null;
try
{
System.out.println("enter the IP address:");
DataInputStream in=new
DataInputStream(System.in);
String ip=in.readLine();
Socket thesocket=new Socket(ip,9999);
networkIn=new BufferedReader(new InputStreamReader(System.in));
out=new
PrintWriter(thesocket.getOutputStream());
System.out.println("\nPinging"+ip+"with 32 bytes of data\n");
for(i=0;i<4;i++)
{
out.println(ip);
out.flush();
String inp=networkIn.readLine();
if(inp!=null)
{
for(j=0;j<10000;j++)
{
for(k=0;k<50000;k++)
{
}
}
System.out.println("reply from"+inp);
}
else
{
for(i=0;i<4;i++)
{
for(j=0;j<10000;j++)
{
for(k=0;k<50000;k++)
{
}
System.out.println("\nrequest time out");
}
}
}
}
}
catch(IOException e)
{
for(i=0;i<4;i++)
{
for(j=0;j<1000;j++)
{
for(k=0;k<5000;k++)
{
}
}
System.out.println("\nrequest time out");
}
}
try
{
if(networkIn!=null)
networkIn.close();
if(out!=null)
out.close();
}
catch(Exception e){
System.out.println("\nrequested time out");
}
}
}
