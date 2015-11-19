package firstServiceClient;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;




public class Test {
	
	public static void main(String[] args) throws ServiceException, RemoteException 
	{
		ComplexsumService ss = new ComplexsumServiceLocator();
		Complexsum s = ss.getcomplexService();
		Complex num1=new Complex(1,5);
		Complex num2=new Complex(2,4);
		Complex num3=new Complex(0,0);
		num3 = s.complexsum(num1, num2);
		System.out.println("("+num3.getReal()+","+num3.getImag()+")");
	}
}
