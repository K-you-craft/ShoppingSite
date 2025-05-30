<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../header.html"%>

<form action="register" method="post">
	<table border="1" style="border-collapse: collapse;">
		<tr>
			<td colspan="2" style="text-align: center;">
				<h2>新規登録</h2>
			</td>
		</tr>
		<tr>
			<th><p>ID</p></th>
			<td><input type="text" name="member_id" required></td>
		</tr>
		<tr>
			<th><p>姓</p></th>
			<td><input type="text" name="last_name" required></td>
		</tr>
		<tr>
			<th><p>名</p></th>
			<td><input type="text" name="first_name" required></td>
		</tr>
		<tr>
			<th><p>パスワード</p></th>
			<td><input type="password" name="password" required></td>
		</tr>
		<tr>
			<th><p>住所</p></th>
			<td><input type="text" name="address" required></td>
		</tr>
		<tr>
			<th><p>メールアドレス</p></th>
			<td><input type="email" name="mail_address" required></td>
		</tr>

		<tr>
			<td colspan="2" style="text-align: center;">
				<p>
					<button type="submit">登録</button>
				</p> 
				<a href="login-in.jsp">
					<p>ログインページに戻る</p>
				</a>
			</td>
		</tr>
	</table>
</form>


<%@ include file="../footer.html"%>