Board theBoard;
BoardItem item1;
TriangleItem tItem1;


int[][] layer = {
  {0, 255, 125, 9, 10, 15, 24, 45, 150}, 
  {100, 100, 100, 9}, 
  {0, 0, 0}, 
  {#8F2CB7}
};

void setup() {
  size(800, 600);

  theBoard = new Board(width/6, height/6, 20, 20, 20);

  item1 = new BoardItem(2, 5);
  int[][] item1Data = {{-1, 0, -1}, 
    {0, 0, 0}, 
    {-1, 0, -1}};
  item1.setData(item1Data);
  //theBoard.addItem( item1 );
  theBoard.addLayer( layer );
  
  tItem1 = new TriangleItem(1,1);
  tItem1.setData(item1Data);
  theBoard.addItem(tItem1);
}

void draw() {
  background(255);
  theBoard.show();
}

void mousePressed() {
  //mouseX, mouseY
  println(theBoard.getCell(mouseX, mouseY));
  //
  item1.updateCol(1);
}

void keyPressed() {
  
  if (key == CODED) {
    if (keyCode == UP) {
      doUpKey();
    } else if (keyCode == DOWN) {
      doDownKey();
    } else if (keyCode == LEFT) {
      doLeftKey();
    } else if (keyCode == RIGHT) {
      doRightKey();
    }
  }
}

void doUpKey(){
  item1.updateRow(-1);
  tItem1.updateRow(-1);
}

void doDownKey(){
  item1.updateRow(1);
  tItem1.updateRow(1);
}

void doLeftKey(){
  item1.updateCol(-1);
  tItem1.updateCol(-1);
}

void doRightKey(){
  item1.updateCol(1);
  tItem1.updateCol(1);
}
