
/*
  Board Class
*/
public class Board {
  
  int x_pos, y_pos;  
  int cellSize;
  int rows, cols;
  
  public Board(int x, int y, int numRows, int numCols, int cellSize ){
    x_pos = x;
    y_pos = y;
    this.cellSize = cellSize;
    rows = numRows;
    cols = numCols;
  }
  
  public void show(){
     pushMatrix();
     translate(x_pos, y_pos);
     for(int j=0; j< rows; j++){
       for(int i=0; i < cols; i++){
          int xAt = i*cellSize;
          int yAt = j*cellSize;
          
          //todo: think about what color we want
          //fill( ? )
          //stroke( ? ) //border color
          //strokeWeight( ? ) // thickness of cell border
          rect(xAt, yAt, cellSize, cellSize);
       }
     }
          
     popMatrix();
  }  
  
  public Cell getCell(int xClicked, int yClicked){
    xClicked = xClicked - x_pos;
    yClicked = yClicked - y_pos;
    
    int xAt = xClicked/cellSize;
    int yAt = yClicked/cellSize;
    
    return new Cell(yAt, xAt);
  }
}
