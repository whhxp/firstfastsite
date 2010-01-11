//@charset "UTF-8";
package org.apachechina.fscore.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;   
import java.security.NoSuchAlgorithmException;   
  
/**  
 * java md5  
 */  
public class MD5 {   
    private MessageDigest md5;   
    private char hexDigits[] = {       // 用来将字节转换成 16 进制表示的字符   
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd',  'e', 'f'};   
    private MD5() {   
        try {   
            md5 = MessageDigest.getInstance("MD5");   
        } catch (NoSuchAlgorithmException e) {   
            throw new RuntimeException("不支持MD5", e);   
        }   
    }   
  
    private String hexString(byte[] source) {   
        byte[] bs = md5.digest(source);   
        char str[] = new char[16 * 2];   // 每个字节用 16 进制表示的话，使用两个字符，   
        // 所以表示成 16 进制需要 32 个字符   
        int k = 0;                                // 表示转换结果中对应的字符位置   
        for (int i = 0; i < 16; i++) {          // 从第一个字节开始，对 MD5 的每一个字节   
            // 转换成 16 进制字符的转换   
            byte byte0 = bs[i];                 // 取第 i 个字节   
            str[k++] = hexDigits[byte0 >>> 4 & 0xf];  // 取字节中高 4 位的数字转换,   
            // >>> 为逻辑右移，将符号位一起右移   
            str[k++] = hexDigits[byte0 & 0xf];            // 取字节中低 4 位的数字转换   
        }   
        return new String(str);   
    }   
  
    private String hexString(String source) {   
        String md5Str = "";   
		try {
			md5Str = hexString(source.getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}   
        return md5Str;   
    }   
    
    public static String encode(String src)
    {
    	MD5 md5 = new MD5(); 
    	return md5.hexString(src);
    }
  
    public static void main(String[] args) {   
          
        //c2e5848ee99554aae35c090e581cd63c   
        System.out.println(MD5.encode("admin"));  
        System.out.println(MD5.encode("test"));  
        System.out.println(MD5.encode("guest"));  
    }   
}  
