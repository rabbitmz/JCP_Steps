package mz.co.rabbitlab.interfaces;

/***
 * To create a interface we use the key word <b>interface</b>
 * 
 * An interface can be public - when all class's in any package can access the Interface. 
 * Or can be without access modifier (default) - when only the class's inside the same package can access the interface. 
 * 
 * Interfaces can have : constants, Enum, abstract methods, default and static methods with implementation. 
 * 
 * An interface can extends another interface and never implements another interface.
 *  
 * @author ywingester
 *
 */
public interface IClientNotifiable {
	
	void notifyViaUDP(String clientAddress);
	
	/**
	 * @return the UDP Port define in the system 
	 */
	default String getSystemPort()
	{
		validateUdpPort();
		return System.getProperty("UDP_PORT");
	}
	
	static boolean validateUdpPort()
	{
		return true;
	}
}
