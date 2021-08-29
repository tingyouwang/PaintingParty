package tw.paintingparty.util;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

//所有頁面都會經過這個FILTER
//帳號驗證，登入時的SESSION長怎樣，未登入時的SESSION長怎樣
@WebFilter("/AllPatternFilter")
public class AllPatternFilter implements Filter {

	public void init(FilterConfig fConfig) throws ServletException {
	
	}

	public AllPatternFilter() {
    
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		chain.doFilter(request, response);
	}

	public void destroy() {
	
	}



}
