package mz.co.rabbitlab.interfaces;

/**
 * As we see in the {@link IClientNotifiable} the interface only notify clients
 * using the UDP protocol. now we want to notify a client using the TCP
 * protocol.
 * 
 * We can't evolve the {@link IClientNotifiable} by adding a new method inside
 * the interface, because lot of clients can be using this interface.
 * 
 * We have the following options for this problem :
 * 
 * 1. Implement a Default method in the {@link IClientNotifiable} 2. Implement a
 * Static method in the {@link IClientNotifiable} 3. Declare a static method in
 * the {@link IClientNotifiableTcp} and extend the {@link IClientNotifiable}
 * 
 * 
 * NOTE: A default method and a static method redeclare in another interface as
 * abstract, will need to be implemented in the class instance of the interface.
 * 
 * @author ywingester
 *
 */
public interface IClientNotifiableTcp extends IClientNotifiable {

	void notifyViaTcp(String clientAddress);

	/***
	 * as we need to get the port in a different way of the default method
	 * implemented in the {@link IClientNotifiable#getSystemPort()} we redeclare the
	 * method in this interface as abstract.
	 * 
	 * now we will have to implement this method in the {@link IClientNotifiableTcp}
	 * implementations
	 */
	String getSystemPort();

}
