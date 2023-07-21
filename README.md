# Assignment

# Tools and technologies used: SpringBoot with Java version 17, Maven, MySQL as database
# Used Spring initializr for creating project.
# Dependencies used
1. Spring Web
2. Spring Data JPA
3. MySQL Driver
4. Lombok
# APIs

# Below are the curl as asked - all are GET APIs:

1. Average Sale Price Overall :

curl --location 'localhost:8080/averageSalePriceOverall'

Response :
{
    "message": "Getting Average successfully !!!!",

    "responseBody": "250065.7894736842"
}

2. Average Sale Price group by Location :

curl --location 'localhost:8080/averageSalePricePerLocation' :

Response :
{
   
    "message": "Getting Average per Location successfully !!!!",

    "responseBody": "[{\"location\":\"A\",\"average\":246451.61290322582},{\"location\":\"B\",\"average\":233260.86956521738},{\"location\":\"C\",\"average\":272727.2727272727}]"

}

3. Max Sale Price :

curl --location 'localhost:8080/maxSalePrice' :

Response :
{
    
    "message": "Getting Max SalePrice successfully !!!!",

    "responseBody": "350000.0"
}

4. Min Sale Price :

curl --location 'localhost:8080/minSalePrice' :

Response :
{
    
    "message": "Getting Min SalePrice successfully !!!!",

    "responseBody": "25000.0"
}
