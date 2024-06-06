# Magical Arena

## Overview
Magical Arena is a simple combat simulation game where two players battle until one player's health reaches zero. Each player has attributes such as health, strength, and attack power. 
The game simulates turns where each player attacks and defends based on dice rolls.

## Features
- Interactive input for player attributes.
- Simulated battle with turn-based attacks and defenses.
- Outputs the results of each turn and declares a winner.

## Requirements
- Java 8 or higher
- IntelliJ IDEA or any other Java IDE
- JUnit 5 for testing

## Project Structure
MagicalArena/
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ ├── Main.java
│ │ │ ├── Player.java
│ │ │ └── Arena.java
│ ├── test/
│ │ ├── java/
│ │ │ └── ArenaTest.java
├── README.md

## How to Run the Code

--Using IntelliJ IDEA

1. Clone the Repository:
   ```Git Bash
   git clone <repository-url>
   cd MagicalArena

2. Open the Project in IntelliJ IDEA:

--Open IntelliJ IDEA.
--Click on File > Open... and select the MagicalArena directory.
--Run the Main Class:

3. Navigate to src/main/java/Main.java.
--Right-click on Main.java and select Run 'Main.main()'.
--Follow the prompts in the console to enter player attributes.
--Run Unit Tests:

4. Navigate to src/test/java/ArenaTest.java.
--Right-click on ArenaTest.java and select Run 'ArenaTest'.


## Code Explanation ##
``` Main.java```
This class contains the main method, which prompts the user to enter attributes for both players and starts the fight simulation.

``` Player.java```
This class represents a player in the game, with attributes for health, strength, and attack. It contains methods to handle attacking, defending, and checking if the player is alive.

``` Arena.java```
This class handles the combat between two players. It alternates turns between the players, processes attacks and defenses, and prints the results after each turn.

``` ArenaTest.java```
This class contains unit tests to verify the functionality of the Player and Arena classes. It prompts the user for player attributes for testing purposes.

## Additional Information
1. Ensure you have Java 8 or higher installed.
2. If using IntelliJ IDEA, ensure that your project SDK is set correctly (File > Project Structure > Project SDK).
3. You can add more test cases in ArenaTest.java to cover different scenarios and edge cases.
4. Commit your changes frequently with meaningful commit messages to maintain a good version history.


