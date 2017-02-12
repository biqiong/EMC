Function

Implement a storage array simulator as a web service. It provides SOAP API to users. The following functions are supported:

1.      Create one or multiple LUN’s.
2.      Resize a LUN.
3.      Remove a LUN.
4.      Retrieve the information (size) of a LUN.
5.      Concurrent requests.
6.      Data persistence.

Comments

1. sql.txt is used to create database and table
2. Conn.java is used to database connect,and here use mysql database.
3. LUN.java is used to define LUN data structure.
4. LUNmanager.java is used to manipulate LUN
5. build.xml,RunService.java,StorageArray.java provide web service as well as SOAP api for user
   run RunService as Java application and open http://localhost:1080/wsServerExample?wsdl it can provide a wsdl.
   it can be used in every soap client such as Soap UI,Jmeter.it can simulator Concurrent requests in Jmeter.
6. Didn't add comment in Code since there is no complex logic.
7. all test case in StorageArrayTest are pass in my local env. run StorageArrayTest in Junit