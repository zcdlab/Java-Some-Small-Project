public class ClassVersion {
	public static void main(String [] args)
	{
		System.out.println("Java版本: "+ System.getProperty("java.version")+'\n'
								   + "Class路径: "+System.getProperty("java.class.path")
				);//获得JAVA version+Class Path
    } 
}
