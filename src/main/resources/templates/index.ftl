<#-- @ftlvariable name="_csrf" type="org.springframework.security.web.csrf.CsrfToken" -->
<!DOCTYPE html>
<html>
<head>
	<title>${siteTitle}</title>
</head>
<body>
テスト表示<br />
<a href="/admin/taxonomies">タクソノミー管理</a><br />

<a href="/login">ログイン</a><br />
<br />
${teststring!?html}<br />

<form action="/login" method="post">
	<input type="submit" />
	<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
</form>
freemarker version: ${.version}
</body>
</html>