# DiceGameV2

This is a simple RESTful API for a game that consists of throwing two six-sided dice. If the result equals 7, the user wins; otherwise, they lose.

The API is built using Java Spring Boot and uses JSON Web Token for user registration and authentication through bearer token technology.

We used Java,Springboot, Mysql, MongoDB and Tests done in Mockito and AssertJ.

## API Endpoints

## Authentication :

### Register a User
URL: /api/auth/register Method: POST Description: Register a new user.

The request must include an email and password in JSON format. The response will include a JSON Web Token that can be used for authentication in subsequent requests.

### Authenticate User
URL: /api/auth/authenticate Method: POST Description: Authenticate an existing user.

The request must include an email and password in JSON format. The response will include a JSON Web Token that can be used for authentication in subsequent requests.

##Players:

### Add a Player
URL: /players Method: POST Description: Add a new player.

The request must include a name in JSON format. The response will include the player ID and the player name.

### Update Player
URL: /players/{id} Method: PUT Description: Update player details.

The request must include a new name in JSON format and specify the player ID in the URL. The response will include the updated player details.

## Game

###Create a Game
URL: /players/{id}/games Method: POST Description: Create a new game for a specific player.

The request will create a new game and return the game ID, the user name, the result of both dice, and a win or lose result.

### Get All Games
URL: /players/{id}/games Method: GET Description: Get all games for a specific player.

The request will return a list of all games that the player has played, including the game ID, the user name, the result of both dice, and a win or lose result.

## Ranking

### Get Best Player
URL: /players/ranking/winner Method: GET Description: Get the player with the highest success rate.

The request will return the player with the highest success rate, including the player name and the player's success rate.

### Get Worst Player
URL: /players/ranking/loser Method: GET Description: Get the player with the lowest success rate.

The request will return the player with the lowest success rate, including the player name and the player's success rate.

### Get Average Success Rate
URL: /ranking Method: GET Description: Get the average success rate of all players.

The request will return the average success rate of all players.

### Get All Players Ranked
URL: /players Method: GET Description: Get all players and their success rate.

The request will return a list of all players who have played the game, including the player name and the player's success rate.

Contributors
This app was created by Ivan Ros.
