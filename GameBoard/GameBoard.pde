Board theBoard;
BoardItem item1;

int[][] layer = {
          {0  , 255, 125,9,10,15,24,45,150},
          {100, 100, 100,9},
          {0  ,  0,  0},
          {#8F2CB7}
          };

void setup(){
   size(800,600);
   
   theBoard = new Board(width/6, height/6, 5, 10, 40);
   
   item1 = new BoardItem(2,5);
   int[][] item1Data = {{255 ,  0,  255},
                        {0   ,  0,    0},
                        {255 ,  0,  255}};
   item1.setData(item1Data);
   theBoard.addItem( item1 );
}

void draw(){
  background(255);
  theBoard.show();
}

void mousePressed(){
   //mouseX, mouseY
   println(theBoard.getCell(mouseX, mouseY));
   //theBoard.addLayer( layer );
   item1.updateCol(1);  
}

void keyPressed(){
  item1.updateRow(-1);
}
