import java.io.File;
import java.util.Scanner;

public class FileInfoDemo {

	public static void main(String[] args)
	{
		String filename;
		Scanner sc=new Scanner(System.in);
		File f=new File("text.txt");
		System.out.print("enter the filename:");
		filename=sc.nextLine();
		if(f.exists())
		{
			System.out.println("The file "+filename+" exists");
			if(f.canRead()==true)
			{
				System.out.println("The file "+filename+" is readable");
			}
			else
			{
				System.out.println("The file "+filename+" is not readable");
			}
			if(f.canWrite()==true)
			{
				System.out.println("The file "+filename+" is writable");
			}
			else
			{
				System.out.println("The file "+filename+" is not writable");
			}
			String type;
			type=filename.substring(filename.indexOf('.')+1);
			System.out.println("The type of file ="+type);
			long  length=f.length();
			System.out.println("The size of the file ="+length+" bytes");
			
		}
		else
		{
			System.out.println("The file "+filename+" doesn't exist");
		}
	}

}
