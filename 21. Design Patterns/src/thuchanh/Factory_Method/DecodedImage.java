package thuchanh.Factory_Method;

public class DecodedImage {
    private String image;

    public DecodedImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "DecodedImage{" +
                "image='" + image + '\'' +
                '}';
    }
}
