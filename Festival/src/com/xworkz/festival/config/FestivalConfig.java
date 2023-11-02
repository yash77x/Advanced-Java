package com.xworkz.festival.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.xworkz.festival.app.Christmas;
import com.xworkz.festival.app.Diwali;
import com.xworkz.festival.app.Dusshera;
import com.xworkz.festival.app.Ganesh_Chaturthi;
import com.xworkz.festival.app.Holi;
import com.xworkz.festival.app.Janmashtami;
import com.xworkz.festival.app.Navratri;
import com.xworkz.festival.app.RakshaBandhan;

@Configuration
public class FestivalConfig {
	
	@Bean
	public Dusshera getDusshera() {
		return new Dusshera();
	}
	
	@Bean
	public Diwali getDiwali() {
		return new Diwali();
	}
	
	@Bean
	public Holi getHoli() {
		return new Holi();
	}
	
	@Bean
	public Navratri getNavratri() {
		return new Navratri();
	}
	
	@Bean
	public Ganesh_Chaturthi getGanesh_Chaturthi() {
		return new Ganesh_Chaturthi();
	}
	
	@Bean
	public Janmashtami getJanmashtami() {
		return new Janmashtami();
	}
	
	@Bean
	public RakshaBandhan getRakshaBandhan() {
		return new RakshaBandhan();
	}
	
	@Bean
	public Christmas getChristmas() {
		return new Christmas();
	}

}
