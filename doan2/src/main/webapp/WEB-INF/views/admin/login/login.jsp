<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>

<body class="h-100">







	<div class="login-form-bg h-100">
		<div class="container h-100">
			<div class="row justify-content-center h-100">
				<div class="col-xl-6">
					<div class="form-input-content">
						<div class="card login-form mb-0">
							<div class="card-body pt-5">
								<a class="text-center" href="index.html">
									<h4>Đăng nhập</h4>
								</a>

								<form:form class="mt-5 mb-5 login-input" method="POST"
									modelAttribute="admin">
									<div class="form-group">
										<form:input type="text" class="form-control"
											placeholder="Tài khoản" path="name" />
									</div>
									<div class="form-group">
										<form:input type="password" class="form-control"
											placeholder="Mật khẩu" path="password" />
									</div>
									<p>${status }</p>
									<button class="btn login-form__btn submit w-100" type="submit">Đăng
										nhập</button>
								</form:form>

							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>




	<!--**********************************
        Scripts
    ***********************************-->


</body>
