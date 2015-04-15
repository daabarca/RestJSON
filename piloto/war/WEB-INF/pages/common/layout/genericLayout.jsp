<%@ include file="/includes/common.jsp" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<tiles:importAttribute name="service" scope="page"/>
<tiles:importAttribute name="as" scope="request"/>
<tiles:importAttribute name="os" scope="request"/>
	
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
	<head>
	  	<meta http-equiv="content-type" content="text/html;charset=UTF-8" />
		<meta name="Author" content="" />
		<meta name="Keywords" content="" />
		<meta name="description" content="" />
		<link rel="stylesheet" href="/css/styles.css" type="text/css" media="all" />	
		<title></title>
	</head>
<body >


		<tiles:insertAttribute name="header" />
		<div id="container" class="clearfix" style ="height:500px">
			<tiles:insertAttribute name="body" />
			
		</div>
		


</body>

<html>
