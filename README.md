You have joined a team commissioned by Whiteley's Zoo to create their new website.  Building and improving on the source code provided, we'd like you to showcase an initial release developed to meet the following requirements:

Site Features
=============
1) Basic user registration and login.   

  GOAL: The core logic is in place, but you need to add validation and map the "Sex" User property to the database.

  Mandatory user details required on registration:
  - Username (unique across all users)
  - Password
  - Sex
  - Date of Birth
  - UK Post Code

2) Ability to select, save and subsequently modify a logged-in user's collection of favourite animals.   

   GOAL: Introduce the association between a user and their favourite animals and ensure this feature works as expected.

   The pages have been designed and the skeleton User and Animal concepts have been implemented, but the ability to associate favourite animals to users has not been considered yet.

What we've given you...
=================
* We've provided the skeleton code and a Maven build file that will download all the required libraries, build, package and deploy your application to Jetty for testing.


Some of the things we're looking for...
=======================================
* An efficient and elegant solution that meets the GOALs outlined above.
* Consideration of software quality
* Outside of the GOALs above, thoughts on how we could improve the current implementation (we'll discuss this at the Tech I/V)

What we're not looking for...
===================================
* A complete rewrite of the system.  We will discuss alternative approaches considered in the Technical Interview.
* Requirements/specification documentation
* Too much time spent on the presentational aspects of the site

What you must deliver
=====================
* A zip file or compressed-tarball with your updated source code and config


Prerequisites
========
* An internet connection so Maven can download all the 3rd party libraries
* Java 1.6
* Maven 2.0.9 


How to build and deploy
================
Navigate to the folder with pom.xml and run 
> mvn clean install jetty:run

Then hit http://localhost:8080/whiteley-zoo
