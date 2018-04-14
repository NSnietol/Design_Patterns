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


import java.util.HashMap;

/**
 *
 * @author ns
 */
public class FabricaPrototipo {
    
    private HashMap mapaObjetos;


    public FabricaPrototipo() {
        mapaObjetos = new HashMap();
        // Se incluyen en el mapa todos los productos prototipo
        mapaObjetos.put("Producto 1", new Producto(1));
        mapaObjetos.put("CarroX", new Carro("Auto deportivo", "Camaro SS", "Chevrolet"));
    }

    public Object create() {
        return create("Producto 1");
    }

    public Object create(String nombre) {

        Producto objeto = (Producto)mapaObjetos.get(nombre);
        return objeto != null ? objeto.clone() : null;
    }
}
