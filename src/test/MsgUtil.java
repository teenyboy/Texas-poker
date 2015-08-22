package test;

import java.io.IOException;

public class MsgUtil implements MsgUtilInterface {

	private final static String ENCODERMODE = "US-ASCII";

	public MsgUtil() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public byte[] toSocket(String msg) throws IOException {
		// TODO Auto-generated method stub
		byte data[] = msg.getBytes(ENCODERMODE);
		return data;
	}

	@Override
	public String fromSocket(byte[] input) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

}
