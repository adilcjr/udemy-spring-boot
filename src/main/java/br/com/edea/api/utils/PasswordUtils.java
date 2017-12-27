package br.com.edea.api.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordUtils {
	
	/**
	 * Generates a hash using BCrypt.
	 * 
	 * @param password 
	 * 
	 * @return an encrypted password
	 */
	public static String generateBCrypt(String password) {
		
		if (password == null) {
			return password;
		}
		
		BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder();
		
		return bCryptEncoder.encode(password);
	}
	
	/**
	 * Validate a raw password
	 * 
	 * @param rawPassword
	 * @param encodedPassword
	 * 
	 * @return <code>true</code> if the password is valid, <code>false</code> otherwise.
	 */
	public static boolean passwordValidation(String rawPassword, String encodedPassword) {
		
		BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder();
		return bCryptEncoder.matches(rawPassword, encodedPassword);
	}

}
