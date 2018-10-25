package an.socket;

import java.io.Serializable;

public class Client implements Serializable
{
	private static final long serialVersionUID = 1L;
	public String type,sender,content,recipient;
	
	public Client(String type, String sender, String content,String recipient)
	{
		this.type = type;
		this.sender = sender;
		this.content = content;
		this.recipient = recipient;
	}
	public String toString()
	{
		return "{type='"+type+"',sender='"+sender+"',content='"+content+"',recipient='"+recipient+"'}";
	}
}
