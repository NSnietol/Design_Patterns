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
package designPatterns.patterns.Creationals.Prototype;


/**
 *
 * @author ns
 */
public class Client {

    static public void main(String[] args) {
        FabricaPrototipo fac = new FabricaPrototipo();

        Carro s = new Carro("1", "2", "3");
   
        Carro test = (Carro) s.clone();
             s.setMarca("1");
   
        System.out.println(s.getMarca());     
        System.out.println(test.getMarca());

        Producto producto = (Producto) fac.create("Producto 1");

        System.out.println("Este es el objeto creado: " + producto);

        producto.setAtributo(232);
        System.out.println(producto.getAtributo());

        Producto producto2 = (Producto) fac.create("Producto 1");

        System.out.println("Este es el objeto creado: " + producto2);
    }

}
