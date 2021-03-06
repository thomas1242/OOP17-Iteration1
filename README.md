# Iteration 1
First Iteration of our OOP Turn-Based Strategy Game

[Iteration 1 requirements](Iteration1_Requirements.pdf)

## Each player starts with 2 explorers and a colonist

 ![alt tag](gifs/mapDemo.gif)

## Unit movement/ Players alternating turns

 ![alt tag](gifs/gatherResource.gif)

## Units interacting with terrain

 ![alt tag](gifs/instantDeath.gif)
  
## Unit ordered to walk across map

![alt tag](gifs/farWalk.gif)
  
## Colonist creating Base

 ![alt tag](gifs/makeBase.gif)

  
#Running the Game
 1. Download the JAR file [test](https://www.google.com/) file (Java JDK must be installed) 
 2. Click on the executable, or run 'java -jar Sprint1.jar' from the command line

#Design of Game
##Futuristic/SpaceTheme

##Map(s)
In the first iteration, there is one map that is 20x20 tiles. The map is described by 4 different terrains: 
 1. FlatLand - regular movement (light purple tile)
 2. Desert - slowed down movement by -1 tiles (dark purple tile)
 3. Crater - slowed down movement by -2 tiles (gray cratered tile)
 4. Mountains - impassible by any of the Units in this first iteration (dark gray tile)
 
##Player Stats
The game presents 3 different stats, on a range from 0 - 100, to enhance gameplay:
 1. Money - assists in upkeep of units/structures
 2. Construction - assists in building new structures
 3. Technology - assists in *nothing*

##Resources
A resource is automatically picked up when an Explorer enters a tile (viewable by all):
 1. Money Bag - increases the Money stat by a random integer between 20 and 40 
 2. Moon Rocks - increases the Construction stat by a random integer between 20 and 40 
 3. Hieroglyphic Books - increases the Technology stat by a random integer between 20 and 40 

##Area Effects
An area effect is a process that is automatically triggered when a unit enters a place:
 1. Storm - takes damage to a unit at a random integer between -30 and -10 . possible in FlatLand and Crater terrain
 2. Elixir Shower - heals damage to a unit at a random integer between 20 and 30. possible in all terrains
 3. Volcanic Vent - instantly kills a unit. only possible in Crater terrain 
 
##Units
 Units have different features, and different units may only move a certain number of tiles per turn
 
##Items
 Items may be picked up by any unit that enter a tile:
  1. OneShotItem - increases the Money stat by a random integer between 15 and 30. represented by a Treasure chest 
  2. Obstacle - makes a tile permanently impassible
  
##Decal(s)
  A Decal augments the UI of the game:
   1. Skull and Crossbones - loaded to the screen when a unit dies 
   2. Red Cross - not in this iteration. no gameplay reason was decided
 
#Design
https://drive.google.com/drive/folders/0B1tlQl7ckmbka1Z2LXkyRGVVaVE
