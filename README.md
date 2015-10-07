# Petagram
A Instagram-like Photo Sharing Web Application for Cute Animals

Functions: 
  - Follow, Like, Comment, Post, Upload photos, Search photos, Login via Instagram or Twitter, and Repost to Twitter
  - Fetched photos automatically from Instagram and Twitter APIs, and restored them into local database
  - Visualized user statistics using Google Charts

Architechture:
  - Java-J2EE MVC Design Patten

Implementation:
  - Front-end: Java Servlet, Apache Tomcat, HTML5, CSS, JavaScript
  - Back-end: MySQL

File Structure: 
  - Packages
    - model
      - Model
      - all DAOs
      - MYSQLConfig
    - controller
      - Action (abstract class)
      - all Actions
    - databeans
    - databeans.instagram
    - databeans.twitter
    - formbeans
    - thirdPartyAPI
      - Instagram
      - Twitter
    - util
    - worker
      - loading data from APIs to local db

How to configure: 
  - Directly import from your Eclipse 
    --File
      --Import
        --Git
          --Project from Github
  - Clone the repository from your Github Client
      --Import Exisiting project
