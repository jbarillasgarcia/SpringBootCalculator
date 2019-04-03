# SpringBootCalculator
Simple calculator microservices with Spring Boot.

## Dependencies
- spring-boot-starter-web (version 2.1.3.RELEASE)

## Recommended packages
- controller (put here your controller classes)
- service (put here your business logic classes)
- dao (put here your repository classes)
- model (put here your entity classes)

## Basic Annotations
- @SpringBootApplication
- @RestController
- @GetMapping
- @PostMapping
- @RequestParam

## Configuration file
Put your configuration file "application.yml" at /Calculator/src/main/resources

You must specify at least the server port in which services are going to be available.  For example:

server:
  port: 8085
