<#-- @ftlvariable name="_csrf" type="org.springframework.security.web.csrf.CsrfToken" -->
<!DOCTYPE html>
<html>
<head>
	<title>${siteTitle}</title>
</head>
<body>
テストログイン成功<br />
<br />
<a href="/admin/taxonomyheaders">タクソノミー管理</a><br />
<a href="/admin/taxonomies">ターム管理</a><br />
<a href="/admin/taxonomyrelations">タクソノミー階層管理</a><br />
<br />

<a href="/logout">ログアウト</a><br />
<br />
${role!?html}<br />
freemarker version: ${.version}
</body>
</html>