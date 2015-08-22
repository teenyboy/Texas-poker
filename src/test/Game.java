package test;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.HashMap;
import java.util.Map;

public class Game {

	private final static String ENCODERMODE = "US-ASCII";
	private final static int BUFFER_SIZE = 1024 * 1024;
	private final static char[] buffer = new char[BUFFER_SIZE];

	static String server_ip = new String();
	static int server_port;
	static String my_ip;
	static int my_port;
	static int my_id;

	private static MsgHandler msgHandler;
	private static String msg;

	public static Person player = new Person();
	public static Map<Integer, Person> personHashMap = new HashMap<Integer, Person>();
	public static Map<Integer, Integer> personStationHashMap = new HashMap<Integer, Integer>();

	// public static ProbilityTable probilityTable = new ProbilityTable();

	public static HashMap<Integer, Integer> winCardHashMap = new HashMap<Integer, Integer>();

	public static DataOutputStream outData;

	public static void main(String[] args) {
		Socket socket = new Socket();
		msgHandler = MsgHandler.getInstance();

		MsgUtil msgUtil = new MsgUtil();

		if (args.length < 6) {
			server_ip = args[0];
			server_port = Integer.valueOf(args[1]);
			my_ip = args[2];
			my_port = Integer.valueOf(args[3]);
			my_id = Integer.valueOf(args[4]);
		}

		winCardHashMap.put(0, 0);
		winCardHashMap.put(1, 0);
		winCardHashMap.put(2, 0);
		winCardHashMap.put(3, 0);
		winCardHashMap.put(4, 0);
		winCardHashMap.put(5, 0);
		winCardHashMap.put(6, 0);
		winCardHashMap.put(7, 0);
		winCardHashMap.put(8, 0);

		player.setPid(my_id);
		Competition.getInstance().setAllTime(System.currentTimeMillis());

		try {
			do {
				if (!Game.connect(socket)) {
					Game.connect(socket);
				}
				InputStream in = socket.getInputStream();

				OutputStream out = socket.getOutputStream();

				msg = "reg: " + my_id + " wang " + "need_notify" + " \n";
				byte[] register = msgUtil.toSocket(msg);
				outData = new DataOutputStream(out);
				outData.write(register);
				outData.flush();

				// writetoFile.writeMsg(msg);

				BufferedReader br = new BufferedReader(new InputStreamReader(
						in, ENCODERMODE));

				while (true) {

					msg = null;
					int len = 0;
					len = br.read(buffer);
					if (len != -1) {
						msg = String.valueOf(buffer, 0, len);
						// 消息处理
						// WritetoFile.getInstance(Game.my_id).writeMsg("\r\n" +
						// msg);
						msgHandler.setMsg(msg);
					}

					if (msg == null) {
						break;
					}
				}
			} while (msg != null);

			System.out.println("0 num is" + winCardHashMap.get(0));
			System.out.println("1 num is" + winCardHashMap.get(1));
			System.out.println("2 num is" + winCardHashMap.get(2));
			System.out.println("3 num is" + winCardHashMap.get(3));
			System.out.println("4 num is" + winCardHashMap.get(4));
			System.out.println("5 num is" + winCardHashMap.get(5));
			System.out.println("6 num is" + winCardHashMap.get(6));
			System.out.println("7 num is" + winCardHashMap.get(7));
			System.out.println("8 num is" + winCardHashMap.get(8));

			System.out.print("all time is ");
			System.out.println(System.currentTimeMillis()
					- Competition.getInstance().getAllTime());

			System.out.println("allaver time is " + Competition.allAverTime);
			System.out.print("aver time is ");
			System.out.println((float) Competition.allAverTime
					/ Competition.getInstance().getHandcount());

			System.out.println("win count is " + Game.player.getWinCount());
			System.out.println("handcount is "
					+ Competition.getInstance().getHandcount());
			System.out.print("win probiliry is ");
			System.out.println((float) Game.player.getWinCount()
					/ Competition.getInstance().getHandcount());

			outData.close();
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
	}

	public static boolean connect(Socket socket) {

		while (true) {

			while (true) {
				try {
					socket.setReuseAddress(true);
					// socket.setSoTimeout(10000);
					SocketAddress localAddress = new InetSocketAddress(my_ip,
							my_port);
					SocketAddress serverAddress = new InetSocketAddress(
							server_ip, server_port);
					socket.bind(localAddress);
					socket.connect(serverAddress);

					if (socket.isConnected()) {
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						if (socket.isConnected()) {
							break;
						}
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (socket.isConnected()) {
				break;
			}
		}
		return true;
	}
}
