using System;
namespace baiTapTuan2
{
	public class hienThiMenu
	{
		public hienThiMenu()
		{
            int a, b;
            String dau = "";
            Console.Write("Nhap so thu nhat: ");
            a = int.Parse(Console.ReadLine());
            Console.Write("Nhap so thu 2: ");
            b = int.Parse(Console.ReadLine());
            Console.Write("Ban muon phep tinh mo (+,-,*,/): ");
            dau = Console.ReadLine();
            Console.Write("Ket qua la: ");
            switch (dau)
            {
                case "+":
                    Console.Write(a + b);
                    break;
                case "-":
                    Console.Write(a - b);
                    break;
                case "*":
                    Console.Write(a * b);
                    break;
                case "/":
                    Console.Write(a / b);
                    break;
            }
        }
	}
}

