# Setup / Run
- Install & Start PostgreSQL
  - Linux: `systemctl start postgresql`
  - Windows: manual start under *Dienste*
  - Create database
    - db name is `todo` (defined in application.properties)
    - manually created in **pgadmin**
- Run application and check on
  - `http://localhost:8081/todos`

# Setup project from repo
Same as above, but also:

- Check **JAVA_HOM** env variable
    - Windows:
      `Get-ChildItem Env:`
      `export JAVA_HOME=C:\Program Files\Java\jdk-17.0.1`
    - Linux:


# Steps
1. `application.properties`
2. Add Entity (using JPA Buddy - Inspector / Palette)
3. Add Repository (using JPA Buddy - JPA Structure)
4. Add Migration file (using JPA Buddy - JPA Structure)
   1. Database-table automatically created on API Post-request 