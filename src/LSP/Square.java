package LSP;

// этот потомок выполняет те же методы, что и родительский класс,
// однако реализует их немного по-другому (у квадрата ширина и высота равны)
public class Square extends Shape {
    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width); // высота равна ширине
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height); // ширина равна высоте
    }

    // метод area без изменений, он наследуется от Shape
}