using System;
using System.Security.Cryptography;
using System.Text;

namespace Ejercicio6
{
    internal class Program
    {
        static void Main(string[] args)
        {
                System.Security.Cryptography.MD5 md5 = System.Security.Cryptography.MD5.Create();

                string input = "lmaoSomeData";
                byte[] inputBytes = System.Text.Encoding.ASCII.GetBytes(input);
                byte[] hashBytes = md5.ComputeHash(inputBytes);

                StringBuilder sb = new System.Text.StringBuilder();
                for (int i = 0; i < hashBytes.Length; i++)
                {
                    sb.Append(hashBytes[i].ToString("X2"));
                }
                Console.WriteLine(sb.ToString());
                Console.ReadLine();
        }
    }
}
