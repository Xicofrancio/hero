public class Position {
    private Hero hero;
    private int x = 10;
    private int y = 10;

    public Position(int x ,int y) {
    }
    
    private void moveHero(Position position) {
        hero.setPosition(position);
    }
    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
}
