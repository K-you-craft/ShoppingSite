<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../header.html"%>

<form action="login-in" method="post">
	<table border="1" style="border-collapse: collapse;">
		<tr>
			<td colspan="2" style="text-align: center;">
					<h2>ログイン</h2>
			</td>
		</tr>

		<tr>
			<th><p>ID</p></th>
			<td><input type="text" name="member_id" required></td>
		</tr>

		<tr>
			<th><p>パスワード</p></th>
			<td><input type="password" name="password" required></td>
		</tr>

		<tr>
			<td colspan="2" style="text-align: center;"><p>
					<input type="submit" value="ログイン">
				</p></td>
		</tr>
	</table>
</form>

<a href="register.jsp">
	<p>新規会員登録</p>
</a>

<%@ include file="../footer.html"%>