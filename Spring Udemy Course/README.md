
# This is a Spring-Framework Repo used for saving my projects and concepts from Online Courses.

This is intended as a reference to various different concepts, and core features used in Spring. For further documentation on concepts and features, referring to [the official docs](https://docs.spring.io/spring/docs/5.1.4.RELEASE/spring-framework-reference/) is the best way to learn and understand Spring.




# 
Here you will find a list of projects that contain Demos to core concepts, as well as Documentation within the code that explains the functions of each concept and how it operates:

# 

- [Inversion of Control](https://github.com/Ivanhola/Spring-Framework-Course-Learning/tree/master/Spring%20Udemy%20Course/BaseBallCoachApp-IoC-Example):  The Design process of externalizing, the construction and management of your objects. (Aka app outsourcing the creation and management of the objects, found in resources/applicationContext.xml)

- [Dependency Injection - Constructor Injection ](https://github.com/Ivanhola/Spring-Framework-Course-Learning/tree/master/Spring%20Udemy%20Course/CoachApp-DependencyInjection-Example): The process of injecting dependencies to a bean via the class constructor method. (This uses XML Schema based Configuration File, Legacy but still used)

- [Dependency Injection - Setter Injection ](https://github.com/Ivanhola/Spring-Framework-Course-Learning/tree/master/Spring%20Udemy%20Course/CoachApp-SetterInjection-Example): The process of injection dependencies to a bean via the class setter methods. (This uses XML Schema based Configuration File, Legacy but still used)

- [Injecting Literal Values](https://github.com/Ivanhola/Spring-Framework-Course-Learning/tree/master/Spring%20Udemy%20Course/CoachApp-LiteralValueInject-Example): The process of injecting values to class variables by using a file (a properties file in this case) In this project we have variables Email and teamName, and we can manage their values by configuring it in the sport.properties file. (Must configure the beans in the applicationContext.xml file to accept values from outside files, and name the values by using '${name}' syntax ). Code is specifically modifying the __CricketCoach.java__ class.

- [Beanscope & BeanLifeCylcle](https://github.com/Ivanhola/Spring-Framework-Course-Learning/tree/master/Spring%20Udemy%20Course/CoachApp-beanscope-Example) .. In this program you will find the different scopes in beans that Spring offers: _Singleton_ & _Prototype_ examples. beanscope examples can be found in __"beanscope-applicationContext.xml"__ file, and a demo in '__beanScopeDemo.java__'. _(Singletons will create the same instance of a bean. Prototype will create a different instance, when compared as prototype they will result in a different memory location, aka different object)_

    Bean life cycle examples can be found under __"beanLifeCycle-applicationContext.xml"__ & __"beanLifeCycleDemo.java"__ 
     _(This makes use of the TrackCoach.java class. When creating our bean we can add custom code during initialization of our     code & during the destruction of our bean)_ 
     
- [Spring Annotations - @Component("BeanID")](https://github.com/Ivanhola/Spring-Framework-Course-Learning/tree/master/Spring%20Udemy%20Course/SpringDemo-Annotations): This program is to demonstrate the use of @Component("beanID") with our classes. Using this annotation will enable us to create Spring beans, without using an xml file to manually create beans(although we'll still use an xml file to store beans within compile time to the Spring Container.)

- [Spring Annotations - @Component Default ](https://github.com/Ivanhola/Spring-Framework-Course-Learning/tree/master/Spring%20Udemy%20Course/SpringDemo-ComponentDefault): This program is to demonstrate the use of @Component without any following Arguments, where the ID of the bean will default into the name of the class it is used on, with a lowercase first letter (TestClass --> testClass) the default id of the bean would be "testClass"

- [Spring Annotations - @Autowired (Constructor Injection)](https://github.com/Ivanhola/Spring-Framework-Course-Learning/tree/master/Spring%20Udemy%20Course/SD-ComponentConstructorInjection): This program demonstrates the @Autowired Annotation use, and how you can inject dependencies (Similar to Xml dependency injections) by using Spring Annotation in a class constructor vs Manually inputing them through an xml file. Spring will automatically scan for @Components that match the requirement for dependency injection. for example __Class test = new Class(DependencyClass dependencyClass);__ @Autowired will find a bean that implements __DependencyClass__ and inject it into the constructor.

- [Spring Annotations - @Autowired (Setter Injection)](https://github.com/Ivanhola/Spring-Framework-Course-Learning/tree/master/Spring%20Udemy%20Course/SD-ComponentSetterInjection): This program demonstrates the __@Autowired__ annotation use, by injecting dependencies via _setter methods_.

- [Spring Annotations - @Autowired (Field Injection)](https://github.com/Ivanhola/Spring-Framework-Course-Learning/tree/master/Spring%20Udemy%20Course/SD-ComponentFieldInjection): This program demonstrates the __@Autowired__ annotation use, by injecting dependencies via _Field method_.

- [Spring Annotations - @Qualifier](https://github.com/Ivanhola/Spring-Framework-Course-Learning/tree/master/Spring%20Udemy%20Course/SD-AnnotationQualifierExample): This program demonstrates the usage of __@Qualifier__ Annotation, which answers the question of, What happens when __@Autowired__ finds multiple components that can inject a dependency , when Spring scans and attempts to inject a dependency into a bean?

- [Spring Annotations - @Value (Injecting literal values from a file)](https://github.com/Ivanhola/Spring-Framework-Course-Learning/tree/master/Spring%20Udemy%20Course/SD-AnnotationFileValueInjection): This program demonstrates how to read values from a _properties file_, and inject them onto our class variables by using the __@Value__ annotation. (This allows us to change the value of variables from a config value, instead of hard coding it in the program) 

- [Spring Annotations - @Scope (Defining bean scope using Annotations)](https://github.com/Ivanhola/Spring-Framework-Course-Learning/tree/master/Spring%20Udemy%20Course/SD-AnnotationBeanScope): This program demonstrates the __@Scope__ Annotation, which will define a beans scope when used _(By Default singleton)_

- [Spring Annotations - @PostConstruct & @PreDestroy (Bean Lifecycle)](https://github.com/Ivanhola/Spring-Framework-Course-Learning/tree/master/Spring%20Udemy%20Course/SD-AnnotationBeanLifecycle): This program demonstrates the __@PostConstructor__ and __@PreDestroy__ Annotations, and the usage by adding initialize and destroy methods to our beans to perform during its lifecycle.

- [Spring Configuration - @Configuration & @ComponentScan("packageName")(No XML File used to create a Spring Container for storing beans)](https://github.com/Ivanhola/Spring-Framework-Course-Learning/tree/master/Spring%20Udemy%20Course/SD-ConfigurationNoXML): This program demonstrates the __@Configuration__ and __@ComponentScan()__ usage, and how to configure beans in a Spring Container without the use of an external _XML file_.

- [Spring Configuration - @Bean (Manually adding beans to our config java class)](https://github.com/Ivanhola/Spring-Framework-Course-Learning/tree/master/Spring%20Udemy%20Course/SD-ConfigurationBeansWIthJava): This program demonstrates how to manually add beans to our _SportConfig._java class, by using Java code instead of scanning with __@Component__ Annotation. Why would we manually input beans instead of automatically scanning for them? Sometimes automatic configuration is not an option. __When?__ Let's imagine that you want to wire components from 3rd-party libraries (you don't have the source code so you can't annotate its classes with @Component), so automatic configuration is not possible.

- [Spring Configuration - @PropertySource("classpath:file.name") (Injecting values from a file using Annotation and Java code, no XML file.)](https://github.com/Ivanhola/Spring-Framework-Course-Learning/tree/master/Spring%20Udemy%20Course/SD-ConfiguratioInjectingValuesFile): This program demonstrates how to inject values into variables using the __@PropertySource__ & __@Value__ annotation, added a Change log to further facilitate the changes made for each program from here on out.

- [Spring MVC - Simple Spring app running an HTML using @RequestMapping](https://github.com/Ivanhola/Spring-Framework-Course-Learning/tree/master/Spring%20Udemy%20Course/SpringMVCDemo): This program demonstrates a very basic example of how to use __@RequesMapping__ and map a web page to a method in a @Controller Class (When it hits that controller, it will call the method/redirect to a webpage)

- [Spring MVC - Simple form data page with Thymeleaf](https://github.com/Ivanhola/Spring-Framework-Course-Learning/tree/master/Spring%20Udemy%20Course/SpringMVCDemo-FormData): This program demonstrates a very basic program that will map 2 URLS __/showForm__ & __processForm__ and pass form data from /showForm to /processForm & display it using Thymeleaf parameters.

- [Spring MVC - Adding data to our Model using a controller method](https://github.com/Ivanhola/Spring-Framework-Course-Learning/tree/master/Spring%20Udemy%20Course/SpringMVCDemo-AddDataToModel): This program demonstrates and example on how to _add_ data from an HTML form to our __Model__,_read & modify_ the data, and display it on our __View__ (read data from our controller and display it to our HTML page).

- [Spring MVC - @RequestParam Example and Usage](https://github.com/Ivanhola/Spring-Framework-Course-Learning/tree/master/Spring%20Udemy%20Course/SpringMVCDemo-RequestParamExample): This program demonstrates the usage of __@RequestParam__ which takes form data from a request and bind it to a variable, instead of using __HttpServletRequest__

- [Spring MVC - Using @RequestMapping at a controller level](https://github.com/Ivanhola/Spring-Framework-Course-Learning/tree/master/Spring%20Udemy%20Course/SpringMVC-RequestMappingController): This program demonstrates the usage of --__@RequestMapping__ on a _controller_  level vs on a _controller method_, and when to use it on a controller. Each controller method has mappings, and adding __@RequestMapping__ on a controller sets the mapping locations relative to the __@Controller @RequestMapping__ path (Example: /ControllerMappingPath/ControllerMethodMappingPath) .

- [Spring MVC - Using Form tags, TextField example. Binding object data to a model and using @ModelAttribute to retrieve data and display it to our view](https://github.com/Ivanhola/Spring-Framework-Course-Learning/tree/master/Spring%20Udemy%20Course/SpringMvc-FormTagApp): This program demonstrates how to create a model attribute using an Object, and how to set data to that object type in an HTML page, and how to retrieve it using __@ModelAttribute__ in our controller methods, which binds the data to the same Object type, which allows us to read the data in another view page.

- [Spring MVC - Added drop down list form tag, reading from a HashMap in our HTML file. displaying Countries from the hashmap](https://github.com/Ivanhola/Spring-Framework-Course-Learning/tree/master/Spring%20Udemy%20Course/SpringMvc-DropDownLists): This program demonstrates how to create a drop down list form tag, and assign data from the drop down list to a variable in our object. Also demonstrates reading from a hashmap list, and assigning data from the hashmap to the variable, and displaying it on our view template.

- [Spring MVC - Added Radio Buttons form tag example. Reading data from radio buttons and adding to our model](https://github.com/Ivanhola/Spring-Framework-Course-Learning/tree/master/Spring%20Udemy%20Course/SpringMvc-RadioButtons):
This program demonstrates the Radio Button form tag. How to create radio buttons and add data from the HTML radio button & bind it to our model "studentObj" attribute. We can then read it on our Confirmation page.

- [Spring MVC - Added Check box form tag example. Storing check box data into an array in our Student object.](https://github.com/Ivanhola/Spring-Framework-Course-Learning/tree/master/Spring%20Udemy%20Course/SpringMvc-CheckBox): This program demonstrates the usage of check box form tags. Check boxes can be used for multiple choices, and we would need an array variable to store multiple answers, we create an array and store the user input data into the array, and read it in our view.

- [Spring MVC - Hibernate Bean Validator Example & Usage](https://github.com/Ivanhola/Spring-Framework-Course-Learning/tree/master/Spring%20Udemy%20Course/SpringMVC-BeanValidation): This program demonstrates how to use form validation by checking if user input is NotNull, or the amount of characters is >=1. Introduces __@Valid__ annotation and __BindingResult__ into our controller method argument. Also demonstrates how to use thymeleaf to validate the errors based on the validation checks.

- [Spring MVC - Bean Validator V2 Picking up from our previous example](https://github.com/Ivanhola/Spring-Framework-Course-Learning/tree/master/Spring%20Udemy%20Course/SpringMVC-BeanValidationBinder): This program picks up from our [Previous](https://github.com/Ivanhola/Spring-Framework-Course-Learning/tree/master/Spring%20Udemy%20Course/SpringMVC-BeanValidation)
project. In this project we introduce the use of __@InitBinder__ to pre-process data from our controller, and we use it to trim whitespace for our validation program.

- [Spring MVC - Number Range Validation validating that a form has a value between 0-10](https://github.com/Ivanhola/Spring-Framework-Course-Learning/tree/master/Spring%20Udemy%20Course/SpringMVC-RangeValidation): This program demonstrates __@Min__ and __@Max__ annotation usage, for validating that a variable in a form is between numbers 0-10, and displaying the appropriate error message if an value is greater or less than the set _min_ & _max_.

- [Spring MVC - Regular Expression Validation, Using regex to validate a postal code field in our form](https://github.com/Ivanhola/Spring-Framework-Course-Learning/tree/master/Spring%20Udemy%20Course/SpringMVC-RegexValidation): This program demonstrates the __@Pattern(regexp)__ annotation to validate our variable in Customer.java by using regular expressions.

- [Spring MVC - Simple change to adding a @NotNull annotation to our int variable](https://github.com/Ivanhola/Spring-Framework-Course-Learning/tree/master/Spring%20Udemy%20Course/SpringMVC-IntegerNullValidation): This program demonstrates how to add the __@NotNull__ annotation to an int variable.
__PART 2__[Spring MVC - Adding beans to override the error message when inputing String values, reading from a properties file](https://github.com/Ivanhola/Spring-Framework-Course-Learning/tree/master/Spring%20Udemy%20Course/SpringMVC-IntegerNullValidationV2).

- [Spring MVC - Custom Validation & Custom Annotation example](https://github.com/Ivanhola/Spring-Framework-Course-Learning/tree/master/Spring%20Udemy%20Course/SpringMVC-CustomValidationAnnotation): This program demonstrates how to create your own Custom annotation, and using it to create your own Validation rules for the annotation. Uses __ConstraintValidator__ interface to set our own validation rules

- [Spring Boot - Hibernate, Connecting to a Database with Repository](https://github.com/Ivanhola/Spring-Framework-Course-Learning/tree/master/Spring%20Udemy%20Course/HibernateDemo): This program demonstrates how to connect & upload objects to a database using Hibernate & JPA.

- [Spring Boot - Simple RestController Example](https://github.com/Ivanhola/Spring-Framework-Course-Learning/tree/master/Spring%20Udemy%20Course/SpringBootRestDemo): Very basic example of using a RestController with Spring boot

- [Spring Boot - DevTools usage](https://github.com/Ivanhola/Spring-Framework-Course-Learning/tree/master/Spring%20Udemy%20Course/SpringBootDevToolsDemo): Added DevTools dependency which allows us to make changes in our Java classes, and reload the page for us automatically when saving the file

- [Spring Boot - Actuator Usage](https://github.com/Ivanhola/Spring-Framework-Course-Learning/tree/master/Spring%20Udemy%20Course/SpringBootActuatorDemo): Added Actuator dependency which allows us to monitor the current state of the application, we can manage the actuator endpoints in __application.properties__ , in this program we can find the actuator endpoints using __localhost:8080/actuator/info__ or any other endpoint after /actuator/XXX

- [Spring Boot - Actuator with Spring Security](https://github.com/Ivanhola/Spring-Framework-Course-Learning/tree/master/Spring%20Udemy%20Course/SpringBootActuatorSecurityDemo): Added Spring Security Dependency, this adds a login page in our actuator endpoints, which prevents sensitive information from being viewed by users without permission.
Change the password in __application.properties__ and added exclusion of __/health__ & __/info__

- [Spring Boot - Injecting Values from a properties file](https://github.com/Ivanhola/Spring-Framework-Course-Learning/tree/master/Spring%20Udemy%20Course/SpringBootPropertiesFileDemo): Previously we've learned that we can inject values into a variable from a properties file using __@Value__ annotation, we did it a bit differently in spring MVC, in this example, we make use of the __@PropertySource__ annotation in the correct file hirerarcy, to read from a seperate properties file, instead of the same __application.properties__ file.

- [Spring Boot - Configuring Server from properties file](https://github.com/Ivanhola/Spring-Framework-Course-Learning/tree/master/Spring%20Udemy%20Course/SpringBootConfigurationDemo): Quick example demonstrating the server configurations, and the various different properties you can change on your __application.properties__ file.

- [Spring Boot - CRUD Application Version 1 HIBERNATE NATIVE API](https://github.com/Ivanhola/Spring-Framework-Course-Learning/tree/master/Spring%20Udemy%20Course/SpringBootCRUD): Similar to [this program](https://github.com/Ivanhola/Spring-Framework-Course-Learning/tree/master/Spring%20Udemy%20Course/HibernateDemo), this program will demonstrate how to Create, Read, Update, Delete data from a database using the Hibernate Native API, this includes use of __EntityManager__,__DAO__,__@Transactional__ & more Native Hibernate API whereas the previous example using Spring Data JPA to communicate and interact with the database. [Here is a more recent, and finished version of this project](https://github.com/Ivanhola/Spring-Framework-Course-Learning/tree/master/Spring%20Udemy%20Course/SpringBootCRUDFinished): This adds __PUT, GET, DELETE, POST__ mappings to our __REST__ Controller, and Added a service class that delegates from our DAO Class.

- [Spring Boot - Crud application REST API, Version 2 Standard JPA](https://github.com/Ivanhola/Spring-Framework-Course-Learning/tree/master/Spring%20Udemy%20Course/SpringBootCRUDStandardJPA): Similar to our [Past program](https://github.com/Ivanhola/Spring-Framework-Course-Learning/tree/master/Spring%20Udemy%20Course/SpringBootCRUD), this project makes use of interacting with a REST API to our database, by using the __Standard JPA__ methods instead of the hibernate native API (All the changes are im __EmployeeDAOJpaImplementation.Java__).

- [Spring Boot - Crud Application REST API, Version 3 Spring Data JPA](https://github.com/Ivanhola/Spring-Framework-Course-Learning/tree/master/Spring%20Udemy%20Course/SpringBootCRUDSpringDataJPA): Program Which demonstrates the use of Spring Data JPA to create a CRUD project to interact with our database with a REST API. Made use of __JpaRepository__ and implementing a __Service__ class to interact with the __Repository__

- [Spring Boot - Spring Data REST Example](https://github.com/Ivanhola/Spring-Framework-Course-Learning/tree/master/Spring%20Udemy%20Course/SpringBootCRUDSpringDataREST): This program makes use of Spring Data REST Dependency which automatically creates a __REST Endpoint__ for our __Entity Objects__. In this program we have an __Employee__ Entity, and Spring Data Rest will create a REST API endpoint that has CRUD features, GET, POST, PUT, DELETE, at __/employees__
It essentially has all of our Rest controller methods from [this project](https://github.com/Ivanhola/Spring-Framework-Course-Learning/tree/master/Spring%20Udemy%20Course/SpringBootCRUDSpringDataJPA), without the need for an __EmployeeRestController__ & __EmployeeService__ Classes. [Added some configuration settings to this application __@RepositoryRestResource__](https://github.com/Ivanhola/Spring-Framework-Course-Learning/tree/master/Spring%20Udemy%20Course/SpringBootSpringDataRestConfiguration)

- [Spring boot + Thymeleaf basic example](https://github.com/Ivanhola/Spring-Framework-Course-Learning/tree/master/Spring%20Udemy%20Course/ThymeleafDemo): This shows Thymeleaf integration with Spring boot. Although [we have other example programs using thymeleaf](https://github.com/Ivanhola/Spring-Framework-Course-Learning/tree/master/Spring%20Udemy%20Course/SpringMvc-FormTagApp), this series will create and solely focus on thymeleaf integration, whereas the Spring MVC focused more towards the model, and other Spring MVC core subjects.

- [Spring Boot + Thymeleaf adding CSS to a Thymeleaf Template](https://github.com/Ivanhola/Spring-Framework-Course-Learning/tree/master/Spring%20Udemy%20Course/ThymeleafDemoCSS): In this program we take our [previous](https://github.com/Ivanhola/Spring-Framework-Course-Learning/tree/master/Spring%20Udemy%20Course/ThymeleafDemo) thymeleaf demo, and apply CSS stylesheet to our helloworld.html template. The CSS file must be stored under __/src/resource/static__ for spring boot to be able to read it.

- [Spring Boot + Thymeleaf Creating an HTML Table](https://github.com/Ivanhola/Spring-Framework-Course-Learning/tree/master/Spring%20Udemy%20Course/ThymeleafDemoHTMLTable): In this project we create an HTML table using Thymeleaf template by passing an ArrayList of __Employee__ objects through the __Model__ in the controller, and iterating through the arraylist using Thymeleaf looping. We use __BootStrap__ to make the table look nice. 

- [Spring Boot + Thymeleaf, Fully Functional CRUD App](https://github.com/Ivanhola/Spring-Framework-Course-Learning/tree/master/CRUDEmployeeProject): A Simple CRUD Application, Allows us to create, read, update, and delete an Employee from our Database by using Various different methods and implementations, Full Documentation on the README of that program.

_These are just demos and concepts, further explanation into these concepts and demonstrations are further documented in google docs Notes that I have organized and taken._
