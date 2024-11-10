package com.huahuadan.pattern.responsibility.jdk;

/**
 * @version v1.0
 * @ClassName: Filter
 */
public interface Filter {
    public void doFilter(Request req,Response res,FilterChain c);
}
