package test;

import java.io.IOException;

public interface MsgUtilInterface {

	byte[] toSocket(String msg) throws IOException;

	String fromSocket(byte[] input) throws IOException;
}
