package com.netsuite.tdc.sentry2.route;

import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.ZuulFilter;
import java.net.URL;
import org.springframework.stereotype.Component;

public class Sentry2RouteFilter extends ZuulFilter {
  @Override
  public String filterType(){
	return "route";
  }

  @Override
  public int filterOrder() {
	return 0;
  }

  @Override
  public boolean shouldFilter() {
	return true;
  }

  public Object run() {
	try {
	  // System.out.println("Intercepted query");
	  RequestContext ctx = RequestContext.getCurrentContext();
	  // System.out.println("!!!!!!!!!!!!!!!!!!!!: " + ctx.getRequest().getMethod());
	  ctx.setRouteHost(new URL("http://localhost:50001"));
	} catch (Throwable t) {
	  // System.out.println(t.getMessage());
	  t.printStackTrace();
	}                    

	return null;
  }
}
