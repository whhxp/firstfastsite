<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="example.ajax.*" %> 
<%@ page import="java.util.*" %>   
<%
	Note note=Note.getInstance();
	request.setAttribute("note",note);
	request.setAttribute("br",Note.randomBr());
%>   

<%@page import="java.util.Random"%><html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<script language="JavaScript" >
	
function upFun()
{
	var oUp=document.getElementById("up");
	
	oXmlHttp = getXmlHttp();
		
	//oXmlHttp.open("get","up.txt",true);
	oXmlHttp.open("get","NoteNoRefreshBack.jsp",true);
	
	oXmlHttp.onreadystatechange=function(){
		if(oXmlHttp.readyState == 4)
		{
			//alert(oXmlHttp.responseText);

			//alert(oUp.innerHTML);
			oUp.innerHTML=oXmlHttp.responseText;
			//oUp.innerHTML="30";
			//alert(oUp.innerHTML);
		}
	}
	oXmlHttp.send(null);


}

function getXmlHttp()
{
		// Provide the XMLHttpRequest class for IE 5.x-6.x:
	// Other browsers (including IE 7.x-8.x) ignore this
	//   when XMLHttpRequest is predefined
	/*
	if (typeof(XMLHttpRequest) == "undefined") 
	{
		XMLHttpRequest = function() {
			try { return new ActiveXObject("Msxml2.XMLHTTP.6.0"); }
			catch(e) {}
			try { return new ActiveXObject("Msxml2.XMLHTTP.4.0"); }
			catch(e) {}
			try { return new ActiveXObject("Msxml2.XMLHTTP.3.0"); }
			catch(e) {}
			try { return new ActiveXObject("Msxml2.XMLHTTP"); }
			catch(e) {}
			try { return new ActiveXObject("Microsoft.XMLHTTP"); }
			catch(e) {}
			throw new Error("This browser does not support XMLHttpRequest.");
		};
	}*/
	 
	oXmlHttp = new XMLHttpRequest();
	return oXmlHttp;
}
</script>
<title>有刷新投票</title>
</head>
<body>
  
     ${br}
	<div> 投票内容 : ${note.title}</div>
	<a href="#"  onclick="upFun();" > 顶</a>: <span  id="up"> ${note.upNum}</span> <br />
	  <a href="NoteRefresh.jsp?operate=down">踩有刷新的踩</a> <span id="down"> ${note.downNum}</span>
	
	
	<!-- 以下的内容就是为了显出出刷新效果,从http://apache.org 复制 -->
	<div class="block">
		<div class="column span-24">
      <div id="header">
                          <h1>The Apache Software Foundation<br>
  <span class="alt"><small>Celebrating a Decade of Open Source Leadership.</small></span></h1><p class="blurb">The Apache Software Foundation provides support for the Apache community of open-source software projects.  The <a href="http://projects.apache.org/">Apache projects</a> are characterized by a collaborative, consensus based development process, an open and pragmatic software license, and a desire to create high quality software that leads the way in its field.</p><p class="highlight">We consider ourselves not simply a group of projects sharing a server, but rather a <em>community of developers and users</em>.</p>

               </div>
      </div>
	</div>
	<hr>
	<div class="block">
    		<div class="column span-15 first append-1">
			<h3>
                          Latest News
              </h3>

		</div>
		<div class="column span-8 las search">
    			<form action="http://www.google.com/search" method="get">
		         <input value="*.apache.org" name="sitesearch" type="hidden">
		         <input size="10" name="q" id="query" type="text">
		         <input name="Search" value="Go" type="submit">
	       </form>
		</div>
	</div>

	<div class="block content">
		<div class="column span-15 colborder">
                            
<div class="section-content">
<p><em>If you would like to keep up with news and announcements from the foundation and all its projects, you can subscribe to the <a href="foundation/mailinglists.html#foundation-announce">Apache Announcements List</a> or you can subscribe to <a href="https://blogs.apache.org/foundation/">our foundation blog</a></em>. Latest blog entries:</p>

<h4>
   If it's not at apache.org, it's not from the Apache Software Foundation!

</h4>
<div class="section-content">
<div>
A number of websites have "apache" in their domain name, and sometimes pretend to be official sources of information about projects of the Apache Software Foundation (ASF). How do you find out if it's the case?<br><br>The rule is very simple: if a website is not hosted on an apache.org domain, it's not a website of the ASF (with a few exceptions, see below).<br><br>In other words, if the site's address doesn't end with .apache.org, it's not ours. Note the dot before apache.org: fooapache.org or apachefoo.org wouldn't belong to us, whereas foo.apache.org does.<br><br>The only exceptions to that rule are apachecon.com, which is jointly managed between<br>the ASF and companies producing our conferences, and spamassassin.org and myfaces.org, for historical reasons.<br><br>So remember: if it's not at apache.org or one of the three above domains, it's not from us!
</div>
</div>

