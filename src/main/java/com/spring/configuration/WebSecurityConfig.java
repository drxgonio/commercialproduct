//DÃ¹ng Ä‘á»ƒ cáº¥u hÃ¬nh chá»©c nÄƒng Ä‘Äƒng nháº­p
package com.spring.configuration;

import com.spring.authentication.MyDBAuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.transaction.annotation.Transactional;

@Configuration
@EnableWebSecurity

public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	MyDBAuthenticationService myDBAauthenticationService;

	@Autowired
	   public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
	  
	       // CÃ¡c User trong bá»™ nhá»› (MEMORY).
	 
	       auth.inMemoryAuthentication().withUser("user1").password("12345").roles("USER");
	       auth.inMemoryAuthentication().withUser("admin1").password("12345").roles("USER, ADMIN");
	 
	   
	       // CÃ¡c User trong Database
	       auth.userDetailsService(myDBAauthenticationService);
	 
	   }

	 @Override
	   protected void configure(HttpSecurity http) throws Exception {
	 
	       http.csrf().disable();
	  
	       // CÃ¡c trang khÃ´ng yÃªu cáº§u login
	       http.authorizeRequests().antMatchers("/","/trang-chi-tiet-san-pham","/trang-dang-ki","/trang-chu","/login").permitAll();
	  
	       // Trang /userInfo yÃªu cáº§u pháº£i login vá»›i vai trÃ² USER hoáº·c ADMIN.
	       // Náº¿u chÆ°a login, nÃ³ sáº½ redirect tá»›i trang /login.
	       http.authorizeRequests().antMatchers("/doi-mat-khau/{username}","/trang-dat-mua-san-pham","/trang-dang-tin","/trang-dat-mua-san-pham/{idProduct}").access("hasAnyRole('ROLE_USER', 'ROLE_ADMIN')");
	 
	       // For ADMIN only.
	       // Trang chá»‰ dÃ nh cho ADMIN
	       http.authorizeRequests().antMatchers("/trang-quan-ly/sua-nguoi-dung/{username}","/trang-quan-ly/{name}").access("hasRole('ROLE_ADMIN')");
	 
	  
	       // Khi ngÆ°á»�i dÃ¹ng Ä‘Ã£ login, vá»›i vai trÃ² XX.
	       // NhÆ°ng truy cáº­p vÃ o trang yÃªu cáº§u vai trÃ² YY,
	       // Ngoáº¡i lá»‡ AccessDeniedException sáº½ nÃ©m ra.
	       http.authorizeRequests().and().exceptionHandling().accessDeniedPage("/403");
	 
	  
	       // Cáº¥u hÃ¬nh cho Login Form.
	       http.authorizeRequests().and().formLogin()//
	  
	               // Submit URL cá»§a trang login
	               .loginProcessingUrl("/j_spring_security_check") // Submit URL
	               .loginPage("/login")//
	               .defaultSuccessUrl("/trang-chu")//náº¿u Ä‘Äƒng nháº­p dÆ°á»£c load vÃ o trang-chu
	               .failureUrl("/login?error=true")//náº¿u Ä‘Äƒng nháº­p sai load vÃ o nÃ y
	               .usernameParameter("username")//
	               .passwordParameter("password")
	  
	               // Cáº¥u hÃ¬nh cho Logout Page.
	               .and().logout().logoutUrl("/logout").logoutSuccessUrl("/logoutSuccessful");
	 
	   }
}
