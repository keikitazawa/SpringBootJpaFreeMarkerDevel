/**
 * 
 */
package org.fslabs.springbootjpafreemarkerdevel.core.config;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author kitaz
 *
 */
@Aspect
@Component
public class TraceInterceptor {
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Pointcut("execution(* org.fslabs.springbootjpafreemarkerdevel.app.*.*.*(..))")
	public void controllers() {}
	
	@Around("controllers()")
	public Object invokeBefore(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		Object ret = null;
		try {
			StringBuilder sb = new StringBuilder();
	    	sb.append("%begin:");
	    	sb.append(proceedingJoinPoint.getTarget().getClass().toString());
	    	sb.append("# ");
	    	sb.append(proceedingJoinPoint.getSignature().getName().toString());
	    	sb.append("(");
	    	sb.append(Arrays.toString(proceedingJoinPoint.getArgs()));
	    	sb.append(")");
//	        logger.info(sb.toString());
	    	System.out.println(sb.toString());
	        // String Builderの初期化
	        sb.setLength(0);
	        ret = proceedingJoinPoint.proceed();
	        return ret;
		} finally {
			StringBuilder sb = new StringBuilder();
			sb.append("%end:");
			sb.append(proceedingJoinPoint.getTarget().getClass());
			sb.append("# ");
			sb.append(proceedingJoinPoint.getSignature().getName());
			sb.append("[");
			sb.append(ret);
			sb.append("]");
//	        logger.info(sb.toString());
	    	System.out.println(sb.toString());
			sb.setLength(0);
		}
	}
}
