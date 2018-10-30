//Declare variables
House myHouse;
House myNewHouse;


void setup(){
  size(500,400);
  background(255);
  
  //instantiate (initialize) myHouse
  myHouse = new House(width/2, height/2);
  
  myNewHouse = new House( width/5, height/4);
}

void draw(){   
   background(255);
   myHouse.show();
   myNewHouse.show();
   
}

// When the mouse is pressed
// tell the house to toggle its light
void mousePressed(){
  myHouse.toggleLight(); 
  println("my New House lights are on? " + myNewHouse.lightOn );
   println("my House lights are on? " + myHouse.lightOn );
}

/* * * * * * * 
  Class work for HOuse
* * * * * */
class House {
    // The location we'll draw the house at
   int x_pos, y_pos;
   
    //The width and height I'll use for the house
   int hWidth, hHeight;
   
    //tracks whether or not the lights are on or off
   boolean lightOn;
   
   /*
     The House constructor
     int x , x location of the house
     int y , y location of the house
     House h = new House(1,2);
   */
   House(int x, int y){
      x_pos = x;
      y_pos = y;
      hWidth = 160;
      hHeight = 100;
      lightOn = false;
   }
   
   void toggleLight(){
     lightOn = !lightOn;         
   }
      
   void show( ){
     pushMatrix();
     translate(x_pos,y_pos);
     //do the drawing work here
     fill(128);
     
     //roof
     
     //house envelope
     rect(0,-1*hHeight,hWidth,hHeight);
     
     //house door
     fill(50);
     float scaledH =0.45 *hHeight; 
     rect(40,-1.0*scaledH, .1*hWidth , scaledH);
     
     //window work
     if(lightOn){
       fill(255);
     } else {
       fill(0); 
     }
     rect(100,-40,30,30);
     
     popMatrix();
   }
}
