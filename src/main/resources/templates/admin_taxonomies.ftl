<#-- @ftlvariable name="_csrf" type="org.springframework.security.web.csrf.CsrfToken" -->
<!DOCTYPE html>
<html>
<head>
	<title>${siteTitle}</title>
</head>
<body>
<h1>タクソノミー管理</h1>

<form name="searchForm" method="post" action="">
	<input type="text" name="keyword" value="${condition.keyword!?html}" />
	<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
</form>
<form name="registForm" method="post" action="">
	<table>
	<tr>
		<th>
			選択<br />
			<input type="checkbox" id="check_all" />
		</th>
		<th>カテゴリ</th>
		<th>名称</th>
		<th>重さ</th>
		<th>操作</th>
	</tr>
	<#list taxonomies as r>
	<tr>
		<td>
			<input type="checkbox" name="check" id="check_0"  />
			<!-- test:[${r.taxonomyHeaders.taxonomy!?html}] -->
			<input type="hidden" name="hid" id="hid_0" value="${r.hid!?html}" />
			<input type="hidden" name="id" id="id_0" value="${r.id!?html}" />
		</td>
		<td>${r.name!?html}</td>
		<td>${r.name!?html}</td>
		<td>${r.weight!?html}</td>
		<td>
			編集/
			ターム/
			削除
		</td>
	</tr>
	</#list>
	<tr>
		<td>
			&nbsp;
			<input type="hidden" name="id" id="id_x" value="" />
		</td>
		<td><input type="hidden" name="name" id="name _x" value="${reginput.name!?html}" /></td>
		<td><input type="hidden" name="taxonomy" id="taxonomy _x" value="${reginput.taxonomy!?html}" /></td>
		<td><input type="hidden" name="description" id="description _x" value="${reginput.description!?html}" /></td>
		<td>
			追加
		</td>
	</tr>
	</table>
	<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
</form>

<a href="/logout">ログアウト</a><br />
<br />
${role!?html}<br />
freemarker version: ${.version}
</body>
</html>