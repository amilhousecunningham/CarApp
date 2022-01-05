# CarApp
Created Car App in Java 

# OVERVIEW & PURPOSE
You will create a Car App that utilizes the Java skills you have learned thus far.

# ACTIVITY
1. Fork project to your Github account
2. Copy the HTTPS URL from the "Code" button
3. Open your terminal (Git bash) and navigate to the appropriate location where you wish to save the folder to. 
4. Enter: git clone URL-you-Copied-goes-here
5. Open IntelliJ and open cloned project
6. Create a src directory in the Car-Gen directory (if needed)
7. Click on New -> Package. Name package: com.example.car_gen (inside the src directory)
8. Right click on the package you just created and click on New -> Java Class. Name it Main. This will be the entry point for your application.
9. Open your Main Class and create a main method.
10. Right click on the package you just created and click on New -> Java Class. Name it Car. This is where we will write all of our methods for dealing with our Car class.
11. Right click on the package you just created and click on New -> Java Class. Name it Toyota. (This class should extend your Car class)
12. Right click on the package you just created and click on New -> Java Class. Name it Lexus. (This class should extend your Car class)
13. Right click on the package you just created and click on New -> Java Class. Name it Honda. (This class should extend your Car class)
*** Make all your instance fields private and all your classes and methods public 

14. Your Car class should have the following instance fields. Do not set any values unless noted.
a. Type String with the name color
b. Type int with the name year
c. Type int with the name speed (initial value 0)
d. Type int with the name maxSpeed
e. Type boolean with the name isElectric

15. Your Lexus class should have an instance field of type boolean with the name hasLeatherSeats. Do not set a value here.

16. Your Honda class should have an instance field of type boolean with the name isTurboCharged. Do not set a value here.
17. Your Toyota Class should have an instance field of type boolean with the name greatGasMileage. Do not set a value here.
18. In your Car class, create a constructor which takes in the following parameters(, String color, int year, int maxSpeed)
19. In your Lexus class, create a constructor which takes in the  parameters from the parent class and boolean hasLeatherSeats
20. In your Honda class, create a constructor which takes in the parameters from the parent class and boolean isTurboCharged
21. In your Toyota class, create a constructor which takes in the parameters from the parent class and boolean greatGasMileage
22. Properly implement a super() method in each child class constructor
23. In your Car class, create getters and setters for each instance field. Do the same within your Toyota, Lexus, and Honda classes.


24. Test your Classes. Over in your Main Class::
    a. Create an  instance of your Honda Class and call it civic. 
    b. Create an instance of your Lexus Class and name it rx350. 
    c. Create an instance of your Toyota Class and name it supra. 
    d. Use System.out.println() to print out the value of the color for each instance you’ve created. For example, System.out.println(audiCoupe.getColor());

25. In your Car class, create a method and name it accelerateSpeed. This method should not return anything and should increase the car speed by five MPH. Make sure the speed doesn’t go above the vehicle's maxSpeed value.
*** Test your method. Over in your Main Class, call your accelerateSpeed() method on one of your Car objects and view the results. (You can use System.out.println() to see the results from the method call.)

26.In your Car class, create a method and name it decelerateSpeed. This method should not return anything and should decrease the car speed by five MPH. Make sure the speed doesn’t go below 0 MPH.
*** Test your method. Over in your Main Class, call your decelerateSpeed() method on one of your Car objects and view the results. (You can use System.out.println() to see the results from the method call.)

27. In your Car class, create a method and name it convertToElectric. This method should not return anything and should change the value of isElectric to true. If the value of this field is already set to true the method should display a message to the user stating that the Car is already electric.
*** Test your method. Over in your Main Class, call your convertToElectric() method on one of your Car objects and view the results. (You can use System.out.println() to see the results from the method call.)

28. Push your changes up to your repository. From your git bash terminal, enter the following commands:
a. git add .
b. git commit -m “First Commit”
c. git push -u origin main

29. Go to your GitHub repository. You should see your changes.

30. Create pull request.
*** If you finish early, consider adding some additional functionality of your own. Be creative. Ex. ensure that speed does not exceed max speed.
