import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {

  PImage imgWeirdDog;
  PImage imgBack;

  // x and y coordinate for dog
  float fltWeirdDogX = 38;
  float fltWeirdDogY = 100;

  // x and y coordinate for cube
  float fltCubeX = 50;
  float fltCubeY = 100;
  float fltCubeWidth = 50;
  float fltCubeHeight = 50;
  float fltAngle = 0;
  float fltRadius = 100;
  double dblAnglerSpeed = 0.05;

  // x and y coordinate for background
  float fltBackX = 0;
  float fltBackY = 0;
  
  // dog speed variables
  float fltXSpeed = random(1, 5);
  float fltYSpeed = random(1, 5);
  
  // define cube colours
  int purple = color(128,0,128);
  
  public void settings() {
    size(400, 400);
  }
  
  public void setup() {

    //clear out old frames
    background(0, 0, 0);

    // load dog
    imgWeirdDog = loadImage("main-qimg-45ff4af92effeedae4454bc970ac2dab-lq-removebg-preview.png");

    // resize dog
    imgWeirdDog.resize(80, 80);

    //load background
    imgBack = loadImage("251f49b9061e3ef0b3a862135258f151.png");

    //resize background
    imgBack.resize(400,400);
  }
    
  public void draw() {
      
    //background image;
    image(imgBack,fltBackX,fltBackY);

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
     
    //draw a square cube and move in a circle
    fill(purple);
    rect(fltCubeX, fltCubeY, fltCubeWidth, fltCubeHeight);

    fltCubeX = width/2 + fltRadius * cos(fltAngle);
    fltCubeY = height/2 + fltRadius * sin(fltAngle);
    fltAngle += dblAnglerSpeed;
      
      
  }
}
  