package com.example.kotlinsample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.cors.CorsConfiguration
import org.springframework.web.cors.UrlBasedCorsConfigurationSource
import org.springframework.web.filter.CorsFilter
import java.util.*

@SpringBootApplication
class KotlinSampleApplication

fun main(args: Array<String>) {
	runApplication<KotlinSampleApplication>(*args)
}


//@Configuration
//class CorsConfig {
//	@Bean
//	fun corsFilter(): CorsFilter {
//		val config = CorsConfiguration()
//		config.allowedOrigins = Arrays.asList("http://localhost:3000")
//		config.allowCredentials = true
//		config.addAllowedMethod("*")
//		config.addAllowedHeader("*")
//		config.addExposedHeader("Set-Cookie")
//		val configSource = UrlBasedCorsConfigurationSource()
//		configSource.registerCorsConfiguration("/**", config)
//		return CorsFilter(configSource)
//	}
//}
