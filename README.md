# Aim

Java project for the famous game Tetris using JSwing (for intuitive user interface)

# Description

Tetris Game which is based on objects called Tetrominoes was developed using Java(Core) and JSwing. Concept of Enumeration was employed for defining numerous shapes of Tetrominoes. Game starts with User creation, Different keys for different directions, High Score is calculated based on the number of lines that are filled by the shape.

## Language - Java (JSwing library for GUI)

### Shape.java Class

Used enumeration since enum is used since we knew that only 8 types of shape existed (fixed) which dont have any numeric/textual value

Source
http://crunchify.com/why-and-for-what-should-i-use-enum-java-enum-examples/

constructor creates Default tetromino of NoShape

setShape function
input type of Shape 
sets the shape depending on the input using the coordstable

global variable pieceShape - name of Tetrominoe Shape which has been created
getShape function
returns name of Shape

setRandomShape function makes use of Random class to generate random value
Any 1 shape will be selected (apart from NoShape)

minX function returns the minimum X co-ordinate of the Tetromino shape
minY function returns the minimum Y co-ordinate of the Tetromino shape 


