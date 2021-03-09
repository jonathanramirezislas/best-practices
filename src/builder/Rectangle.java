package builder;

public class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;
    private int radioCorner;

    public Rectangle(Builder builder) {
        x = builder.x;
        y = builder.y;
        width = builder.width;
        height = builder.height;
        radioCorner = builder.radioCorner;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public int getRadioCorner() {
        return this.radioCorner;
    }
   
    
    public static class Builder {
        private int x = 0;
        private int y = 0;
        private int width;
        private int height;
        private int radioCorner = 0;


        public Rectangle build(){
            return new Rectangle(this);
        }

        public Builder(int width, int height) {
            this.width = width;
            this.height = height;
        }

        public Builder x(int value) {
            x = value;
            return this;
        }

        public Builder y(int value) {
            y = value;
            return this;
        }

        public Builder width(int value) {
            width = value;
            return this;
        }

        public Builder height(int value) {
            height = value;
            return this;
        }

        public Builder radioConer(int value) {
            radioCorner = value;
            return this;
        }

    }

}
