package com.raee.im;

import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.packet.XMPPError;

import android.os.AsyncTask;
import android.util.Log;

/**
 * ��������������߳�
 * 
 * @author ChenRui
 * 
 */
public class IMConnectionThread extends AsyncTask<Boolean, Integer, Void>
{

	private XMPPConnection	mXmppConnection	= null;

	private String			tag				= "IMConnectionThread";

	public IMConnectionThread(XMPPConnection connection)
	{
		this.mXmppConnection = connection;
	}

	private void connect()
	{
		Log.i(tag, "�������ʼ����");
		try
		{
			// ���ӱ����������߳���
			this.mXmppConnection.connect();
		}
		catch (XMPPException e)
		{
			IMException.except(e);
		}
	}

	/**
	 * ȡ���������������
	 */
	public void cancle()
	{
		mXmppConnection.disconnect();
	}

	@Override
	protected Void doInBackground(Boolean... params)
	{
		connect();
		return null;
	}

	/**
	 * ��ʼ�����߳�
	 */
	public void start()
	{
		if ( this.getStatus() == Status.PENDING ) // û�����У���ʼ����
		{
			this.execute(true);
		}
	}
}
