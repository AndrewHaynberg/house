/**
 * .
 *
 * This class was written to draw a Chistmas tree.
 * 
 * @author  Andrew Haynberg
 * @version 2018.09.16
 */
public class Picture
{
    
    private Square back;
    private Triangle tree1;
    private Triangle tree2;
    private Triangle tree3;
    private Square trunk1;
    private Square trunk2;
    private Circle o1;
    private Circle o2;
    private Circle o3;
    private Circle o4;
    private Triangle star;
    
    private Person guy;
    
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        back = new Square();
        trunk1 = new Square();
        trunk2 = new Square();
        tree1 = new Triangle();
        tree2 = new Triangle(); 
        tree3 = new Triangle(); 
        o1 = new Circle();
        o2 = new Circle();
        o3 = new Circle();
        o4 = new Circle();
        star = new Triangle();
        guy = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            back.changeSize(400);
            back.changeColor("white");
            back.makeVisible();
            
            trunk1.moveHorizontal(250);
            trunk1.moveVertical(250);
            trunk1.makeVisible();
            trunk2.moveHorizontal(250);
            trunk2.moveVertical(210);
            trunk2.makeVisible();
            
            tree1.moveHorizontal(270);
            tree1.moveVertical(150);
            tree1.makeVisible();
            
            tree2.moveHorizontal(270);
            tree2.moveVertical(100);
            tree2.makeVisible();
            
            tree3.moveHorizontal(270);
            tree3.moveVertical(50);
            tree3.makeVisible();
            
            o1.moveHorizontal(265);
            o1.moveVertical(190);
            o1.changeColor("yellow");
            o1.makeVisible();
            
            o2.moveHorizontal(270);
            o2.moveVertical(120);
            o2.changeColor("magenta");
            o2.makeVisible();
            
            o3.moveHorizontal(280);
            o3.moveVertical(220);
            o3.makeVisible();
            
            o4.moveHorizontal(250);
            o4.moveVertical(140);
            o4.changeColor("red");
            o4.makeVisible();
            
            star.moveHorizontal(270);
            star.moveVertical(40);
            star.changeColor("yellow");
            star.changeSize(25,25);
            star.makeVisible();
            
            guy.moveHorizontal(150);
            guy.moveVertical(250);
            guy.makeVisible();
            
            
            
            
            
            
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
            back.changeColor("black");
            trunk1.changeColor("black");
            trunk2.changeColor("black");
            tree1.changeColor("white");
            tree2.changeColor("white");
            tree3.changeColor("white");
            o1.changeColor("black");
            o2.changeColor("black");
            o3.changeColor("black");
            o4.changeColor("black");
            star.changeColor("black");
            guy.changeColor("white");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
            back.changeColor("white");
            trunk1.changeColor("red");
            trunk2.changeColor("red");
            tree1.changeColor("green");
            tree2.changeColor("green");
            tree3.changeColor("green");
            o1.changeColor("yellow");
            o2.changeColor("magenta");
            o3.changeColor("blue");
            o4.changeColor("red");
            star.changeColor("yellow");
            guy.changeColor("black");
    }
}