<h4>
   Apache Asia Roadshow 2009: Bejing, China, and Colombo, Sri Lanka
</h4>
<div class="section-content">

<div>
<p>The <a title="Apache Asia Roadshow" href="http://wiki.apache.org/apachecon/ApacheRoadshowAsia09Beijing">Apache Asia Roadshow</a> in Bejing, China is over; thanks to all who participated in this successful gathering.</p><p>Now onto <a title="Apache Asia Roadshow: Colombo" href="http://twitter.com/apacheasia">Colombo, Sri Lanka</a>. We hope to see you there!</p>
</div>
</div>

<h4>
   The Apache Software Foundation, live on Times Square and in Vegas!
</h4>
<div class="section-content">

<div>
<p><img src="http://blogs.apache.org/foundation/resource/asf-photos/apache-10-timessquare.jpg" style="float: right;">Thanks to our very own Sally Khudairi, VP Marketing and Publicity, the ASF's 10 years shout out was recently displayed on New York's Times Square and in Las Vegas - and we have visual evidence!</p><p>&nbsp;</p>

<img src="http://blogs.apache.org/foundation/resource/asf-photos/apache-10-prnewswire-vegas.jpg" style="clear: right;">
</div>
</div>

<h4>
   Governor Schwarzenegger and Mayor Dellums honor the Apache Software Foundation
</h4>
<div class="section-content">
<div>
<p>
As mentioned in a <a href="https://blogs.apache.org/foundation/entry/apachecon_us_2009_draws_unprecedented">previous post</a>, California Governor Arnold Schwarzenegger and Oakland Mayor Ron Dellums have recently recognized The Apache Software Foundation for a decade of open source leadership and technology innovation. 

</p>
<p>
Mayor Dellums proclaimed November 4th, 2009 as <i>the Apache Software Foundation Day</i>!
</p>
<p>
Here are their letters, as presented last week at <a href="http://us.apachecon.com/c/acus2009/">ApacheCon US 2009</a> in Oakland, CA. Click on the thumbnails for larger images.
</p>
<table>
<tbody><tr>
<td>
<a href="http://blogs.apache.org/foundation/resource/oakland-letters/Gov-CA-Congrats-ASF.jpg">
<img src="http://blogs.apache.org/foundation/resource/oakland-letters/Gov-CA-Congrats-ASF-300.jpg" style="border: medium none ;">

</a>
</td>
<td>
<a href="http://blogs.apache.org/foundation/resource/oakland-letters/Mayor-OAK-ASF-Day.jpg">
<img src="http://blogs.apache.org/foundation/resource/oakland-letters/Mayor-OAK-ASF-Day-300.jpg" style="border: medium none ;" align="right">
</a>
</td>
</tr>
</tbody></table>
</div>
</div>

<h4>
   ApacheCon US 2009 Draws Unprecedented Support From the Global Open Source Community and Recognition for the 10th Anniversary and Influence of The Apache Software Foundation
</h4>
<div class="section-content">

<div>
<b><i>California Governor Arnold Schwarzenegger and Oakland Mayor Ron
Dellums recognize The Apache Software Foundation for a decade of open
source leadership and technology innovation</i></b>

													
																					<p>FOREST
HILL, Md., Nov. 11 /PRNewswire-USNewswire/ -- Closing out the
celebrations for its 10th anniversary, The Apache Software Foundation
(ASF) today announced highlights from ApacheCon US 2009, which took
place November 2-6, 2009 in Oakland, Calif. The Foundation received
unprecedented support and recognition as testament to the growing
strength and influence of the global Apache community. During the week,
The ASF was honored by California Governor Arnold Schwarzenegger and by
Oakland City Mayor Ron Dellums for the key technologies developed,
overseen, and shepherded by the all-volunteer organization over the
last decade. November 4 has been designated Apache Software Foundation
Day.</p>

													
																					

													
																					<p>ApacheCon
is the official user conference for The ASF. The event attracted more
than 600 attendees from the global Apache community, and featured the
most extensive conference program to date with more than 100 hours of
trainings, over 90 sessions, 25 BarCampApache discussion groups, 11
project MeetUps, two days of code collaboration at the Hackathon, and
numerous entertaining Lightning Talks. Dozens of corporate sponsors,
exhibitors, and community and media partners helped make this year's
ApacheCon among the most popular events to date.</p>

													
																					<p>Conference highlights include:</p>

													
																					<ul><li>Thought-provoking
