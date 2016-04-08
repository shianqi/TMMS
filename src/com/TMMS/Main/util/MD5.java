package com.TMMS.Main.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 用于密码计算的类
 * */
public class MD5 {
	private String salt = "shianqi@imudges";
	
	/**
	 * 此方法用于MD5的计算
	 * @param plainText 待计算的文本
	 * @return 经过散列函数计算之后的值
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

			// System.out.println("result: " + buf.toString());//32位的加密

			// System.out.println("result: " +
			// buf.toString().substring(8,24));//16位的加密

		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return buf.toString();
	}
	
	/**
	 * 此方法用于密码的计算
	 * @param password 加密前的密码明文
	 * @return 加密后的密文
	 * 采用了 两次MD5散列，在其中还加了盐
	 * 具体的计算方式见方法的内容
	 * */
	public String encryptPassword(String password){
		return Md5(Md5(password)+"&"+salt);
	}
}
