package org.dongzhixiao.day09;

import java.io.File;
import java.io.IOException;

/**
 * 
 * @author Dongzhixiao �ļ�������
 */
public class FileUtils {
	// �г�����Ŀ¼����������
	public static void listDirectory(File dir) throws IOException {
		if (dir == null) {
			throw new IllegalArgumentException(dir + "Ϊ��");
		}
		if (!dir.exists()) {
			throw new IllegalArgumentException("Ŀ¼��" + dir + "������");
		}
		if (!dir.isDirectory()) {
			throw new IllegalArgumentException(dir + "����һ��Ŀ¼");
		}

		File[] files = dir.listFiles();
		if (files != null && files.length > 0) {
			for (File file : files) {
				if (file.isDirectory()) {
					// �ݹ����Ŀ¼
					listDirectory(file);
				} else {
					System.out.println(file);
				}
			}
		}
	}

	// ɾ��ָ��Ŀ¼
	public static void deleteDirectory(File dir) throws IOException {
		if (dir == null) {
			throw new IllegalArgumentException(dir + "Ϊ��");
		}
		if (!dir.exists()) {
			throw new IllegalArgumentException("Ŀ¼��" + dir + "������");
		}
		if (!dir.isDirectory()) {
			throw new IllegalArgumentException(dir + "����һ��Ŀ¼");
		}
		File[] files = dir.listFiles();
		if (files != null && files.length > 0) {
			for (File file : files) {
				if (file.isDirectory()) {
					// �ݹ�ɾ���ļ�
					deleteDirectory(file);
				} else {
					if (!file.delete()) {
						throw new IOException("�޷�ɾ���ļ�" + file);
					}
				}
			}
		}
		// ��ǰ��Ŀ¼����ɾ����,����Ŀ¼Ҫɾ��
		if (!dir.delete()) {
			throw new IOException("�޷�ɾ���ļ�" + dir);
		}
	}
}
