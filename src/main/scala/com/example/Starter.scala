package com.example

import org.springframework.boot.{ResourceBanner, SpringApplication}
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer
import org.springframework.core.io.DefaultResourceLoader


object Starter extends App {

  SpringApplication.run(classOf[Bootstrap])

  @SpringBootApplication(scanBasePackages = Array("com.example","org.hg"))
  @SuppressWarnings(Array("PMD.UseUtilityClass"))
  class Bootstrap extends SpringBootServletInitializer{
    override def configure(builder: SpringApplicationBuilder): SpringApplicationBuilder = {
      builder.banner(new ResourceBanner(new DefaultResourceLoader().getResource("banner.txt"))).sources(classOf[Bootstrap])

      return builder
    }

  }

}
