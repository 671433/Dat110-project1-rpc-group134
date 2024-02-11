package no.hvl.dat110.system.controller;

import no.hvl.dat110.TODO;
import no.hvl.dat110.rpc.*;

public class DisplayStub extends RPCLocalStub {

	public DisplayStub(RPCClient rpcclient) {
		super(rpcclient);
	}

	public void write (String message) {

		// TODO - START

		// implement marshalling, call and unmarshalling for write RPC method

		byte[] toSend = RPCUtils.marshallString(message);
		//byte RPCIDDISPLAY = toSend[0];

		byte[] toReceived = rpcclient.call((byte) Common.WRITE_RPCID, toSend);

		RPCUtils.unmarshallString(toReceived);


		// TODO - END

	}
}
