using System;
namespace nhapThongTinNguoiDung
{
	public class timChanLe
	{
		public timChanLe()
		{
			int so;
			so = int.Parse(Console.ReadLine());
			if (so % 2 == 0)
			{
				Console.Write("So nay la so chan");
			}
			else
			{
				Console.Write("So nay la so le");
			}
		}
	}
}

