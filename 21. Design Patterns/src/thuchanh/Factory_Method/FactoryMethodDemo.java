package thuchanh.Factory_Method;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        DecodedImage decodedImage;
        ImageReader reader = null;
        String image = "abcxyz.jpeg";
        String format = image.substring(image.indexOf('.') + 1);
        if (format.equals("gif")) {
            reader = new GifReader(image);
        } else if (format.equals("jpeg")) {
            reader = new JpegReader(image);
        }
        assert reader != null;
        decodedImage = reader.getDecodedImage();
        System.out.println(decodedImage);
    }
}
