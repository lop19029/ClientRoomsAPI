# ClientRoomsAPI
Meeting rooms manager using Java Spring Boot.

You can also access the front end app here:
https://github.com/lop19029/ClientRoomsFrontEnd

## Workspace environment

- Java 11
- Maven 3.8.1
- IntelliJ IDE

## How to get started?
Start the spring application by running the `mavenw` binary with the command `./mavenw spring-boot:run`. 

Since we don't have an interface yet, use the `curl` command to add some some records in the h2 database.
`curl -H "Content-Type: application/json" -d '{ "name": "Digital Innovation One", "date": "10/09/2021", "startHour": "19hs", "endHour": "21hs" }' http://localhost:8082/api/v1/rooms | json_pp`

Run the command `curl http://localhost:8082/api/v1/rooms | json_pp` to check your room.

You should get something like this:

```bash
[
   {
      "name" : "Digital Innovation One",
      "startHour" : "19hs",
      "endHour" : "21hs",
      "id" : 1,
      "date" : "10/09/2021"
   }
]
```
Hurray! This means that your Spring Boot REST API is working now.

This project was built during the Santander Full-stack developer bootcamp on [Digital Innovation One Platform](https://web.digitalinnovation.one/)

Author: [Alex Lopez](https://github.com/lop19029)
