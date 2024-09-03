# 2.3 Gravity

This lab comes from MIT's Introduction to Programming in Java course.

#### **Objective:**
In this assignment, you will create a program that computes the distance an object will fall in Earth's gravity by using a static method within a class.

#### **Instructions:**

1. **Create a New Class:**
   - Create a new class called `GravityCalculator`.

2. **Create a Static Method:**
   - Inside the `GravityCalculator` class, create a static method called `calculateFinalPosition` that takes the following parameters:
     - `double gravity`- The acceleration due to gravity (-9.8 m/s²)
     - `double initialVelocity` - The initial velocity of the object (in m/s).
     - `double fallingTime` - The time the object has been falling (in seconds).
     - `double initialPosition` - The initial position of the object (in meters).
   - The method should return the final position of the object using the formula:

        
        y = 0.5 * gravity * (fallingTime<sup>2</sup>) + initialVelocity * fallingTime + initialPosition
        


3. **Modify the `main` Method:**
   - In the `main` method of the `GravityCalculator` class, do the following:
     - Define the variables `initialVelocity`, `fallingTime`, and `initialPosition` with appropriate values.
     - Call the `calculateFinalPosition` method and store the returned value in a variable named `finalPosition`.
     - Print the `finalPosition` with a message indicating the object's position after the specified falling time.

4. **Run the Program:**
   - Run the program in your IDE.

