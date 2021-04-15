
  /*** Go to the recipe to run the demonstration before starting this program ***/
  int speed = 10;
  int x = 150+speed;
  int y = 700 + speed;
void setup() {
  /* Set the size of your sketch to be a rectangle like in the recipe demonstration */
  size(800,600);
  noFill();

  /* Call the noFill() command so all the ellipses will be transparent */
}

void draw() {
noFill();
        /* Use a for loop to make the first set of rings that will start in the left half of the window
        (you can use the code from your Bullseye program).*/          
  for(int i =0;i<20;i++){
     ellipse(x,250,250-i*13, 250-i*13);
    if(i % 2 == 0){
     fill(255,0,0);
    }
    else{
      fill(0,0,128);
    }
  }
        x = x+speed;
        /*Make this set of rings move across the sketch to the right 
        Hint: make two variables, one for x and another for the speed. 
        Then increase x by the amount in speed */
 
        
        /*When the rings reach the right side of the sketch, reverse the direction so they move
        Hint: speed = -speed */
        if(x==700){
     speed = -speed;
        }
        /*When the rings reach the left side of the sketch, reverse the direction again */
        if(x==100){
         speed = -speed;
        }
 //CHALLENGE - to finish the Amazing Rings 
 for(int j =0;j<10;j++){
   ellipse(y,250,250-j*13, 250-j*13);
  if(j % 2 == 0){
    fill(255,0,0);
   }
   else{
     fill(0,0,128);
   }
 }
 y=y-speed;

 
 
 
        /*Add another for loop to draw the second set of rings that will start in the right half of the window */
        
        
        /*Make this set of rings move in the opposite direction to the other rings 
        These rings must also "bounce" off the sides of the window.*/
}
