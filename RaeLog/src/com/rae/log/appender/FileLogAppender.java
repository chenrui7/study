package com.rae.log.appender;

import java.io.File;

import com.rae.log.LogMessage;

public class FileLogAppender extends LogAppender {

	@Override
	public void append(LogMessage msg) {
		String path = getConfig().getDirPath(); // Log ·��

		// ������Ϊ��־
	}

	private String createFileName(File path) {
		return "";
	}

}
