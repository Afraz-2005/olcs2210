using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Tutorial
{
    class Program
    {
        static void Main(string[] args)
        {
            while(true)
            {
                Console.WriteLine("\n                                  | 1)SQUARE | 2)SQUARE ROOT | 3)CUBE | 4)CUBE ROOT|");
                Console.WriteLine("\n                                  --------------------------------------------------");
                Console.Write("\n                                            Enter Your calculator number : ");
                char calc = Convert.ToChar(Console.ReadLine());
                if (calc == '1')
                {
                    Console.Write("\n                                            Enter number : ");
                    int number = Convert.ToInt32(Console.ReadLine());
                    int squared = number * number;
                    Console.WriteLine("\n                                        " + number + " squared = " + squared);

                    Console.Write("\n                                     Do you want to continue |y/n| ? ");
                    char choice = Convert.ToChar(Console.ReadLine());
                    if (choice == 'y')
                    {
                        continue;
                    }
                    else if (choice == 'n')
                    {
                        break;
                    }
                }
                else if (calc == '2')
                {
                    Console.Write("\n                                            Enter number : ");
                    int number2 = Convert.ToInt32(Console.ReadLine());
                    double squareRoot = Convert.ToDouble(Math.Sqrt(number2));
                    Console.WriteLine("\n                                        " + number2 + " square root = " + squareRoot);
                    Console.Write("\n                                     Do you want to continue |y/n| ? ");
                    char choice = Convert.ToChar(Console.ReadLine());
                    if (choice == 'y')
                    {
                        continue;
                    }
                    else if (choice == 'n')
                    {
                        break;
                    }
                }
                else if (calc == '3')
                {
                    Console.Write("\n                                            Enter number : ");
                    int number3 = Convert.ToInt32(Console.ReadLine());
                    int cubed = number3 * number3 * number3;
                    Console.WriteLine("\n                                        " + number3 + " squared = " + cubed);
        
                    Console.Write("\n                                     Do you want to continue |y/n| ? ");
                    char choice = Convert.ToChar(Console.ReadLine());
                    if (choice == 'y')
                    {
                        continue;
                    }
                    else if (choice == 'n')
                    {
                        break;
                    }
                }
                else if (calc == '4')
                {
                    Console.Write("\n                                            Enter number : ");
                    int number4 = Convert.ToInt32(Console.ReadLine());
                    double cubeRoot = Math.Ceiling(Math.Pow(number4, (double)1/3));
                    Console.WriteLine("\n                                        " + number4 + " cube root = " + cubeRoot);
                    Console.Write("\n                                     Do you want to continue |y/n| ? ");
                    char choice = Convert.ToChar(Console.ReadLine());
                    if (choice == 'y')
                    {
                        continue;
                    }
                    else if (choice == 'n')
                    {
                        break;
                    }
                }



            }
            
        }
    }
}
