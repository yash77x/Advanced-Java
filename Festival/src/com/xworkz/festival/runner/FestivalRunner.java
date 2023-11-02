package com.xworkz.festival.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.festival.app.Christmas;
import com.xworkz.festival.app.Diwali;
import com.xworkz.festival.app.Dusshera;
import com.xworkz.festival.app.Ganesh_Chaturthi;
import com.xworkz.festival.app.Holi;
import com.xworkz.festival.app.Janmashtami;
import com.xworkz.festival.app.Navratri;
import com.xworkz.festival.app.RakshaBandhan;
import com.xworkz.festival.config.FestivalConfig;

public class FestivalRunner {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(FestivalConfig.class);
		
		Dusshera dusshera = context.getBean(Dusshera.class);
		dusshera.celebrate();
		
		Diwali diwali = context.getBean(Diwali.class);
		diwali.doPooja();
		
		Holi holi = context.getBean(Holi.class);
		holi.celebrate();
		
		Navratri navratri = context.getBean(Navratri.class);	
		navratri.doPooja();
		
		Ganesh_Chaturthi chaturthi = context.getBean(Ganesh_Chaturthi.class);
		chaturthi.doPooja();
		
		Janmashtami janmashtami = context.getBean(Janmashtami.class);
		janmashtami.doPooja();
		
		RakshaBandhan bandhan = context.getBean(RakshaBandhan.class);
		bandhan.celebrate();
		
		Christmas christmas = context.getBean(Christmas.class);
		christmas.celebrate();
	}

}
