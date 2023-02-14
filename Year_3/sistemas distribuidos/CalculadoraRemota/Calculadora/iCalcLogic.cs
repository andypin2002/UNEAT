namespace Calculadora
{
    public interface iCalcLogic
    {
        float Suma(float num1, float num2);
        float Resta(float num1, float num2);
        float Multiplicacion(float num1, float num2);
        float Division(float num1, float num2);
        float Porcentaje(float num1, float perc);
        float Inverse(float num1);
        float Square(float num1);
        float Sqrt(float num1);

    }
}