package com.whiteleys.zoo.web.filter;

import com.google.common.collect.ImmutableSet;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Set;

/**
 * A servlet filter that is applied to all requests matching *.html. If a user attempts to access a
 * url that is restricted to logged in users, then they will be redirected to the login page.
 */
public class SecurityFilter extends OncePerRequestFilter {

    private Set<String> exemptUrls;

    /**
     * Filter the request, redirecting to the login page if the user attempts to access a restricted
     * page without being logged in.
     *
     * @param request     the request
     * @param response    the response
     * @param filterChain the filter chain
     * @throws ServletException not explicitly thrown by this filter, but may be thrown by
     *                          subsequent filters
     * @throws IOException      not explicitly thrown by this filter, but may be thrown by
     *                          subsequent filters
     */
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response,
                                    FilterChain filterChain) throws ServletException, IOException {

        boolean isLoggedIn = (request.getSession().getAttribute("user") != null);

        if (!isLoggedIn && !isExempt(request)) {
            response.sendRedirect("/whiteley-zoo/login.html");
            return;
        }

        // continue processing the filter chain
        filterChain.doFilter(request, response);
    }

    /**
     * @param request the request
     * @return true if the requested url is a member of the exempt set, otherwise false
     */
    private boolean isExempt(HttpServletRequest request) {
        if (exemptUrls != null) {
            String requestedUrl = request.getRequestURI();

            if (requestedUrl != null) {
                for (String url : exemptUrls) {
                    if (requestedUrl.startsWith(url)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /**
     * The list of URLs which can be viewed without requiring login.
     *
     * @param exemptUrls the URLs we can allow for unregistered users
     */
    @Required
    public void setExemptUrls(Set<String> exemptUrls) {
        this.exemptUrls = ImmutableSet.of(exemptUrls.toArray(new String[exemptUrls.size()]));
    }

}
