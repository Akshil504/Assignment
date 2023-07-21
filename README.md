# Assignment

# I have used a Maven with SpringBoot and Java version 17 and use the database of MySQL.
# I have used A Spring initializr for creating a project.
# In this project I have used a Dependency :
1. Spring Web
2. Spring Data JPA
3. MySQL Driver
4. Lombok
# There is the output on Postman App.
# End Points: 
GET : localhost:8080/averageSalePriceOverall

GET : localhost:8080/averageSalePricePerLocation

GET : localhost:8080/maxSalePrice

GET : localhost:8080/minSalePrice
# There are some Rest APIs according to your Assignment :

1. localhost:8080/averageSalePriceOverall :

curl --location 'localhost:8080/averageSalePriceOverall'

output :
{
    "message": "Getting Average successfully !!!!",

    "responseBody": "250065.7894736842"
}

2. localhost:8080/averageSalePricePerLocation :

curl --location 'localhost:8080/averageSalePricePerLocation' :

output :
{
   
    "message": "Getting Average per Location successfully !!!!",

    "responseBody": "[{\"location\":\"A\",\"average\":246451.61290322582},{\"location\":\"B\",\"average\":233260.86956521738},{\"location\":\"C\",\"average\":272727.2727272727}]"

}

3. localhost:8080/maxSalePrice :

curl --location 'localhost:8080/maxSalePrice' :

output :
{
    
    "message": "Getting Max SalePrice successfully !!!!",

    "responseBody": "350000.0"
}

4. localhost:8080/minSalePrice :

curl --location 'localhost:8080/minSalePrice' :

output :
{
    
    "message": "Getting Min SalePrice successfully !!!!",

    "responseBody": "25000.0"
}
