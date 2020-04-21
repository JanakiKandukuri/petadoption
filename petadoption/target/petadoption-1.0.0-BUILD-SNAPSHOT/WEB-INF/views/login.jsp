<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page session="false"%>
<html>
<head>
<title>Pet Adoption</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/main.css">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">

<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">

<link
	href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css"
	rel="stylesheet">


<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->


</head>
<body>
	<div class="container">
		
		<nav class="navbar navbar-expand-md navbar-light fixed-top bg-light">
			<a class="navbar-brand" href="#"> <img
				src="${pageContext.request.contextPath}/resources/images/icon.png" />
			</a>

			<div class="collapse navbar-collapse" id="navbarCollapse">

				<ul class="nav nav-pills" id="pills-tab" role="tablist">
					<li class="nav-item">
					<a class="nav-link"
						id="pills-home-tab" data-toggle="pill" href="#pills-home"
						role="tab" aria-controls="pills-home" aria-selected="true">Home</a>
					</li>
					<li class="nav-item"><a class="nav-link"
						id="pills-profile-tab" data-toggle="pill" href="#pills-profile"
						role="tab" aria-controls="pills-profile" aria-selected="false">About</a></li>
					<li class="nav-item"><a class="nav-link"
						id="pills-contact-tab" data-toggle="pill" href="#pills-contact"
						role="tab" aria-controls="pills-contact" aria-selected="false">Contact</a></li>

					<li class="nav-item">
						<a class="nav-link" id="pills-signup-tab" href="${pageContext.request.contextPath}/signUp">Sign Up</a>
					</li>
						
					<li class="nav-item">
					<a class="nav-link active" id="pills-login-tab" href="${pageContext.request.contextPath}/login">Login</a></li>

					<!-- <li class="nav-item"><button type="button" id="loginModalBtn"
							class="btn my-2 my-sm-0" data-toggle="modal"
							data-target="#loginModal" style="color: #007bff">Login</button></li> -->

				</ul>

			</div>
		</nav>



		<main role="main" class="container-fluid">


			<div class="tab-content" id="pills-tabContent">

				<div class="tab-pane fade show active" id="pills-login" role="tabpanel" aria-labelledby="pills-login-tab">
					<form:form action="${pageContext.request.contextPath}/loginUser" modelAttribute="user" method="POST">
						
						<div class="form-group">
							<form:label path="email" for="email">Email</form:label>
							
							<form:input path="email" class="form-control" id="email" />
							
							<form:errors path = "email" cssClass = "error" />
							
							<small id="emailHelp" class="form-text text-muted">We'll
								never share your email with anyone else.</small>
						</div>
						
						<div class="form-group">
							<form:label path="password" for="password">Password</form:label>
							<form:input path="password" class="form-control" id="password" />
						</div>
						<button type="submit" class="btn btn-primary">Login</button>
					</form:form>
				</div>
			
			</div>
		</main>



	</div>

	<footer class="container-fluid bg-grey footer">

		<div class="container">
			<section id="lab_social_icon_footer">
				<div class="container">
					<div class="text-center center-block">
						<a href="https://www.facebook.com/bootsnipp" target="_blank"><i
							id="social-fb" class="fa fa-facebook-square fa-3x social"></i></a> <a
							href="https://twitter.com/bootsnipp" target="_blank"><i
							id="social-tw" class="fa fa-twitter-square fa-3x social"></i></a> <a
							href="https://plus.google.com/+Bootsnipp-page" target="_blank"><i
							id="social-gp" class="fa fa-google-plus-square fa-3x social"></i></a>
						<a href="mailto:#" target="_blank"><i id="social-em"
							class="fa fa-envelope-square fa-3x social"></i></a>
					</div>
				</div>
			</section>

			<div class="row">
				<div class="col-md-6">
					<div class="row">
						<div class="col-md-6 ">
							<div class="logo-part">
								<a class="navbar-brand" href="#"> <img
									src="${pageContext.request.contextPath}/resources/images/icon.png" />
								</a>
								<p>100 West Boston, MA 75050</p>
								<p>The pet adoption centre</p>
							</div>
						</div>
						<div class="col-md-6 px-4">
							<h6>About Company</h6>
							<p>The best pet adoption in Boston.</p>
						</div>
					</div>
				</div>
				<div class="col-md-6">
					<div class="row">
						<div class="col-md-6 px-4">
							<h6>Help us</h6>
							<div class="row ">
								<div class="col-md-6">
									<ul>
										<li class="nav-item"><a class="nav-link active"
											id="pills-home-tab" data-toggle="pill" href="#pills-home"
											role="tab" aria-controls="pills-home" aria-selected="true">Home</a>
										</li>
										<li class="nav-item"><a class="nav-link"
											id="pills-profile-tab" data-toggle="pill"
											href="#pills-profile" role="tab"
											aria-controls="pills-profile" aria-selected="false">About</a></li>

										<li><a class="nav-link" id="pills-contact-tab"
											data-toggle="pill" href="#pills-contact" role="tab"
											aria-controls="pills-contact" aria-selected="false">Contact</a>
										</li>
									</ul>
								</div>

							</div>
						</div>
						<div class="col-md-6 ">
							<h6>Newsletter</h6>
							<div class="social">
								<a href="https://www.facebook.com/groups/adoptdontshopmass/"
									target="_blank"><i class="fa fa-facebook"
									aria-hidden="true"></i></a> <a
									href="https://www.instagram.com/mspcaboston/?hl=en/"
									target="_blank"><i class="fa fa-instagram"
									aria-hidden="true"></i></a>
							</div>
							<form class="form-footer my-3">
								<input type="text" placeholder="search here...." name="search">
								<input type="button" value="Go"
									<button onclick="window.location.href = 'https://www.google.com'/"target="_blank"</button>>
							</form>
							<p>Know more info from google search engine</p>
						</div>
					</div>
				</div>
			</div>
		</div>

	</footer>


	<!-- Login Modal -->
	<%-- <div class="modal fade" id="loginModal" tabindex="-1" role="dialog"
		aria-labelledby="loginModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Login</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<form:form action="${pageContext.request.contextPath}/login" modelAttribute="user" method="POST">
						
						<div class="form-group">
							<form:label path="email" for="email">Email</form:label>
							
							<form:input path="email" class="form-control" id="email" />
							
							<form:errors path = "email" cssClass = "error" />
							
							<small id="emailHelp" class="form-text text-muted">We'll
								never share your email with anyone else.</small>
						</div>
						
						<div class="form-group">
							<form:label path="password" for="password">Password</form:label>
							<form:input path="password" class="form-control" id="password" />
						</div>
						<button type="submit" class="btn btn-primary">Login</button>
					</form:form>
				</div>
			</div>
		</div>
	</div> --%>


	<!-- ************** Bootstrap Javascript tags ************************* -->

	<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
		integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
		integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
		integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
		crossorigin="anonymous"></script>
		
		<script>

			
/* 
			$("loginModalBtn").on("click", function() {

				console.log("click called");'

				var element = document.getElementById("loginModal");
				element.addClass("show")
			}) */
		
		</script>
</body>
</html>
