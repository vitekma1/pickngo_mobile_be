package cz.uhk.fim.bs.pickngo_mobile_be.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled=true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure( HttpSecurity http ) throws Exception {

     //   http.csrf().disable();
      /*  http.authorizeRequests()
                .antMatchers( "/oauth2/**", "/login/**" ).permitAll()
                .anyRequest().authenticated()
                .and()
                .oauth2Login()
                .defaultSuccessUrl( "/home" );*/

    }
}
