/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras_examen;

import java.awt.Graphics;
/**
 *
 * @author guich
 */
public class Figuras {
    public static void Circulo(Graphics g, int x, int y, int x1, int y1){
        g.drawOval(x, y, x1, y1);
    }
    
    public static void Cuadrado(Graphics g, int x, int y, int x1, int y1){
        g.drawRect(x, y, x1, y1);
    }
    
    public static void Rectangulo(Graphics g, int x, int y, int x1, int y1){
        g.drawRect(x, y, x1, y1);
    }
}
