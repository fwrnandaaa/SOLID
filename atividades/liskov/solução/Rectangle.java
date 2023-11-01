class Rectangle implements Shape {
    protected int width;
    protected int height;

   

    @Override
    public int calculateArea() {
        return width * height;
    }
}