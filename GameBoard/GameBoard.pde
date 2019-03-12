Board theBoard;

void setup(){
   size(800,600);
   
   theBoard = new Board(width/6, height/6, 5, 10, 40);
}

void draw(){
  background(255);
  theBoard.show();
}

void mousePressed(){
   //mouseX, mouseY
   println(theBoard.getCell(mouseX, mouseY));
}
