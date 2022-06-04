<%--
  Created by IntelliJ IDEA.
  User: Andrew
  Date: 17.03.2022
  Time: 8:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    
    <jsp:include page="../section/css.jsp" />

    <title>Profile</title>
</head>
<body>

<jsp:include page="../section/nav.jsp" />

<section class="profile">
    <div class="container">
        <div class="profile-img">
            <img src="img/George.jpg" alt="profile">
            <div class="profile-socials">
                <a href="#">
                    <img src="img/email.png" alt="mail">
                </a>
                <a href="#">
                    <img src="img/email.png" alt="mail">
                </a>
                <a href="#">
                    <img src="img/email.png" alt="mail">
                </a>
                <a href="#">
                    <img src="img/email.png" alt="mail">
                </a>
                <a href="#">
                    <img src="img/email.png" alt="mail">
                </a>
            </div>
        </div>
        <div class="profile-info">
            <div class="profile-info-top">
                <h2 class="section-title">Profile</h2>
                <div class="profile-helmet">
                    <img class="helmet-img" src="img/1646824823304.png" alt="helmet">
                </div>
            </div>
            <div class="profile-info-bottom">
                <h2 class="profile-info-name">${}--name</h2>
                <ul class="profile-info-list">
                    <li class="profile-info-line">
                        <span class="profile-info-key">Points</span>
                        <span class="profile-info-value">23</span>
                    </li>
                    <li class="profile-info-line">
                        <span class="profile-info-key">Team</span>
                        <span class="profile-info-value">Mercedes</span>
                    </li>
                    <li class="profile-info-line">
                        <span class="profile-info-key">Points</span>
                        <span class="profile-info-value">23</span>
                    </li>
                </ul>
            </div>
        </div>
    </div>
</section>
<section>
    <div class="about container">
        <h2 class="section-title about-title">About</h2>
        <div class="about-border"></div>
        <div class="about-info">
            <p class="about-text">
                He’s the driver with the motto: “If in doubt, go flat out”. George Russell has lived by it in his F1 career to date, out-qualifying seasoned team mate Robert Kubica at all 21 Grands Prix in his rookie season, putting Williams back on the podium in 2021, and landing a Mercedes race seat alongside Lewis Hamilton for 2022.That brilliant baseline speed served Russell well as he totted up titles on his way to Formula 1. The Briton stormed to the 2017 GP3 championship and delivered the 2018 Formula 2 crown under immense pressure. Spotting his potential, world champions Mercedes swooped to sign him to their junior programme in 2017, when Russell already had a DTM deal on the table. He banked more experience with practice sessions with Force India and tests for the Silver Arrows, before landing his Mercedes-powered Williams race drive.A refusal to cede ground to his rivals - and commitment to a tricky pass – underpins Russell’s winning mentality. And it’s what got him the call-up to replace Lewis Hamilton for a one-off Mercedes appearance for Sakhir 2020 when the reigning champ was struck down by Covid-19.That star turn saw Russell miss out on pole by just 0.026s and then outrace Mercedes stalwart Valtteri Bottas. Only a bungled pit stop and a heart-breaking late puncture prevented a near-certain maiden win for the up-and-coming super-sub. &nbsp;He kept his head down at Williams in 2021, scoring his first points and podium, all the while keeping his eye on the bigger prize. Having proved himself a hard worker and a tenacious talent, that prize arrived in the form of a chance to take on compatriot and seven-time champion Hamilton in identical machinery.A huge challenge, but as always, ‘Russell the Rocket’ will be going flat out.
            </p>
        </div>
    </div>
</section>
<section class="next-train cool-bg">
    <div class="container">
        <h2 class="nt-title">Next train</h2>
        <div class="nt-box">
            <div class="nt-box-info">
                <p class="nt-box-teacher">tEACHER: NAME SURNAME</p>
                <p class="nt-box-loc">lOCATION: LONDON</p>
                <a href="#" class="nt-box-btn">Join</a>
            </div>
            <div class="nt-box-img">
                <img src="../../static/img/track.png" alt="track">
            </div>
        </div>
    </div>
</section>
</body>
</html>