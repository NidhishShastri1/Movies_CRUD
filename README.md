🎬 Movie CRUD Application

A full-stack web application built using Spring Boot + Thymeleaf + Bootstrap, where users can add, view, and explore movies with integrated trailers and IMDb ratings.

This project demonstrates modern UI design with an elegant cinematic theme, clean CRUD operations, and dynamic IMDb data fetching.

🚀 Features

✅ Add new movies with name, description, image, trailer link, and rating

✅ View all movies in a stylish table layout with posters and autoplaying trailers

✅ Responsive design using Bootstrap 5

✅ Thymeleaf integration for smooth server-side rendering

✅ Optional “Play with Sound” trailer feature for user-controlled playback

🏗️ Tech Stack
| Layer          | Technology                                            |
| -------------- | ----------------------------------------------------- |
| **Frontend**   | HTML, CSS, Bootstrap 5, Thymeleaf                     |
| **Backend**    | Spring Boot                                           |
| **Database**   | MySQL / H2 (configurable)                             | 
| **Build Tool** | Maven                                                 |


⚙️ Setup & Installation

1 Clone the repository
git clone https://github.com/yourusername/movie-crud.git
cd movie-crud

2️ Configure database

In src/main/resources/application.properties, set your database credentials:

spring.datasource.url=jdbc:mysql://localhost:3306/movies
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update

3. Run the application

mvn spring-boot:run

4. Open in browser

http://localhost:8080
