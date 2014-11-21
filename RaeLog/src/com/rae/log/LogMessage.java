package com.rae.log;

/**
 * Log ��Ϣʵ��
 * 
 * @author ChenRui
 * 
 */
public class LogMessage {
	public static LogMessage buildMessage(int level, String tag, String msg) {
		LogMessage message = new LogMessage();
		message.setLevel(level);
		message.setTag(tag);
		message.setMessage(msg);
		return message;
	}

	private String		tag;			// ��־
	private String		className;		// ��������
	private String		lineNumber;	// �����к�
	private int			level;			// ��־�ȼ�
	private String		message;		// ������Ϣ
	private String		stackInfo;		// ��ջ��Ϣ
	private String		recordTime;	// ��־��¼ʱ��
	private String		versionInfo;	// �汾��Ϣ
	private Throwable	throwableInfo;	// ��ջ��¼

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getLineNumber() {
		return lineNumber;
	}

	public void setLineNumber(String lineNumber) {
		this.lineNumber = lineNumber;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStackInfo() {
		return stackInfo;
	}

	public void setStackInfo(String stackInfo) {
		this.stackInfo = stackInfo;
	}

	public String getRecordTime() {
		return recordTime;
	}

	public void setRecordTime(String recordTime) {
		this.recordTime = recordTime;
	}

	public String getVersionInfo() {
		return versionInfo;
	}

	public void setVersionInfo(String versionInfo) {
		this.versionInfo = versionInfo;
	}

	public Throwable getThrowableInfo() {
		return throwableInfo;
	}

	public void setThrowableInfo(Throwable throwableInfo) {
		this.throwableInfo = throwableInfo;
	}
}
