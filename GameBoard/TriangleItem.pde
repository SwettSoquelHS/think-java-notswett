public class TriangleItem extends BoardItem {

  private float rotateAngle;
  
  public TriangleItem(int rowAt, int colAt){
    super(rowAt, colAt);
    rotateAngle = 0.0;
  }
  
  public void show(int xAt, int yAt, int cellSize){
    for(int row = 0; row < glyphData.length; row++){
       for(int col = 0; col < glyphData[row].length; col++){
          int fillColor = glyphData[row][col];
          if(fillColor > -1){
            fill(fillColor);
            int x = xAt + col*cellSize + cellSize/2;
            int y = yAt + row*cellSize + cellSize/2;
            pushMatrix();  
            rectMode(CENTER);
            translate(x,y);
            rotate(radians(rotateAngle));            
            rect(0,0,cellSize,cellSize);            
            popMatrix();
          }
       }
    }
    rectMode(CORNER);
    rotateAngle += 2.01;
  }
  
}
