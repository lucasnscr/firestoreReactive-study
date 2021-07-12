# Firestore Reactive Study

### Project description
Project that creates a repository implementing a crud reactive with firestore and google cloud


## Installation ##

It is necessary to install some items:
- Google Cloud account
- Java
- Maven

### Firestore
Cloud Firestore is a flexible and scalable database for development focused on mobile devices, web and servers from Firebase and Google Cloud. Like Firebase Realtime Database, it keeps your data in sync across client applications through realtime listeners. Plus, it offers offline support for mobile devices and the web so you can build responsive apps that work regardless of network latency or Internet connectivity. Cloud Firestore also offers seamless integration with other Firebase and Google Cloud products, including Cloud Functions.

### Reactive Database
Java uses JDBC as the primary technology to integrate with relational databases. JDBC is of a blocking nature – there’s nothing sensible one could do to mitigate the blocking nature of JDBC. The first idea for how to make calls non-blocking is offloading JDBC calls to an Executor (typically Thread pool). While this approach somewhat works, it comes with several drawbacks that neglect the benefits of a reactive programming model.

Thread pools require – no surprise – threads to run. Reactive runtimes typically use a limited number of threads that match the number of CPU cores. Additional threads introduce overhead and reduce the effect of thread limiting. Additionally, JDBC calls typically pile up in a queue, and once the threads are saturated with requests, the pool will block again. So, JDBC is right now not an option.

### Technologies

The following technologies were used to carry out the project:
- Java 11
- Maven
- SpringBoot
- Spring Webflux
- Spring Cloud GCP
- Firestore
- Project Reactor
