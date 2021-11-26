# Setup / Run
- Start PostgreSQL
  - `systemctl start postgresql`
- Run application and check on
  - `http://localhost:8081/todos`


# Steps
1. `application.properties`
2. Add Entity (using JPA Buddy - Inspector / Palette)
3. Add Repository (using JPA Buddy - JPA Structure)
4. Add Migration file (using JPA Buddy - JPA Structure)
   1. Database-table automatically created on API Post-request 