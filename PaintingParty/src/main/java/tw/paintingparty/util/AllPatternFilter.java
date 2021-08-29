package tw.paintingparty.util;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

//�Ҧ��������|�g�L�o��FILTER
//�b�����ҡA�n�J�ɪ�SESSION����ˡA���n�J�ɪ�SESSION�����
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
