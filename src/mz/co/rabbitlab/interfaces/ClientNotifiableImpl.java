package mz.co.rabbitlab.interfaces;

/***
 * We implement here the {@link mz.co.rabbitlab.interfaces.IClientNotifiable} we
 * must to implement only the abstract methods. Not the default or static
 * methods.
 * 
 * @author ywingester
 *
 */
public class ClientNotifiableImpl implements IClientNotifiable {

	@Override
	public void notifyViaUDP(String clientAddress) {

		System.out.println("NOTIFY" + clientAddress);

	}
}
