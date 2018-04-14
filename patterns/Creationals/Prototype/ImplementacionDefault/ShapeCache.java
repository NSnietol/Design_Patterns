/**
 *
 * MIT License
 *
 * Copyright (c) 2018 Nilson Nieto López
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 * */
package designPatterns.patterns.Creationals.Prototype.ImplementacionDefault;
/**
 *
 * @author ns
 */
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ShapeCache {

    private HashMap shapeMap;

    public ShapeCache() {
        shapeMap = new HashMap();
        loadCache();
    }

    public Shape getShape(String shapeId) {

        try {

            return (Shape) ((Shape) shapeMap.get(shapeId)).clone();
        } catch (CloneNotSupportedException ex) {

            Logger.getLogger(ShapeCache.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    public boolean addShape(Shape shape) {

        return shapeMap.put(shape.getId(), shape) != null;
    }

    public void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
