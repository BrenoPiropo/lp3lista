interface ShapeTwoD{
//atributos devem ser carregados nas outras classes uma por uma
public float getX1();
public float getX2();
public float getY1();
public float getY2();
public void setX1();
public void setX2();
public void setY1();
public void setY2();
    public float calculaDistancia();
    public abstract String toString();
    public abstract float calculaArea();
    public abstract float calculaPerimetro();
}