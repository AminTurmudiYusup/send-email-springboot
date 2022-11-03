# send-email-springboot
In this project describe how to send email using gmail smtp in spring boot app
How to send email in springboot using google smtp
Prerequisite
1. you already familiar create spring boot app from scracth
2. You know concept mail server, smtp, imap, pop3
3. You know concept when email send by sender and receipt by receiver
4. You already created google account and do 2-step verification(this is my account)
5. your google account have an App Password to use for login from spring boot app to mail server(google smtp)= i have one app password to login smtp via spring boot app
6. you already know how to config admin lte template with thymeleaf(if not, you can see my previous tutorial)

in this tutorial i will use this scenario
1. open page for compose mesage
2. set the receiver email
3. set subject
4. set Message
5. when all field filled
6. send email to receiver
7. check if email already received



Let's jump right in 
1. add dependency in pom.xml
2. setting gmail smtp inside application.properties
3. create model inside model package
4. create controller to handle request from ui 
5. create compose-page.html( if you not familiar to integrate thymeleaf with spring boot, see my previous tutorial = https://www.youtube.com/watch?v=VWk9teiceX8&t=4s)
5. create service to handle request from controller and forward request to mail server using smtp gmail

try to run app!!!


SUCCESS , happy learning and happy sharing.
You can fork this tutorial on mya github
