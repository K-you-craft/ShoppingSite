<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../header.html"%>

<form action="login-in" method="post">
	<p>
		ID<br>
		<input type="text" name="member_id">
	</p>
	<p>
		パスワード<br>
		<input type="password" name="password">
	</p>
	<p>
		<input type="submit" value="ログイン">
	</p>
</form>

<form action="">
	<p>
		<input type="submit" value="新規会員登録">
	</p>
</form>

<%@ include file="../footer.html"%>