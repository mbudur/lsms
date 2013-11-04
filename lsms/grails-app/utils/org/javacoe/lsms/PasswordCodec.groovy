package org.javacoe.lsms


import com.sun.xml.internal.org.jvnet.staxex.Base64Encoder
import java.security.MessageDigest


class PasswordCodec {
	
	static encode = { str ->
//		MessageDigest md = MessageDigest.getInstance('SHA')
//		md.update(str.getBytes('UTF-8'))
//		return new Base64Encoder().encodeByte(md.digest())
		
		return str;
		
	}

}
