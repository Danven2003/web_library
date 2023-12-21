package com.danven.web_library.domain.book;

import com.danven.web_library.domain.book.Image;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ImageTest {

    private String filePathFirst = "src/test/testData/capybara.jpeg";
    private String filePathSecond = "src/test/testData/capybara2.jpeg";
    private String format = "jpeg";
    private Path pathFirst = Paths.get(filePathFirst);
    private Path pathSecond = Paths.get(filePathSecond);
    private byte[] bytesFirst;
    private byte[] bytesSecond;
    {
        try {
           bytesFirst =  Files.readAllBytes(pathFirst);
           bytesSecond = Files.readAllBytes(pathSecond);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void testCreateImage() throws IOException {
        Image image = new Image(bytesFirst, format);
        Assertions.assertArrayEquals(bytesFirst, image.getImage());
    }

    @Test
    public void testSetParameterImage(){
        Image image = new Image(bytesFirst, format);
        image.setImage(bytesSecond);
        Assertions.assertArrayEquals(bytesSecond, image.getImage());
    }




}
