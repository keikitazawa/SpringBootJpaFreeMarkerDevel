<#-- @ftlvariable name="_csrf" type="org.springframework.security.web.csrf.CsrfToken" -->
<#import "common.ftl" as common>
<!DOCTYPE html>
<html>
<head>
	<title>${siteTitle}</title>
</head>
<body>
ログイン画面 <br />
<form name="loginForm" action="${topuri!?html}/login_auth" method="post">
UserName <input type="text" name="email" value="${username!?html}" /><br />
Password <input type="password" name="password" value="" /><br />
<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
<input type="submit" value="ログイン" />
</form>

default_password [${default_password}]<br />
demo password [${demo_password}]<br />
freemarker version: ${.version}<br />
</body>
</html>