keynotes, including the Apache Pioneers Panel reuniting ASF founding
members and early contributors; Brian Behlendorf on how the Open Source
movement has positively impacted social change; and Kirrily Robert on
the role of women in Open Source.</li><li>Subversion, the award-winning
Open Source version control and software configuration management tool,
formally submitted itself to the Apache Incubator with the aim of
becoming an ASF Top-Level Project.</li><li>Several Apache projects also
celebrated their 10th anniversary, including Apache XML, Apache
Jakarta, Apache Cocoon, Apache Xerces, Apache Ant, and Apache Tomcat,
who debuted Tomcat 7.0 during the conference.</li><li>The Apache
Directory project announced a newly-formed alliance between the
OpenLDAP Foundation and the ASF, created to drive various industry
standards. The Project also released version 1.5 of its Apache
Directory Studio product during the event.</li><li>ASF Platinum Sponsor
Microsoft announced that they will be renewing their sponsorship for
the upcoming year, bolstering both their involvement in the ASF as well
as with numerous Apache projects.</li><li>An unprecedented number of
MeetUps were held throughout the week drawing attendees en masse to
participate in discussions on popular Open Source projects such as
NoSQL, Apache Tomcat, Apache Hadoop, Apache Maven, OSGi, and Subversion.</li><li>The
ASF's 10th Anniversary was cited by numerous publications, members of
the Open Source community, industry foundations, corporate users, and
individuals.</li><li>The ASF's Big Feather Birthday Bash was followed
by a rave-style afterparty that kicked off with music DJ'ed by "Vitamin
B" -- a.k.a. ASF co-founder Brian Behlendorf.<br></li></ul>

													
																					<p><b>Community Driven, Community Supported </b></p>

													
																					<p>New
to ApacheCon US 2009 was the project-driven conference program, whose
scope, sessions, and speakers were selected by the Apache Projects
themselves for their respective tracks. Since its incorporation, The
ASF has maintained a strong focus on developing leading software
through a meritocratic process supported by the community and fueled by
the passion and ideas of the community. Through the support of its
Membership, committers, sponsors, partners, and other Open Source
software communities, The ASF continues to develop quality software the
"Apache Way." </p>

													
																					<p>ApacheCon extends its utmost gratitude to supporters and to sponsors of this year's conference, which include:</p>

													
																					<ul><li>Platinum Sponsors Microsoft and thawte; </li><li>Premier
Sponsors CollabNet, Hewlett-Packard, Hippo, HotWax Media, Lucid
Imagination, Progress Software, SourceForge, and SpringSource; </li><li>Community
Sponsors and Exhibitors The Apache Software Foundation, Aster Data
Systems, Cloudera, Day Software, Facebook, HALO Worldwide, LinkedIn,
Mark Logic, MuleSoft, Ning, OSS Watch, Sun Microsystems, ThinkGeek, and
WSO2; and </li><li>Community and Media Partners: FeatherCast, Linux
Journal, LinuxPro Magazine, Manning Publications, Methods &amp; Tools,
MOO, NLUUG, Opensourc3, openSUSE, OStatic, Slashdot, Sourcesense, The
Bitsource, WiLine, and WSO2 Oxygen Tank.<br></li></ul>

													
																					<p>The
ASF continues its outreach to local communities with the upcoming
ApacheCon Roadshow Asia, taking place in Beijing, China 28-29 November,
and Colombo, Sri Lanka 3-5 December 2009.</p>

													
																					<p><b>Event Resources</b></p>

													
																					<ul><li>Recorded
Sessions: With the support of LinuxPro Magazine and CollabNet, The ASF
was able to "live stream" select sessions from ApacheCon US 2009.
Archived recordings will be available November 13 at <a href="http://www.techcast.com/events/apacheconus09/"><u>http://www.techcast.com/events/apacheconus09/</u></a>.</li><li>Presentations: Slides from ApacheCon sessions will be posted off the ApacheCon website at: <a href="http://www.us.apachecon.com/c/acus2009/"><u>http://www.us.apachecon.com/c/acus2009/</u></a>.</li><li>Video
Shout Outs: Many attendees and community members shared their thoughts
on Apache. Check out a catalog of videos on the Apache community
YouTube channel: <a href="http://www.youtube.com/user/TheApacheWay"><u>http://www.youtube.com/user/TheApacheWay</u></a>. </li><li>Upcoming Events: Stay on top of upcoming ApacheCon events and BarCamps by following @ApacheCon on Twitter.<br></li></ul>

													
																					<p><b>About ApacheCon</b></p>

													
																					<p>The
official user conference, trainings, and expo of The Apache Software
Foundation draws attendees from the global Open Source community for
unparalleled educational, networking, hacking, and social
opportunities. ApacheCon is co-produced by The Apache Software
Foundation and Stone Circle Productions, and has grown to be among the
premier events for cutting-edge Open Source technologies and industry
best practices. Held semi-annually in Europe and North America, smaller
ApacheCon community-focused events also take place in Asia. For more
information, visit <a href="http://www.apachecon.com/"><u>http://www.apachecon.com/</u></a><a href="http://www.apachecon.com/" target="_blank"><u>.</u></a></p><p>&nbsp;Update: <a href="https://blogs.apache.org/foundation/entry/governor_schwarzenegger_and_mayor_dellums">Governor Schwarzenegger and Mayor Dellums' letters</a> are now available online. </p>
	
</body>
</html>