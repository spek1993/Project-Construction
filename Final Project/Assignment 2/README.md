# Restful API
RESTful API for CRUD operations, developed with Spring Boot in Java.

# Function
Six RESTful APIs for the Game Store web application.

API                       | Description         | URL
--------------------------|---------------------|--------------
GET /api/products         | Get all products    | GET [http://localhost:8080/api/products](http://localhost:8080/api/products)
GET /api/products/{id}    | Get a product by ID | GET [http://localhost:8080/api/products/1](http://localhost:8080/api/products/1)
POST /api/products        | Add a new product   | POST [http://localhost:8080/api/products](http://localhost:8080/api/products)
PUT /api/products/{id}    | Update a product    | PUT [http://localhost:8080/api/products/1](http://localhost:8080/api/products/1)
DELETE /api/products/{id} | Delete a product    | DELETE [http://localhost:8080/api/products/1](http://localhost:8080/api/products/1)
POST /api/upload          | Upload an image     | POST [http://localhost:8080/api/upload](http://localhost:8080/api/upload)

# Setup Locally
```bash
git clone https://github.com/jojozhuang/restful-api-springboot.git
mvn spring-boot:run
```
Access http://localhost:8080/api/products in web browser or PostMan, you should get the following JSON as response.
```json
[  
   {  
      "id":3,
      "productName":"Wireless Controller",
      "price":19.99,
      "image":"http://localhost:8080/images/controller.jpg"
   },
   {  
      "id":2,
      "productName":"Wii",
      "price":269.0,
      "image":"http://localhost:8080/images/wii.jpg"
   },
   {  
      "id":1,
      "productName":"Xbox 360",
      "price":299.0,
      "image":"http://localhost:8080/images/xbox360.jpg"
   }
]
```

Change base url of images. Edit `application.properties` file, set `spring.profiles.active` to `prod`.
```shell
spring.profiles.active=prod
```
Then, restart the app.
```shell
mvn spring-boot:run
```
In addition, you can also run the app in production mode with `java -jar`. First, package the app.
```shell
mvn package
```
Then, launch the application with `java -jar` and append `--spring.profiles.active=prod`. 
```shell
java -jar target/restful-spring-boot-0.0.1-SNAPSHOT.jar --spring.profiles.active=prod
```

# Deploy to Heroku
Follow tutorial [Deploying Spring Boot RESTful API to Heroku](https://jojozhuang.github.io/tutorial/deploying-spring-boot-restful-api-to-heroku) to deploy this Spring Boot app to [Heroku](https://www.heroku.com/).

Follow tutorial [Continuously Deploy Spring Boot App to Heroku with Travis-CI](https://jojozhuang.github.io/tutorial/continuously-deploy-spring-boot-app-to-heroku-with-travis-ci) to continuously deploy this Spring Boot app to [Heroku](https://www.heroku.com/) with [Travis-CI](https://travis-ci.com/).

Add `Config Vars` to enable production mode in heroku. Go to https://dashboard.heroku.com/apps/gamestore-api/settings, add key value as follows.
- KEY: SPRING_PROFILES_ACTIVE
- VALUE: prod

The available RESTful API on Heroku is
* baseURL: https://gamestore-api.herokuapp.com/

For example, request https://gamestore-api.herokuapp.com/api/products to get all products.

# Portfolio
Read portfolio [Game Store(Angular)](https://jojozhuang.github.io/project/game-store-angular) or [Game Store(React)](http://jojozhuang.github.io/project/game-store-react) to learn how these RESTful APIs are consumed by Angular and React applications.

# Tutorial
Read tutorial [Building RESTful API with Spring Boot](https://jojozhuang.github.io/tutorial/building-restful-api-with-spring-boot) to learn how this RESTful API is built.
