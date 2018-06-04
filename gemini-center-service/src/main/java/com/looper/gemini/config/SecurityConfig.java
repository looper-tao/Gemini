package com.looper.gemini.config;

import com.newtank.novice.security.config.KPublicSecurityConfigurerAdapter;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends KPublicSecurityConfigurerAdapter {

}