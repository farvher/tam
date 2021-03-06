<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE HTML>
<html>
<head>
<title>Rocket Bootstarp Website Template | Home :: w3layouts</title>
<link href="<%=request.getContextPath().toString()%>/css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="<%=request.getContextPath().toString()%>/js/jquery.min.js"></script>
<!-- Custom Theme files -->
<link href="<%=request.getContextPath().toString()%>/css/style.css" rel='stylesheet' type='text/css' />
<!-- Custom Theme files -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--webfont-->
<link href='http://fonts.googleapis.com/css?family=Source+Sans+Pro:200,300,400,600,700,900' rel='stylesheet' type='text/css'>
<script src="<%=request.getContextPath().toString()%>/js/easyResponsiveTabs.js" type="text/javascript"></script>
		    <script type="text/javascript">
			    $(document).ready(function () {
			        $('#horizontalTab').easyResponsiveTabs({
			            type: 'default', //Types: default, vertical, accordion           
			            width: 'auto', //auto or any width like 600px
			            fit: true   // 100% fit in a container
			        });
			    });
			   </script>	
</head>
<body>
   <!----- start-header---->
  <div class="wrapper">
    <!----start-header---->
		 <div class="header">
	       <div class="container header_top">
				<div class="logo">
				  <a href="<%=request.getContextPath().toString()%>/index.html"><img src="<%=request.getContextPath().toString()%>/images/logo.png" alt=""></a>
				</div>
		  		<div class="menu">
					<a class="toggleMenu" href="<%=request.getContextPath().toString()%>/#"><img src="<%=request.getContextPath().toString()%>/images/nav_icon.png" alt="" /> </a>
					<ul class="nav" id="nav">
					  <li class="current"><a href="<%=request.getContextPath().toString()%>/index.html">Home</a></li>
					  <li><a href="<%=request.getContextPath().toString()%>/about.html">About</a></li>
					  <li><a href="<%=request.getContextPath().toString()%>/services.html">Services</a></li>
					  <li><a href="<%=request.getContextPath().toString()%>/portfolio.html">Portfolio</a></li>
					  <li><a href="<%=request.getContextPath().toString()%>/contact.html">Contact</a></li>								
					  <div class="clearfix"></div>
					</ul>
					<script type="text/javascript" src="<%=request.getContextPath().toString()%>/js/responsive-nav.js"></script>
				</div>							
	  			<div class="clearfix"> </div>
			    <!----//End-top-nav---->
			 </div>
		</div>
	<!----- //End-header---->

     <div class="container banner">
	 	<div class="row">
	 			<div class='col-md-4 banner_left'>
	 				<span></span>
	 			</div>
	 			<div class='col-md-6 banner_right'>
	 				<h1>nunc nobis vident </h1>
	 				<h2>Lorem ipsum dolor sit amet</h2>
	 				<p>nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit</p>
	 				<a class="banner_btn" href="<%=request.getContextPath().toString()%>/">More Info</a>
	 			</div>
	 	 </div>
	 </div>
	 <div class="main">
	 	<div class='container content_top'>
	 		<div class='row'>
	 			<div class="col-md-4 flag_grid">
	 			 <i class="flag"></i>
	 			 <div class="flag_desc">
	 			 	<h3><a href="<%=request.getContextPath().toString()%>/#">soluta nobis eleifend</a></h3>
	 			 	<p>aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis</p>
	 			 	<a href="<%=request.getContextPath().toString()%>/#" class="link">Read More</a>
	 			 </div>
	 			 <div class="clearfix"> </div>
	 			</div>
	 			<div class="col-md-4 flag_grid">
	 			 <i class="camera"></i>
	 			 <div class="flag_desc">
	 			 	<h3><a href="<%=request.getContextPath().toString()%>/#">soluta nobis eleifend</a></h3>
	 			 	<p>aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis</p>
	 			 	<a href="<%=request.getContextPath().toString()%>/#" class="link">Read More</a>
	 			 </div>
	 			  <div class="clearfix"> </div>
	 			</div>
	 			<div class="col-md-4">
	 			 <i class="home"></i>
	 			 <div class="flag_desc">
	 			 	<h3><a href="<%=request.getContextPath().toString()%>/#">soluta nobis eleifend</a></h3>
	 			 	<p>aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis</p>
	 			 	<a href="<%=request.getContextPath().toString()%>/#" class="link">Read More</a>
	 			 </div>
	 			  <div class="clearfix"> </div>
	 			</div>
	 		</div>
	 	</div>
	 	<div class='container content_middle'>
	 		<div class="row">
	 			<div class="col-md-8 middle_left">
	 				<ul class="test_box middle_grid">
		    			<li class="test_img"><img src="<%=request.getContextPath().toString()%>/images/pic1.jpg" class="img-responsive" alt=""> </li>
						<li class="test_desc">
							<h4><a href="<%=request.getContextPath().toString()%>/#">Lorem ipsum dolor</a></h4>
							<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl</p> 
							<br><a class="content_btn" href="<%=request.getContextPath().toString()%>/">More</a>
					    </li>	
					    <div class="clearfix">	</div>    				
		    		</ul>
		    		<ul class="test_box">
		    			<li class="test_img"><img src="<%=request.getContextPath().toString()%>/images/pic2.jpg" class="img-responsive" alt=""> </li>
						<li class="test_desc">
							<h4><a href="<%=request.getContextPath().toString()%>/#">diam nonummy nibh</a></h4>
							<p>hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi..</p>
							<br><a class="content_btn" href="<%=request.getContextPath().toString()%>/">More</a>
					    </li>	
					    <div class="clearfix">	</div>    				
		    		</ul>
	 			</div>
	 			<div class="col-md-4">
	 				<div class="sap_tabs">	
						 <div id="horizontalTab" style="display: block; width: 100%; margin: 0px;">
						  <ul class="resp-tabs-list">
						  	  <li class="resp-tab-item" aria-controls="tab_item-0" role="tab"><span>Eronped</span></li>
							  <li class="resp-tab-item" aria-controls="tab_item-1" role="tab"><span>Centro</span></li>
							  <li class="resp-tab-item" aria-controls="tab_item-2" role="tab"><span>sequitur</span></li>
							  <div class="clear"></div>
						  </ul>				  	 
							<div class="resp-tabs-container">
							    <div class="tab-1 resp-tab-content" aria-labelledby="tab_item-0">
									<div class="facts">
									  <div class="tab_box">
									    <h4><a href="<%=request.getContextPath().toString()%>/#">Hendrerit vulputate</a></h4>
									    <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt.</p>
									   </div>
									  <ul class="tab_list">
									  	<li><a href="<%=request.getContextPath().toString()%>/#">Diam nonummy nibh euismod</a></li>
									  	<li><a href="<%=request.getContextPath().toString()%>/#">Hendrerit in vulputate velit</a></li>
									  	<li><a href="<%=request.getContextPath().toString()%>/#">Diam nonummy nibh euismod</a></li>
									  	<li><a href="<%=request.getContextPath().toString()%>/#">Fendrerit in vulputate velit</a></li>
									  </ul>           
							        </div>
							     </div>	
							      <div class="tab-1 resp-tab-content" aria-labelledby="tab_item-1">
									<div class="facts">
									  <div class="tab_box">
									    <h4><a href="<%=request.getContextPath().toString()%>/#">Mirum est notare</a></h4>
									    <p>Dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit pra.</p>
									   </div>
									  <ul class="tab_list">
									  	<li><a href="<%=request.getContextPath().toString()%>/#">Diam nonummy nibh euismod</a></li>
									  	<li><a href="<%=request.getContextPath().toString()%>/#">Hendrerit in vulputate velit</a></li>
									  	<li><a href="<%=request.getContextPath().toString()%>/#">Diam nonummy nibh euismod</a></li>
									  </ul>           
							        </div>
							     </div>	
							      <div class="tab-1 resp-tab-content" aria-labelledby="tab_item-2">
									<div class="facts">
									  <div class="tab_box">
									    <h4><a href="<%=request.getContextPath().toString()%>/#">nunc nobis</a></h4>
									    <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt.</p>
									   </div>
									  <ul class="tab_list">
									  	<li><a href="<%=request.getContextPath().toString()%>/#">Diam nonummy nibh euismod</a></li>
									  	<li><a href="<%=request.getContextPath().toString()%>/#">Hendrerit in vulputate velit</a></li>
									  	<li><a href="<%=request.getContextPath().toString()%>/#">Diam nonummy nibh euismod</a></li>
									  	<li><a href="<%=request.getContextPath().toString()%>/#">Fendrerit in vulputate velit</a></li>
									  </ul>           
							        </div>
							     </div>		        					 
							  </div>	
					        </div>
					  </div>
	 			</div>
	 		</div>
	 	 </div>
	 	 <div class="container section_aligncenter">
	 		<h3>augue duis dolore</h3>
	 		<p>dynamicus, qui sequitur mutationem consuetudium lectorum. Mirum est notare quam littera gothica, quam nunc putamus parum claram, anteposuerit litterarum formas humanitatis</p>
         </div>  
         <div class="container content_bottom">
         	<h3>augue duis dolore te feugait</h3>
         	<p class="m_1">diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat.</p>
         	<div class="row">
         		<div class='col-md-6 comment_top'>
         			<div class="project_grid">
			  	   	   	  <ul class="project_box">
			  	   	   	  	<li class="mini-post-meta"><time datetime=""><span class="day">07</span><span class="month">July</span></time></li>
			  	   	   	  	<li class="desc"><h5><a href="<%=request.getContextPath().toString()%>/#">Quod Mazim</a></h5>
			  	   	   	  		<span class="comment">18 Comments</span>
			  	   	   	  		<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laor&nbsp;&nbsp; <a href="<%=request.getContextPath().toString()%>/#"><img src="<%=request.getContextPath().toString()%>/images/comment_arrow.png" alt=""/></a></p>
			  	   	   	  	</li>	
			  	   	   	  	<div class="clearfix"> </div>
			  	   	   	  </ul>
			  	   	   	  <ul class="project_box">
			  	   	   	  	<li class="mini-post-meta"><time datetime=""><span class="day">06</span><span class="month">July</span></time></li>
			  	   	   	  	<li class="desc"><h5><a href="<%=request.getContextPath().toString()%>/#">Nostrud Exer</a></h5>
			  	   	   	  		<span class="comment">15 Comments</span>
			  	   	   	  		<p>iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facil&nbsp;&nbsp; <a href="<%=request.getContextPath().toString()%>/#"><img src="<%=request.getContextPath().toString()%>/images/comment_arrow.png" alt=""/></a></p>
			  	   	   	  	</li>		
			  	   	   	  	<div class="clearfix"> </div>
			  	   	   	  </ul>
			  	   	   	  <ul class="project_box">
			  	   	   	  	<li class="mini-post-meta"><time datetime=""><span class="day">05</span><span class="month">July</span></time></li>
			  	   	   	  	<li class="desc"><h5><a href="<%=request.getContextPath().toString()%>/#">parum claram</a></h5>
			  	   	   	  		<span class="comment">10 Comments</span>
			  	   	   	  		<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laor&nbsp;&nbsp; <a href="<%=request.getContextPath().toString()%>/#"><img src="<%=request.getContextPath().toString()%>/images/comment_arrow.png" alt=""/></a></p>
			  	   	   	  	</li>	
			  	   	   	  	<div class="clearfix"> </div>
			  	   	   	  </ul>
		  	   	   	  </div>
         		</div>
         		<div class='col-md-6'>
         		  <ul class="comment_section top_grid">
         		  	<li class="comment_desc"><p>"Diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci"</p>
         		  		<br><span class="m_2"><a href="<%=request.getContextPath().toString()%>/#">-feugait nulla</a></span>
         		  	</li>
         		  	<li><i class="comment"></i></li>
         		  	<div class="clearfix"></div>
         		  </ul>
         		  <ul class="comment_section">
         		  	<li class="comment_desc"><p>"Augue duis dolore te feugait nulla facilisi. Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod"</p>
         		  		<br><span class="m_2"><a href="<%=request.getContextPath().toString()%>/#">-parum claram</a></span>
         		  	</li>
         		  	<li><i class="comment"></i></li>
         		  	<div class="clearfix"></div>
         		  </ul>
         		</div>
         	</div>
         </div>      
     </div>
     <div class="container footer">
       <div class="footer_top">
     	<div class="row">
     		<div class="col-md-2 footer_grid">
     			<h3 class="m_4">Nam liber</h3>
     			<ul class="list">
     				<li><a href="<%=request.getContextPath().toString()%>/#"> demonstr lectores</a></li>
     				<li><a href="<%=request.getContextPath().toString()%>/#"> sequitur mutationem</a></li>
     				<li><a href="<%=request.getContextPath().toString()%>/#"> notare quam</a></li>
     		    </ul>
     		</div>
     		<div class="col-md-2 footer_grid">
     			<h3 class="m_4">Nam liber</h3>
     			<ul class="list">
     				<li><a href="<%=request.getContextPath().toString()%>/#"> anteposuerit lit</a></li>
     				<li><a href="<%=request.getContextPath().toString()%>/#"> quarta decima</a></li>
     				<li><a href="<%=request.getContextPath().toString()%>/#">  videntur parum</a></li>
     		    </ul>
     		</div>
     		<div class="col-md-2 footer_grid">
     			<h3 class="m_4">Nam liber</h3>
     			<ul class="list">
     				<li><a href="<%=request.getContextPath().toString()%>/#">  nihil imperdiet</a></li>
     				<li><a href="<%=request.getContextPath().toString()%>/#"> praesent luptatum</a></li>
     				<li><a href="<%=request.getContextPath().toString()%>/#"> molestie consequat</a></li>
     		    </ul>
     		</div>
     		<div class="col-md-2 footer_grid">
     			<h3 class="m_4">Nam liber</h3>
     			<ul class="list">
     				<li><a href="<%=request.getContextPath().toString()%>/#">  euismod tincidunt </a></li>
     				<li><a href="<%=request.getContextPath().toString()%>/#"> tation ullamcorper</a></li>
     				<li><a href="<%=request.getContextPath().toString()%>/#"> suscipit lobortis</a></li>
     		    </ul>
     		</div>
     		<div class="col-md-2 footer_grid">
     			<h3 class="m_4">Nam liber</h3>
     			<ul class="list">
     				<li><a href="<%=request.getContextPath().toString()%>/#">  litterarum forma</a></li>
     				<li><a href="<%=request.getContextPath().toString()%>/#"> quinta decima</a></li>
     				<li><a href="<%=request.getContextPath().toString()%>/#"> fiant sollemnes</a></li>
     		    </ul>
     		</div>
     		<div class="col-md-2">
     			<h3 class="m_4">Nam liber</h3>
     			<ul class="list">
     				<li><a href="<%=request.getContextPath().toString()%>/#"> legunt saepius</a></li>
     				<li><a href="<%=request.getContextPath().toString()%>/#"> eleifend option</a></li>
     				<li><a href="<%=request.getContextPath().toString()%>/#"> feugiat nulla</a></li>
     		    </ul>
     		</div>
     	</div>
     	</div>
     	<div class="footer_bottom">
     	  <div class="copy">
		    <p>&copy;2014 Template by <a href="<%=request.getContextPath().toString()%>/http://w3layouts.com" target="_blank"> w3layouts</a></p>
		  </div>
		  <ul class="social">
			<li><a href="<%=request.getContextPath().toString()%>/"> <i class="fb"> </i> </a></li>
			<li><a href="<%=request.getContextPath().toString()%>/"><i class="tw"> </i> </a></li>
		  </ul>
		  <div class="clearfix"> </div>
     	</div>
     </div>
 </div>	
</body>
</html>		