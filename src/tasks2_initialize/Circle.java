package tasks2_initialize;
//4.Создать класс (Circle) круг, с тремя инициализаторами
public class Circle {

    private int centerX, centerY, radius, width, color;

    public void initialize(int x, int y, int r){
        this.centerX = x;
        this.centerY = y;
        this.radius = r;
    }

    public void initialize(int x, int y, int r, int w){
        this.centerX = x;
        this.centerY = y;
        this.radius = r;
        this.width = w;
    }

    public void initialize(int x, int y, int r, int w, int c){
        this.centerX = x;
        this.centerY = y;
        this.radius = r;
        this.width = w;
        this.color = c;
    }

    public static void main(String[] args) {

    }
}
