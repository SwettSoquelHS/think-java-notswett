void setup(){
   size(1000,500); 
   noLoop();
   println( power(2, 3));
}

float sourceAngle = 0;

void draw(){
  drawCircle( width/2, height/2, 150); 
  print("The count is: " + count);  
  drawTree(width/6, height/2, 50, sourceAngle++);
}

float power(float base, float exponent){
  if( exponent <= 0){
    return 1.0;
  } else {
     return base * power(base, exponent-1); 
  }
}

int count = 0;

void drawCircle(float x, float y, float r ){
  count++;
  pushMatrix();
  translate(x, y);
  ellipse(0,0, r, r);
  popMatrix();
  if(r > 20){
    drawCircle( x + r/2, y + r/2, r*(.75));
    drawCircle( x + r/2, y - r/2, r*(.75));
  }
}

void drawTree(float x, float y, float length, float angle){
   pushMatrix();
   translate(x,y);
   rotate(radians(angle));
   line(0,0, length, 0);
   if(length > 5){
      drawTree(length,0, .75*length, angle + 10);
      drawTree(length,0, .75*length, angle - 10);
   }
   popMatrix();
   
}
