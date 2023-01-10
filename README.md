# Spring Boot + Mongo DB + Docker Hellow World Example 


# Technologies 
1- Spring Boot
2- Mongo DB
3- Docker 

# Steps To Run The App 
1- Download Source Code
2- Update maven Dependencies => mvn clean install
3- Run DB Container Using 
  A- docker run -d --name mongo-on-docker -p 27017:27017 mongo => This will start mongo server on port 27017 with no authenticatin
  B- docker run -d --name auth-mongo -e MONGO_INITDB_ROOT_USERNAME=root -e MONGO_INITDB_ROOT_PASSWORD=root -p 3000:27017 mongo => Start DB server with [root] as a user and a password
4- Run Spring Boot App 



# Apis 
1- save a new Proudct 
URL: http://localhost:8080/api/product / POST 
Body: 
{
    "id": "1",
    "name": "NAME",
    "category": "OTHER",
    "amount": 20
}

2- Update a Product
URL: http://localhost:8080/api/product  / PUT
Body: 
{
    "id": "1",
    "name": "NEW-NAME",
    "category": "OTHER",
    "amount": 20
}


3- delelte a product with a specific ID 
URL:http://localhost:8080/api/product/3 / DELTE


4- list all products 
URL: http://localhost:8080/api/product  / GET


5- save a new Proudct 
URL: http://localhost:8080/api/product/name / GET



# create / run an image from the app  
1- mvn clean install

2- docker build -t image-name . -f Dockerfile

3- docker run -d --name container-name -p 8080:8080 image-name

Don't Forget To Start DB container first 

