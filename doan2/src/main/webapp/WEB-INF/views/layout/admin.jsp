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
<link rel="icon" type="image/png" sizes="16x16"
	href='<c:url value="/doan/admin/quixlab/images/favicon.png"></c:url>'>


<link
	href='<c:url value="/doan/admin/quixlab/plugins/pg-calendar/css/pignose.calendar.min.css"></c:url>'
	rel="stylesheet">
<link rel=" stylesheet"
	href="<c:url value="/doan/admin/quixlab/plugins/chartist/css/chartist.min.css"></c:url>">
<link rel="stylesheet"
	href="<c:url value="/doan/admin/quixlab/plugins/chartist-plugin-tooltips/css/chartist-plugin-tooltip.css"></c:url>">
<link href='<c:url value="/doan/admin/quixlab/css/style.css"></c:url>'
	rel="stylesheet">
</head>
<body>
	<div id="main-wrapper">
		<%@ include file="/WEB-INF/views/layout/admin/header.jsp"%>
		<decorator:body></decorator:body>
		<%@ include file="/WEB-INF/views/layout/admin/footer.jsp"%>
	</div>
	<script
		src=" <c:url value="/doan/admin/quixlab/plugins/common/common.min.js"></c:url>"></script>
	<script
		src="<c:url value="/doan/admin/quixlab/js/custom.min.js"></c:url>"></script>
	<script
		src="<c:url value="/doan/admin/quixlab/js/settings.js"></c:url>"></script>
	<script src="<c:url value="/doan/admin/quixlab/js/gleek.js"></c:url>"></script>
	<script
		src="<c:url value="/doan/admin/quixlab/js/styleSwitcher.js"></c:url>"></script>

	<script
		src=" <c:url value="/doan/admin/quixlab/plugins/chart.js/Chart.bundle.min.js"></c:url>"></script>
	<!-- Circle progress -->
	<script
		src=" <c:url value="/doan/admin/quixlab/plugins/circle-progress/circle-progress.min.js"></c:url>"></script>
	<!-- Datamap -->
	<script
		src=" <c:url value="/doan/admin/quixlab/plugins/d3v3/index.js"></c:url>"></script>
	<script
		src="<c:url value="/doan/admin/quixlab/plugins/topojson/topojson.min.js"></c:url>"></script>
	<script
		src="<c:url value="/doan/admin/quixlab/plugins/datamaps/datamaps.world.min.js"></c:url>"></script>
	<!-- Morrisjs -->
	<script
		src="<c:url value="/doan/admin/quixlab/plugins/raphael/raphael.min.js"></c:url>"></script>
	<script
		src="<c:url value="/doan/admin/quixlab/plugins/morris/morris.min.js"></c:url>"></script>
	<!-- Pignose Calender -->
	<script
		src="<c:url value="/doan/admin/quixlab/plugins/moment/moment.min.js"></c:url>"></script>
	<script
		src="<c:url value="/doan/admin/quixlab/plugins/pg-calendar/js/pignose.calendar.min.js"></c:url>"></script>
	<!-- ChartistJS -->
	<script
		src="<c:url value="/doan/admin/quixlab/plugins/chartist/js/chartist.min.js"></c:url>"></script>
	<script
		src="<c:url value="/doan/admin/quixlab/plugins/chartist-plugin-tooltips/js/chartist-plugin-tooltip.min.js"></c:url>"></script>



	<script
		src="<c:url value="/doan/admin/quixlab/js/dashboard/dashboard-1.js"></c:url>"></script>
</body>
