//Declare variables
House myHouse;

void setup(){
  size(500,400);
  background(255);
  
  myHouse = new House(width/2, height/2);
}

void draw(){   
   background(255);
   myHouse.show();
}


void mousePressed(){
  myHouse.toggleLight(); 
}

/*
  Class work
*/
class House {
   int x_pos, y_pos;
   
   int hWidth, hHeight;
   
   boolean lightOn;
   
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
