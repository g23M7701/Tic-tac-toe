# Tic-tac-toe
Building a tic-tac-toe game so anyone can play it without wasting paper. 

Group name: Brocode

Group members: Mutsila Humbulani(g23m7701), Mudimbu Justin(g23m3498), Hendricks Dustin(g23h9955)

Group mentor: N/A

Project title: TIC TAC TOE

Project page: https://github.com/g23M7701/Tic-tac-toe.git

Instructions for use (allowable actions): 
RUNNING THE TIC TAC TOE GAME:
                                          
1. ENVIRONMENT SETUP: Ensure that you have the Android Studio development environment set up on your computer.
2. IMPORT PROJECT: Open Android Studio and import the Tic Tac Toe project into the workspace.
3. CONNECT ANDROID DEVICE: Connect an Android device to your computer via USB, or use an Android emulator if preferred and make sure that usb  
debugging is selected.
4. BUILD AND RUN: Build the project by clicking the "Build" option in the Android Studio menu, then select "Run" to deploy the game on your                                               android device or emulator.
5. LAUNCHING THE GAME: The Tic Tac Toe game should launch automatically on your android device. If it doesn't, you can fnd and tap the app icon                                           in the app drawer to start the game.

INTERACTING WITH THE GAME:

1. GAME SCREEN: Upon launching the game, you'll be presented with the TIC TAC TOE game screen.
2. PLAYER SCORES: At the top of the screen, you can see two text views labeled "Player 1" and "Player 2". These display the scores of the two                                                players.
3. GAME BOARD: The main part of the screen contains a 3x3 grid of buttons representing the Tic Tac Toe game board. Player 1 is represented by                                                "X," and Player 2 is represented by "O."
4. GAMEPLAY: Follow these steps to play the game:
                                                  Tap on Empty Cells: To make a move, simply tap on an empty cell (button) on the game board.
                                                  Player Turns: The game alternates between Player 1 and Player 2. Player 1 starts.
                                                  Winning Moves: If a player wins the game, a message will display, indicating the winner. The                                                                                                             respective player's score will also increase.
                                                  
5. RESET BUTTON: To start a new game or reset the current game, tap the "Reset" button at the bottom of the screen. This button will clear the                                               game board and reset the scores.
6. PLAY AGAIN BUTTON: If you wish to start a new game without resetting the scores, tap the "Play Again" button. This action clears the game                                                 board for a new round.
7. GAME STATUS: The bottom text view labeled "Status" displays game status messages, such as "Player-1 has won" or "No Winner."

Tools used: The provided code for the Tic Tac Toe Android game doesn't appear to rely on external
            libraries or tools. It primarily utilizes standard Android development components and
            features, including UI elements and event handling provided by Android Studio and the
            Android SDK. Therefore, there are no specifc external libraries or tools imported for this
            project.

Concepts used: 
A. USER INTERFACE(UI):
The game utilizes Android's UI components to create a user-friendly interface. Buttons
represent the game board, and text views display player scores and game status.

B.EVENT HANDLING:
Event handling is implemented through the View.OnClickListener interface, where
button clicks are detected and processed. It is used to place X or O on the game board.

C. CONDITIONAL STATEMENTS:
Conditional statements, specifcally if-else, are employed to determine the game's state.
They are used to check for a win, a draw, or continue the game based on player moves.  

D. ARRAYS:
Arrays are used to represent the game board ( gameState ) and winning positions
( winningPositions ). These arrays are crucial for tracking the state of each cell and
checking for a win.

E. LOOPS:
A loop is used for iterating through the game board (buttons) to attach
OnClickListener to each button and for resetting the game board.

F. FUNCTIONS(CUSTOM METHODS):
Custom methods/functions are created to handle various aspects of the game, such as
checking for a win ( checkWinner() ), updating player scores
( updatePlayerScore() ), and resetting the game ( playAgain() ).

I. VARIABLES:
Variables are used to store and update game-related data, including the current player's
turn ( playerOneActive ), the number of rounds played ( rounds ), and player scores
( playerOneScoreCount and playerTwoScoreCount ).

J. CONTROL FLOW STRUCTURES:
Control flow structures are used to determine the game's progression, including switching between player turns and displaying game results.

Assumptions: The Tic Tac Toe game is designed for Android devices with touchscreen support, assuming users are familiar with the basic rules of Tic Tac Toe.
             It is intended for local multiplayer gameplay, with two players taking turns on the same device.

Limitations: The game lacks an AI opponent, making it playable only by two human players.
             It does not support online multiplayer or remote gameplay.
             There is no feature for saving or loading game progress; game progress is reset upon closing the app.
             The user interface is basic and lacks animations, focusing primarily on core gameplay.
             Accessibility features for users with disabilities have not been implemented in this version.
