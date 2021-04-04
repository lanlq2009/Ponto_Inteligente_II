package br.com.pontointeligente.api.utils;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordUtils {
	
	 private static Logger LOGGER = LoggerFactory.getLogger(PasswordUtils.class);
	
	public static String getEncript(String senha) {
		
		if(senha== null) {
			return senha;
		}
		
		LOGGER.info("Gerando hash para senha");
		return new BCryptPasswordEncoder().encode(senha);
		
	}
	

}
