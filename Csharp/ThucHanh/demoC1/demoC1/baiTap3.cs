using System;
namespace demoC1
{
	public class baiTap3
	{
		public baiTap3()
		{
			/*Bài tập thứ 3: Nhập 3 chữ cái và hiển thị theo chiều ngược lại*/
			string[] st = new string[3];
			for(int i=0; i < 3; i++)
			{
				Console.Write("Nhap chu cai thu " + (i + 1) + " ");
				st[i] = Console.ReadLine();
			}
			Console.Write("Hien thi nguoc nhung chu cai da nhap :");
			for (int i = 2; i >= 0; i--)
			{
				Console.Write(st[i]+", ");
			}
			Console.ReadKey();

        }
	}
}

