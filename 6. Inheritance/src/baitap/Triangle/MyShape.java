package baitap.Triangle;

public class MyShape {
        private String color = "green";
        private boolean filled = true;

        public MyShape() {
        }

        public MyShape(String color, boolean filled) {
            this.color = color;
            this.filled = filled;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public boolean isFilled() {
            return filled;
        }

        public void setFilled(boolean filled) {
            this.filled = filled;
        }

        @Override
        public String toString() {
            return "A Shape with color of " +
                    getColor() +
                    " and " +
                    (isFilled() ? "filled" : "not filled");
        }
}
