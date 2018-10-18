void setup(){
  size(500,400);
  background(255);
}


House h = new House();

void draw(){   
   background(255);
   
}


/*
  Class work
*/
class House {
   int x_pos, y_pos;
   
   
   
   void drawMe( ){
     pushMatrix();
     translate(x_pos,y_pos);
     ellipse(x_pos, y_pos, 25,25);
     
     popMatrix();
   }
}
