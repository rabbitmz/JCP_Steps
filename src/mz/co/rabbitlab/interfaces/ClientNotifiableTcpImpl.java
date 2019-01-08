package mz.co.rabbitlab.interfaces;

/**
 * This class implements the {@link IClientNotifiableTcps}
 * 
 * @author ywingester
 *
 */
public class ClientNotifiableTcpImpl implements IClientNotifiableTcp {

	@Override
	public void notifyViaUDP(String clientAddress) {
		System.out.println("NOTIFY");
	}

	@Override
	public void notifyViaTcp(String clientAddress) {
		System.out.println("NOTIFY");
	}

	@Override
	public String getSystemPort() {
		// TODO Auto-generated method stub
		return null;
	}
}
