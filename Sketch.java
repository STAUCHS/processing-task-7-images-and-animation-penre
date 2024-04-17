import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {

  PImage imgWeirdDog;

    // x and y coordinate for meteor
    float fltWeirdDogX = 50;
    float fltWeirdDogY = 100;
  
    // meteor speed variables
    float fltXSpeed = random(1, 5);
    float fltYSpeed = random(1, 5);
  
    // define colours
    int black = color(0);
    int white = color(255);
    int magenta = color(255, 0, 255);
  
    public void settings() {
      size(400, 400);
    }
  
    public void setup() {
      background(0, 0, 0);
      // load meteor
      imgWeirdDog = loadImage("spaceMeteors_003.png");
      // resize meteor
      
      imgWeirdDog.resize(50, 50);
      
      // load missile
  
      // resize missile
  
      // load rocket
  
      // resize rocket
  
    }
  
    public void draw() {
      background(black);
  
      // draw meteor and move
      image(imgWeirdDog, fltWeirdDogX, fltWeirdDogY);
  
      fltWeirdDogX += fltXSpeed;
      fltWeirdDogY += fltYSpeed;
  
      if (fltWeirdDogX > width - imgWeirdDog.width || fltWeirdDogX < 0) {
        fltXSpeed *= -1;
      }
  
      if (fltWeirdDogY > height - imgWeirdDog.height || fltWeirdDogY < 0) {
        fltYSpeed *= -1;
      }
  
      // draw missile and move
  
  
      // draw rocket and move
  
    }
  }