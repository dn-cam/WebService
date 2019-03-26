1. steps to build and run the application:   

mvn clean  

mvn install  

mvn spring-boot:run  


2. Once the App has been started on the localhost (I used the port 8080), run the following commands:  

list of all employees: localhost:8080/employees    
highest Paid Employee: localhost:8080/highest    
top N Paid Employees: localhost:8080/topN/{no}    
lowest N Paid Employees: localhost:8080/bottomN/{no} .  
