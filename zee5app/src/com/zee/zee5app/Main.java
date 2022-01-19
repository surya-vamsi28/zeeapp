package com.zee.zee5app;

import com.zee.zee5app.dto.Login;
import com.zee.zee5app.dto.Register;
import com.zee.zee5app.service.*;
import com.zee.zee5app.dto.Movie;
import com.zee.zee5app.dto.Subscription;
import com.zee.zee5app.dto.Series;
import com.zee.zee5app.service.SubscriptionService;
import com.zee.zee5app.service.impl.MovieServiceImpl;
import com.zee.zee5app.service.impl.SubscriptionServiceImpl;
import com.zee.zee5app.service.impl.UserServiceImpl;
import com.zee.zee5app.service.MovieService;
import com.zee.zee5app.service.SeriesService;
import com.zee.zee5app.service.impl.SeriesServiceImpl;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserService service = UserServiceImpl.getInstance();
		SubscriptionService subservice = SubscriptionServiceImpl.getInstance();
		MovieService movservice = MovieServiceImpl.getInstance();
		SeriesService serservice = SeriesServiceImpl.getInstance();
		
		
		
		
		Register register = new Register(); 
		register.setFirstName("abhi");
		register.setLastName("chivate");
		register.setEmail("abhi@gmail.com");
		register.setPassword("abhi1234");
		
		System.out.println(register);
		
		System.out.println(register.getEmail());
		
		
		
		for(int i=1;i<=25;i++) {
			Register register2 = new Register();
			register2.setId("ab00"+i);
			register2.setFirstName("abhi" + i);
			register2.setLastName("chivate" + i);
			register2.setPassword("abhi"+i);
		String result = service.addUser(register2);
		System.out.println(result);
		
		}
		
		
		Register register2 = service.getUserById("ab005");
		System.out.println(register2!=null);
		
		
		String a = service.updateUser("ab008" , register2);
		System.out.println(a);
		
		String b = service.deleteUserById("ab002");
		System.out.println(b);
		
		
		for (Register register3 : service.getAllUsers()) {
			System.out.println(register3);
		}
		
		Movie movie = new Movie();
		movie.setMovie_id("1");
		movie.setMovie_category("comedy");
		movie.setMovie_hero("AA");
		movie.setMovie_language("telugu");
		movie.setMovie_length(2);
		movie.setMovie_name("pushpa");
		movie.setMovie_Release_Date("december");
		movie.setMovie_trailer("youtube.com");
		
		
		String out = movservice.addMovie(movie);
		
		String out1 = movservice.deleteMovieById("1");
		System.out.println(out);
		System.out.println(out1);
		
		
		}

}
