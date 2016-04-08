package com.TMMS.Main.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * ��������������
 * */
public class MD5 {
	private String salt = "shianqi@imudges";
	
	/**
	 * �˷�������MD5�ļ���
	 * @param plainText ��������ı�
	 * @return ����ɢ�к�������֮���ֵ
	 * */
	public String Md5(String plainText) {
		StringBuffer buf = null;
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(plainText.getBytes());
			byte b[] = md.digest();
			int i;
			buf = new StringBuffer("");
			for (int offset = 0; offset < b.length; offset++) {
				i = b[offset];
				if (i < 0)
					i += 256;
				if (i < 16)
					buf.append("0");
				buf.append(Integer.toHexString(i));
			}

			// System.out.println("result: " + buf.toString());//32λ�ļ���

			// System.out.println("result: " +
			// buf.toString().substring(8,24));//16λ�ļ���

		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return buf.toString();
	}
	
	/**
	 * �˷�����������ļ���
	 * @param password ����ǰ����������
	 * @return ���ܺ������
	 * ������ ����MD5ɢ�У������л�������
	 * ����ļ��㷽ʽ������������
	 * */
	public String encryptPassword(String password){
		return Md5(Md5(password)+"&"+salt);
	}
}
