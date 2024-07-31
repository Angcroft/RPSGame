Sure, here's the detailed documentation for your GitHub repository in English:

```markdown
# RPSGame

RPSGame is a Java implementation of the classic Rock, Paper, Scissors game using a Command Line Interface (CLI).

## Table of Contents

- [Description](#description)
- [Installation](#installation)
- [Usage](#usage)
- [Project Structure](#project-structure)
- [Contributing](#contributing)
- [License](#license)

## Description

This project implements the Rock, Paper, Scissors game. The user plays against the computer, choosing between rock, paper, or scissors. The game follows the traditional rules:

- Rock beats scissors.
- Scissors beat paper.
- Paper beats rock.

The game runs in a loop, allowing multiple rounds until the user decides to quit.

## Installation

1. Clone the repository:

```sh
git clone https://github.com/Angcroft/RPSGame.git
```

2. Navigate to the project directory:

```sh
cd RPSGame
```

3. Compile the source code:

```sh
javac RockPaperScissors.java
```

4. Run the game:

```sh
java RockPaperScissors
```

## Usage

When you run the game, you will see a main menu with two options:

1. Play
2. Exit game

Select `1` to play. Then, choose one of the following options:

- `0` for Rock
- `1` for Paper
- `2` for Scissors

The computer will randomly generate its choice, and the result of the round will be displayed. The game will continue until you decide to exit by entering a number outside the range 0-2.

## Project Structure

The project contains the following files:

- `RockPaperScissors.java`: Contains the main game logic.
- `Interfacer.java`: Contains methods to display menus and options to the user.

```plaintext
.
├── RockPaperScissors.java
└── Interfacer.java
```

### RockPaperScissors.java

This file contains:

- The main `RockPaperScissors` class.
- The `main` method, which handles the main menu.
- The `startGame` method, which handles the game flow.
- The `getRandom` method, which generates the computer's random choice.

### Interfacer.java

This file contains:

- The `Interfacer` class with static methods to display menus:
  - `mainMenu`: Displays the main menu.
  - `selectRPS`: Displays the Rock, Paper, Scissors options.

## About the Use of this Project
This project is intended for educational purposes, but you are free to use the code for your own projects. In accordance with the MIT License, I grant everyone the freedom to use this code for any beneficial purpose.