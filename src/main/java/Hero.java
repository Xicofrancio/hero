import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.screen.Screen;

public class Hero {
    private Screen screen;
    private int x = 10;
    private int y = 10;

    public Hero(int x,int y){
        x=x;
        y=y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void draw(Screen screen) {
        this.screen.setCharacter(10, 10, TextCharacter.fromCharacter('X')[0]);
    }

    public void moveUp() {
        y--;
    }

    public void moveDown() {
        y++;
    }

    public void moveLeft() {
        x--;
    }

    public void moveRight() {
        x++;
    }
}
