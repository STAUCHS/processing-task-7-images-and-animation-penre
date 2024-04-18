import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {

  PImage imgWeirdDog;
  PImage imgTrav;

    // x and y coordinate for dog
    float fltWeirdDogX = 50;
    float fltWeirdDogY = 100;

    // x and y coordinate for cube
    float fltCubeX = 50;
    float fltCubeY = 100;
  
    // dog speed variables
    float fltXSpeed = random(1, 100);
    float fltYSpeed = random(1, 100);
    //cube speed variables
    float fltCubeXSpeed = random(1, 100);
    float fltCuveYSpeed = random(1, 100);
  
    // define colours
    int red = color(255,0,0);
  
    public void settings() {
      size(400, 400);
    }
  
    public void setup() {
      background(0, 0, 0);
      // load dog
      imgWeirdDog = loadImage("main-qimg-45ff4af92effeedae4454bc970ac2dab-lq-removebg-preview.png");
      // resize dog
      
      imgWeirdDog.resize(80, 80);
      
      
    }
    
    

    
  
    public void draw() {
      //background image;
      imgTrav = loadImage("tsfishcover.png");
      imgTrav.resize
  
      // draw dog and move
      image(imgWeirdDog, fltWeirdDogX, fltWeirdDogY);
  
      fltWeirdDogX += fltXSpeed;
      fltWeirdDogY += fltYSpeed;
  
      if (fltWeirdDogX > width - imgWeirdDog.width || fltWeirdDogX < 0) {
        fltXSpeed *= -1;
      }
  
      if (fltWeirdDogY > height - imgWeirdDog.height || fltWeirdDogY < 0) {
        fltYSpeed *= -1;
      }
      //draw a square cube 
      fill(red);
      rect(100,100,50,50);
      
      
    }
  }