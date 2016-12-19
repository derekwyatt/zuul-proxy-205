package com.netsuite.tdc.sentry2;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import com.netsuite.tdc.sentry2.route.Sentry2RouteFilter;

@EnableZuulProxy
@SpringBootApplication
public class Sentry2 {
  public static void main(String[] args) {
    SpringApplication.run(Sentry2.class, args);
  }

  @Bean
  public Sentry2RouteFilter routeFilter() {
    return new Sentry2RouteFilter();
  }
}
