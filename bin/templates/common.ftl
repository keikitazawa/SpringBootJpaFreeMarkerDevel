<#macro loginform tosubmit csrf>
<form name="loginForm" action="${tosubmit!?html}" method="post">
	UserName <input type="text" name="email" value="" /><br />
	Password <input type="password" name="password" value="" /><br />
	<input type="hidden" name="${csrf.parameterName}" value="${csrf.token}"/>
	<input type="submit" value="ログイン" />
</form>
</#macro>